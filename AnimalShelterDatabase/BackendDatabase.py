# This is the main database support for the animal shelter data
# The main function is to CREATE, READ, UPDATE and DELETE
# Enhanced for cs 499
# Problems with the old code.
# 1 Slow database functions. FIX rebuilt the CRUD functions for database navigation. Added variables to store user queue data.
# 2 No account/password support to protect the data. FIX added password to support to backend.
# Trenton Frey 10/13/2022

from pymongo import MongoClient
from bson.objectid import ObjectId

# Store values for database functions. This speeds of the results of using database functions

userCreateData = {}   #houses input data for write function
userSearchTarget = {}  #houses target data for search function
userUpdateFromTarget = {}  #houses update data for update function
userUpdateToTarget = {}  #houses update data for update function
userDeleteTarget = {}  #houses delete data for delete function



class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """
# backend function for password support, changed for cs499.
    def __init__(self, username=None, password=None):
        # Initializing the MongoClient. This helps to 
        # access the MongoDB databases and collections. 
        if username and password:
            self.client = MongoClient('mongodb://%s:%s@localhost:52320' % (user, password))
        else:
            self.client = MongoClient('mongodb://localhost:52320')
        self.database = self.client['project']

# Complete this create method to implement the C in CRUD.
# Enhanced for cs-499
    def create(self, data):
          #use try/except block for boolean processing
        try:
            if data is not None:
               
                insert_result = self.database.animals.insert_one(data)     # data should be dictionary
                pprint(insert_result)
                
                return True    # return value for boolean requirement
            
            else:
                # lets the user know something went wrong
                raise Exception("Nothing to save")
        except:
            
            return False     #return value for boolean requirement
    
    
    # Create method to implement the R in CRUD.
    # Enhanced for cs-499
    def read(self,criteria=None):

      
        for i in range(1):
            key = input("Enter search key: ")
            value = input("Enter search value: ")
            userSearchTarget.update({key: value})
            # holding the user search speeds up the process
               
        
       #U in crud 
    # Update method. This has been changed to support faster speeds for cs-499.
    def update(self, fromTarget, toTarget, count):
        
           if fromTarget is not None:
            if count == 1:
                update_result = self.database.animals.update_one(fromTarget, toTarget)
                pprint("Matched Count: " + str(update_result.matched_count) + ", Modified Count: " + str(update_result.modified_count))
                if update_result.modified_count == 1:
                    print("Success!")
                    print(update_result)
                    return True
                else:
                    print("Something went wrong")
                    return False
            elif count == 2:
                update_result = self.database.animals.update_many(fromTarget, toTarget)
                pprint("Matched Count: " + str(update_result.matched_count) + ", Modified Count: " + str(update_result.modified_count))
                if update_result.modified_count == update_result.matched_count:
                    print("Success!")
                    print(update_result)
                    return True
                else:
                    print("Something went wrong")
                    print(update_result)
                    return True
            else:
                print("Count not recognized")
                return False
        else:
            #lets the user know there was a problem
            raise Exception("Nothing to update")
            return False
        
       
                    
           

    #d in crud
    # Delete function works as expected. Did not change for cs-499
    def obtainDeleteData(self):
        #key
        for i in range(1):
            key = input("Enter delete key: ")
            value = input("Enter delete value: ")
            userDeleteTarget.update({key: value})
    #delete 
    def deleteData(self, target, count):
        if target is not None:
            if count == 1:
                try:
                    delete_result = self.database.animals.delete_one(target)
                    pprint("Count- " + str(delete_result.deleted_count))
                    if delete_result.deleted_count == 0:
                        
                        print(delete_result)
                        return True
                    else:
                        
                        print(delete_result)
                        return True
                except Exception as e:
                    
            
            return False
