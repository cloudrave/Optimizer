# The Birds and the Bees

## Implementation of Cuckoo Search Algorithm and Particle Swarm Optimization as a project for Harvard's CS51 course.

Collaborators:

- [Samuel Kim](https://github.com/samuelkim6626)
- [Nicholas Merrill](https://github.com/NicholasMerrill)
- [Crystal Stowell](https://github.com/cstowell)

## Background

To get a more in-depth understanding of the algorithms, read our [final writeup](http://optimizer.nickmerrill.me/about/).

## Use

### Web Application

For an intuitive demonstration of the algorithms and their applications to problems, visit our [demo site](http://optimizer.nickmerrill.me/).

### Terminal

The source code is in `src`, but to run the demonstration of the system, use the compiled `jar` file in the main directory.

On Unix, the command to begin the program should be something like:

    java -jar demo.jar
    
Once the program is running, you can choose various problems to solve. A brief description is given for each.


## Organization

The project is broken up into three main packages: algorithms, problems, and solutions.  By organizing the project this way, it is very simple to switch in different algorithms for each problem, providing many combinations.  The abstraction within each class also aided in the ease of writing each respective algorithm and problem.
