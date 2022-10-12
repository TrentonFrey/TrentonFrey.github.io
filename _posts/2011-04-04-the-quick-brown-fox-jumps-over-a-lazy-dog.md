---
date: 2022-10-02 12:26:40
layout: post
title: Enhancement Two Algorithms and Data Structure.
subtitle: This enhancment is on my CS-320 final project.
description: Mobile appointment software with automated testing.
image: https://res.cloudinary.com/dm7h7e8xj/image/upload/v1559820489/js-code_n83m7a.jpg
optimized_image: https://res.cloudinary.com/dm7h7e8xj/image/upload/c_scale,w_380/v1559820489/js-code_n83m7a.jpg
category: Enhancment
tags:
  - Algorithms
  - Data Structures
author: Trenton Frey
paginate: true
---

### Enhancments Made

* Workflow feature added.
* Workflow feature automated testing added.
* Reworked commenting standards throughout code.
* Updated README file.

#### Project Narrative

  The artifact I am using for milestone three is my final project from my cs 320 class. The goal of this  project was to create a mobile appointment software. The original features requested were to take inputs from the user for contact information, appointment information and task information. I also created automated testing to test the features implemented.

  I decided to use this for my second artifact for a few different reasons. The main reason being I enjoyed this project alot and felt I did well on meeting the “customer” requirements. This project I felt really mirrors a real world experience as well. The implementation of user inputs and storing them in lists and arrays really stood out to me for this enhancement. The use of them throughout the entire program highlights this perfectly. I did a handful of enhancements on this artifact. The first enhancement needed I noticed very quickly in my code review video is an extreme lack of comments throughout the code. This was addressed and all files are commented to a set standard. The next enhancement I wanted to add a feature to this software. This is a workflow feature to add work items to the software. With this we can add work items using an id, name and a description. This is aimed to be a productivity product. This feature allows you to add,delete and update workflow items. I also created automated testing to test this new feature. Lastly I updated my readme file to reflect the changes.
  
  The enhancments I made align perfectly with two course outcomes. These outcomes include, Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices (data structures and algorithms). I achevied this by my enhcnament of the added workflow feature. This utilizes algorithms to ensure the automated testing is correct. I aslo use a few different data structures to hold user inputs. The other course outcome is Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science. This was achevied by my commenting standard change and updated the readme file.
  
#### Example of automated tests
```java

 //Test for adding a workflow item
	   public boolean addWork(Work work) {
	       
	        int index = getIndex(work);

	        
	        if (index < 0 && validateID(work.getId()) && validateName(work.getName()) && validateDescription(work.getDescription())) {
	            work.add(work);
	            return true;
	        }
	        
	        return false;
	    }
	   
	   //Test to delete existing workflow item
	   public void deleteWork(String id) {
	        
	        int index = getIndex(new Work(id, "", ""));
	        
	        
	        if (index >= 0)
	            work.remove(index);
	    }
	   
	   
	   //Test to update existing workflow item
	   public void update(Work work) {
	        for (Work obj : work) {
	            if (obj.equals(work) && validateName(work.getName()) && validateDescription(work.getDescription())) {
	                obj.setName(work.getName());
	                obj.setDescription(work.getDescription());
	            }
	        }
	    }



  
```

<!--page-->
  
  
  While I was creating this enhancement it actually went very smooth which is unexpected in this field. The planning process was a big reason for this. Having a layout and peusudo code kept me on track with the enhancement. This did take me longer than I would have wanted to spend though. This was a pretty big addition and took time to complete but I wanted to add everything I originally set in module 1. The main thing I learned while creating this enhancement is to maybe scale back a design to meet time requirements better. 
  
<a href="https://github.com/TrentonFrey/TrentonFrey.github.io/tree/master/MobileApportmentSoftware">Link to Enhanced Mobile Appointment Software </a>

<a href="https://github.com/TrentonFrey/TrentonFrey.github.io/tree/master/cs-320-main(OLD)">Link to the Original Mobile Appointment Software </a>






