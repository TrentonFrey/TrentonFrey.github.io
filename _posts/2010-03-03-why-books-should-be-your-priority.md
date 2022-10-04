---
date: 2022-10-01 12:26:40
layout: post
title: Enhancement One Software Design and Engineering.
subtitle: 'This enhancment is on my CS-330 final project.'
description: A 3D scene wrote in c# using OpenGL.
image: https://res.cloudinary.com/dm7h7e8xj/image/upload/v1559820489/js-code_n83m7a.jpg
optimized_image: https://res.cloudinary.com/dm7h7e8xj/image/upload/c_scale,w_380/v1559820489/js-code_n83m7a.jpg
category: Enhancment
tags:
  - Software Design
  - Engineering
author: Trenton Frey
paginate: true
---

### Enhancments Made

* Multi-texture support.
* Ability to load external object files.
* Reworked commenting standards throughout code.

#### Project Narrative
  The artifact I am using for milestone two is my final project from my cs 330 class. This project we used openGL to create a three dimensional scene.  This project was one of the hardest I have ever had to do. I spent so much time working on this and it took a lot of effort. This is the main reason why I wanted to implement this for my artifact. I was not happy with the state of the project when I submitted it in cs330. I was only able to implement one texture for the objects. This gave me a clear way to enhance this project for the artifact. I used two textures this time around and using a library I was able to load files into the program rather than just create the object within the program main file.
  
  The enhancments I made to this aligin perfeclty with two course outcomes. These include, demonstrate an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals. Along side Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science.
  
  My big enhacment to this was the ability to load in more than one texture and build 3D models using external object files. This change cleaned up the code significantly while enhancing the usability. The next enhacment was made to the commenting standard throughout the code. This change significantly increased readability and the professional look of the code.
  
  This artifact was more of a pain than I originally thought it was going to be. Unfortunately nothing in life is as smooth sailing as we would like. My first problem came in the form of a lost solution file. This was a big problem and caused me a ton of time to be wasted. I had all the other necessary files to edit, but without the solution file visual studio would not debug. I had to rebuild from the ground up, making sure to include all directories and opengl libraries. After the base project was fixed, I was able to start on my enhancements. The main thing I learned while creating the enhancement for the artifact was “expect the unexpected”. Every step I took, felt like it put me five steps back. 
  



## Before enhacment

This my old method for creating my 3D objects.

```c#
void UCreateMesh(GLMesh& mesh)
{
    // Position and Color data
    GLfloat verts[] = {
        //Positions          //Normals
        // --------------------------------------
        //Back Face          //Negative Z Normals
        

        //Locatons          lighting    
        //Desk
        -2.5f, -1.1f, -0.1f, 0.0f, 0.0f,-1.0f, 0.0f,0.0f,
         2.5f, -1.1f, -0.1f, 1.0f, 0.0f,-1.0f, 0.2f,0.0f,
         2.5f,  1.1f, -0.1f, 1.0f, 1.0f,-1.0f, 0.2f,0.2f,
         2.5f,  1.1f, -0.1f, 1.0f, 1.0f, 0.0f, 0.2f, 0.2f,
        -2.5f,  1.1f, -0.1f, 0.0f, 1.0f,0.0f, 0.0f,0.2f,
        -2.5f, -1.1f, -0.1f, 0.0f, 0.0f,0.0f, 0.0f, 0.0f, 
        //bottom of desk
        -2.5f, -1.1f,  0.1f, 0.0f, 0.0f,1.0f, 0.0f,0.0f,
         2.5f, -1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
         2.5f,  1.1f,  0.1f, 1.0f, 1.0f,1.0f, 0.2f,0.2f,
         2.5f,  1.1f,  0.1f, 1.0f, 1.0f,1.0f, 0.2f,0.2f,
        -2.5f,  1.1f,  0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
        -2.5f, -1.1f,  0.1f, 0.0f, 0.0f,1.0f, 0.0f,0.0f,
        //left side of desk
        -2.5f,  1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
        -2.5f,  1.1f, -0.1f, 1.0f, 1.0f,1.0f, 0.2f,0.2f,
        -2.5f, -1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
        -2.5f, -1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
        -2.5f, -1.1f,  0.1f, 0.0f, 0.0f,1.0f, 0.0f,0.0f,
        -2.5f,  1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
        //right side of desk
         2.5f,  1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
         2.5f,  1.1f, -0.1f, 1.0f, 1.0f,1.0f, 0.2f,1.0f,
         2.5f, -1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
         2.5f, -1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
         2.5f, -1.1f,  0.1f, 0.0f, 0.0f,1.0f, 0.0f,0.0f,
         2.5f,  1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
        //front side
       -2.5f, -1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
        2.5f, -1.1f, -0.1f, 1.0f, 1.0f,1.0f, 0.2f,0.2f,
        2.5f, -1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
        2.5f, -1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
       -2.5f, -1.1f,  0.1f, 0.0f, 0.0f,1.0f, 0.0f,0.0f,
       -2.5f, -1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
        //back side
        -2.5f,  1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
         2.5f,  1.1f, -0.1f, 1.0f, 1.0f,1.0f, 0.2f,0.2f,
         2.5f,  1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
         2.5f,  1.1f,  0.1f, 1.0f, 0.0f,1.0f, 0.2f,0.0f,
        -2.5f,  1.1f,  0.1f, 0.0f, 0.0f,1.0f, 0.0f,0.0f,
        -2.5f,  1.1f, -0.1f, 0.0f, 1.0f,1.0f, 0.0f,0.2f,
        //////////////////////////////////////////////////////
        //Monitor top
       -0.5f, -0.5f,  1.0f,  0.0f,  0.0f,  1.0f,  0.0f, 0.0f,
       0.5f, -0.5f,  1.0f,  0.0f,  0.0f,  1.0f,  0.5f, 0.0f,
       0.5f,  0.5f,  1.0f,  0.0f,  0.0f,  1.0f,  0.5f, 0.5f,
       0.5f,  0.5f,  1.0f,  0.0f,  0.0f,  1.0f,  0.5f, 0.5f,
      -0.5f,  0.5f,  1.0f,  0.0f,  0.0f,  1.0f,  0.0f, 0.5f,
      -0.5f, -0.5f,  1.0f,  0.0f,  0.0f,  1.0f,  0.0f, 0.0f,

        //left side
      -0.5f,  0.5f,  1.0f, -1.0f,  0.0f,  0.0f,  0.5f, 0.0f,
       -0.5f,  0.5f, -0.0f, -1.0f,  0.0f,  0.0f,  0.5f, 0.5f,
       -0.5f, -0.5f, -0.1f, -1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
       -0.5f, -0.5f, -0.1f, -1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
       -0.5f, -0.5f,  1.0f, -1.0f,  0.0f,  0.0f,  0.0f, 0.0f,
       -0.5f,  0.5f,  1.0f, -1.0f,  0.0f,  0.0f,  0.5f, 0.0f,

       //right side
       0.5f,  0.5f,  1.0f,  1.0f,  0.0f,  0.0f,  0.5f, 0.0f,
       0.5f,  0.5f, -0.1f,  1.0f,  0.0f,  0.0f,  0.5f, 0.5f,
       0.5f, -0.5f, -0.1f,  1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
       0.5f, -0.5f, -0.1f,  1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
       0.5f, -0.5f,  1.0f,  1.0f,  0.0f,  0.0f,  0.0f, 0.0f,
       0.5f,  0.5f,  1.0f,  1.0f,  0.0f,  0.0f,  0.5f, 0.0f,

       //front
        -0.5f, -0.5f, -0.1f,  0.0f, -1.0f,  0.0f,  0.0f, 0.5f,
        0.5f, -0.5f, -0.1f,  0.0f, -1.0f,  0.0f,  0.5f, 0.5f,
        0.5f, -0.5f,  1.0f,  0.0f, -1.0f,  0.0f,  0.5f, 0.0f,
        0.5f, -0.5f,  1.0f,  0.0f, -1.0f,  0.0f,  0.5f, 0.0f,
       -0.5f, -0.5f,  1.0f,  0.0f, -1.0f,  0.0f,  0.0f, 0.0f,
       -0.5f, -0.5f, -0.1f,  0.0f, -1.0f,  0.0f,  0.0f, 0.5f,

    
      
          //Computer
         //side  length hight
        -2.5f,  0.5f,  1.5f,  0.0f,  0.0f,  1.0f,  0.0f, 0.0f,
        -1.5f,  0.5f,  1.5f,  0.0f,  0.0f,  1.0f,  0.5f, 0.0f,
        -1.5f,  1.0f,  1.5f,  0.0f,  0.0f,  1.0f,  0.5f, 0.5f,
        -1.5f,  1.0f,  1.5f,  0.0f,  0.0f,  1.0f,  0.5f, 0.5f,
        -2.5f,  1.0f,  1.5f,  0.0f,  0.0f,  1.0f,  0.0f, 0.5f,
        -2.5f,  0.5f,  1.5f,  0.0f,  0.0f,  1.0f,  0.0f, 0.0f,

        //Left Face          //Negative X Normal
         -1.5f,  1.0f,  1.5f, -1.0f,  0.0f,  0.0f,  0.5f, 0.0f,
         -1.5f,  1.0f, -0.0f, -1.0f,  0.0f,  0.0f,  0.5f, 0.5f,
         -1.5f,  0.5f, -0.1f, -1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
         -1.5f,  0.5f, -0.1f, -1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
         -1.5f,  0.5f,  1.5f, -1.0f,  0.0f,  0.0f,  0.0f, 0.0f,
         -1.5f,  1.0f,  1.5f, -1.0f,  0.0f,  0.0f,  0.5f, 0.0f,

        //Right Face         //Positive X Normal
          -2.5f,  1.0f,  1.5f,  1.0f,  0.0f,  0.0f,  0.5f, 0.0f,
          -2.5f,  1.0f, -0.1f,  1.0f,  0.0f,  0.0f,  0.5f, 0.5f,
          -2.5f,  0.5f, -0.1f,  1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
          -2.5f,  0.5f, -0.1f,  1.0f,  0.0f,  0.0f,  0.0f, 0.5f,
          -2.5f,  0.5f,  1.5f,  1.0f,  0.0f,  0.0f,  0.0f, 0.0f,
          -2.5f,  1.0f,  1.5f,  1.0f,  0.0f,  0.0f,  0.5f, 0.0f,

        //Bottom Face        //Negative Y Normal
          -2.5f, 0.5f, -0.1f,  0.0f, -1.0f,  0.0f,  0.0f, 0.5f,
          -1.5f, 0.5f, -0.1f,  0.0f, -1.0f,  0.0f,  0.5f, 0.5f,
          -1.5f, 0.5f,  1.5f,  0.0f, -1.0f,  0.0f,  0.5f, 0.0f,
          -1.5f, 0.5f,  1.5f,  0.0f, -1.0f,  0.0f,  0.5f, 0.0f,
          -2.5f, 0.5f,  1.5f,  0.0f, -1.0f,  0.0f,  0.0f, 0.0f,
          -2.5f, 0.5f, -0.1f,  0.0f, -1.0f,  0.0f,  0.0f, 0.5f,

        //Top Face           //Positive Y Normal
         -2.5f,  1.0f,  -0.1f,  0.0f,  1.0f,  0.0f,  0.0f, 0.5f,
         -1.5f,  1.0f, -0.1f,  0.0f,  1.0f,  0.0f,  0.5f, 0.5f,
         -1.5f,  1.0f,  1.5f,  0.0f,  1.0f,  0.0f,  0.5f, 0.0f,
         -1.5f,  1.0f,  1.5f,  0.0f,  1.0f,  0.0f,  0.5f, 0.0f,
         -2.5f,  1.0f,  1.5f,  0.0f,  1.0f,  0.0f,  0.0f, 0.0f,
         -2.5f,  1.0f, -0.1f,  0.0f,  1.0f,  0.0f,  0.0f, 0.5f,
    
    };
```

<!--page-->

Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa.

## Lists

Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aenean lacinia bibendum nulla sed consectetur. Etiam porta sem malesuada magna mollis euismod. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.

* Praesent commodo cursus magna, vel scelerisque nisl consectetur et.
* Donec id elit non mi porta gravida at eget metus.
* Nulla vitae elit libero, a pharetra augue.

Donec ullamcorper nulla non metus auctor fringilla. Nulla vitae elit libero, a pharetra augue.

1. Vestibulum id ligula porta felis euismod semper.
2. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
3. Maecenas sed diam eget risus varius blandit sit amet non magna.

<!--page-->

Cras mattis consectetur purus sit amet fermentum. Sed posuere consectetur est at lobortis.

Integer posuere erat a ante venenatis dapibus posuere velit aliquet. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Nullam quis risus eget urna mollis ornare vel eu leo.

## Images

Quisque consequat sapien eget quam rhoncus, sit amet laoreet diam tempus. Aliquam aliquam metus erat, a pulvinar turpis suscipit at.

![placeholder](https://placehold.it/800x400 "Large example image")
![placeholder](https://placehold.it/400x200 "Medium example image")
![placeholder](https://placehold.it/200x200 "Small example image")

## Tables

Aenean lacinia bibendum nulla sed consectetur. Lorem ipsum dolor sit amet, consectetur adipiscing elit.

<table>
  <thead>
    <tr>
      <th>Name</th>
      <th>Upvotes</th>
      <th>Downvotes</th>
    </tr>
  </thead>
  <tfoot>
    <tr>
      <td>Totals</td>
      <td>21</td>
      <td>23</td>
    </tr>
  </tfoot>
  <tbody>
    <tr>
      <td>Alice</td>
      <td>10</td>
      <td>11</td>
    </tr>
    <tr>
      <td>Bob</td>
      <td>4</td>
      <td>3</td>
    </tr>
    <tr>
      <td>Charlie</td>
      <td>7</td>
      <td>9</td>
    </tr>
  </tbody>
</table>

<!--page-->

Nullam id dolor id nibh ultricies vehicula ut id elit. Sed posuere consectetur est at lobortis. Nullam quis risus eget urna mollis ornare vel eu leo.










