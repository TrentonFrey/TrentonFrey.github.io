---
date: 2022-10-08 12:26:40
layout: post
title: Enhancement One Software Design and Engineering.
subtitle: 'This enhancment is on my CS-330 final project.'
description: A 3D scene wrote in c++ using OpenGL.
image: https://res.cloudinary.com/dm7h7e8xj/image/upload/v1559820489/js-code_n83m7a.jpg
optimized_image: https://res.cloudinary.com/dm7h7e8xj/image/upload/c_scale,w_380/v1559820489/js-code_n83m7a.jpg
category: Enhancment One
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
  The artifact I am using for milestone two is my final project from my cs 330 class. This project we used openGL to create a three dimensional scene.  This project was one of the hardest I have ever had to do. I spent so much time working on this and it took a lot of effort. This is the main reason why I wanted to implement this for my artifact. I was not happy with the state of the project when I submitted it in CS-330. I was only able to implement one texture for the objects. This gave me a clear way to enhance this project for the artifact. I used two textures this time around and using a library I was able to load files into the program rather than just create the object within the program main file.
  
  The enhancments I made to this aligin perfeclty with two course outcomes. These include, demonstrate an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals. Along side Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science.
  
  My big enhacment to this is the ability to load in more than one texture and build 3D models using external object files. This change cleaned up the code significantly while enhancing the usability. The next enhacment was made to the commenting standard throughout the code. This change significantly increased readability and the professional look of the code.
  
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


## After enhacment

This my new method for creating my 3D objects utilzing the object loader.


```c#
// Implements the UCreateMesh function
//Using the objectloader to load in differnt objects.
//Grab the 3d object object files.
//Big change here. No longer building line by line from a vertex table
void UCreateMesh(GLMesh& mesh)
{
    std::vector<glm::vec3> vertices;
    std::vector<glm::vec2> uvs;
    std::vector<glm::vec3> normals;

    loadOBJ("table.obj", vertices, uvs, normals);
    mesh.lengthOfObjects[0] = vertices.size();
    loadOBJ("top.obj", vertices, uvs, normals);
    mesh.lengthOfObjects[1] = vertices.size() - mesh.lengthOfObjects[0];
   

    const GLuint normalsPerVertex = 3;
    const GLuint floatsPerVertex = 3;
    const GLuint floatsPerUV = 2;

    mesh.nVertices = vertices.size();

    glGenVertexArrays(1, &mesh.vao); // we can also generate multiple VAOs or buffers at the same time
    glBindVertexArray(mesh.vao);

    //Create UV VBO
    glGenBuffers(1, &mesh.uvBuffer);
    glBindBuffer(GL_ARRAY_BUFFER, mesh.uvBuffer); // Activates the buffer
    glBufferData(GL_ARRAY_BUFFER, uvs.size() * sizeof(glm::vec2), &uvs[0], GL_STATIC_DRAW);

    //Create normal VBO
    glGenBuffers(1, &mesh.normalBuffer);
    glBindBuffer(GL_ARRAY_BUFFER, mesh.normalBuffer); // Activates the buffer
    glBufferData(GL_ARRAY_BUFFER, normals.size() * sizeof(glm::vec3), &normals[0], GL_STATIC_DRAW);

    //Create VBO
    glGenBuffers(1, &mesh.vbo);
    glBindBuffer(GL_ARRAY_BUFFER, mesh.vbo); // Activates the buffer
    glBufferData(GL_ARRAY_BUFFER, vertices.size() * sizeof(glm::vec3), &vertices[0], GL_STATIC_DRAW);

    // Strides between vertex coordinates
    GLint stride = 0;

    // Create Vertex Attribute Pointers
    glVertexAttribPointer(0, floatsPerVertex, GL_FLOAT, GL_FALSE, stride, 0);
    glEnableVertexAttribArray(0);

    // Create Normal Attribute Pointers
    glEnableVertexAttribArray(1);
    glBindBuffer(GL_ARRAY_BUFFER, mesh.normalBuffer);
    glVertexAttribPointer(1, normalsPerVertex, GL_FLOAT, GL_FALSE, stride, 0);

    // Create UV Attribute Pointers
    glEnableVertexAttribArray(2);
    glBindBuffer(GL_ARRAY_BUFFER, mesh.uvBuffer);
    glVertexAttribPointer(2, floatsPerUV, GL_FLOAT, GL_FALSE, stride, 0);
```

<!--page-->




<a href="https://github.com/TrentonFrey/TrentonFrey.github.io/tree/master/3D_Scene">Link to Enhanced 3D Scene Application</a>

<a href="https://github.com/TrentonFrey/TrentonFrey.github.io/tree/master/3D_Scene(OLD)">Link to Original 3D Scene Application</a>






