from pymongo import MongoClient
from bson.objectid import ObjectId

class AnimalShelter(object):
    """ CRUD operations for Animal collection in MongoDB """
  
 # Complete this create method to implement the C in CRUD.
    def create(self, data):
        if data is not None:
            insert = self.database.animals.insert(data)  # data should be dictionary 
            if insert!=0:
                return True
            else:
                return False           
        else:
            raise Exception("Nothing to save, because data parameter is empty")


    # Create method to implement the R in CRUD.
    def read(self,criteria=None):

      
        if criteria:
               
            
            data = self.database.animals.find(criteria,{"_id":False})
        else:
         
            data = self.database.animals.find( {} , {"_id":False})

        return data
        
        
        
        
        
       #U in crud 
    def update(self, fromTarget, toTarget, count):
        if fromTarget is not None:
            if count == 1:
                update_result = self.database.animals.update_one(fromTarget, toTarget)
                pprint("Count- " + str(update_result.matched_count) + ", Count- " + str(update_result.modified_count))
                if update_result.modified_count == 1:
                    
                    print(update_result)
                    return True
                    
                else:
                   
                    return False
                    
           

    #d in crud
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
