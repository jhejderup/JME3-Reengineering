##About

The JMonkeyEngine3 Reengineering project is a project intended for learning the main concepts of Software Reengineering. 
This is part of the learning outcomes of the Software Reengineering course at TU Delft.


##Build
There is a build.xml included in the source code for building the project. However, in the eclipse environment,
it will not be able to build the project and errors will show up, in order to build, right click on the build.xml
and run the ANT builder instead. In the terminal, do the following
```bash 
$ ant build
```

##Testing
There are a few unit tests that can be runned with JUnit, however most of the test cases can be runned using the commando:
```bash 
$ ant run
```
In eclipse environment, Run As Java Application, it will serach for all possible classes having a main-method. Select the one below:
```bash 
jme3test.TestChooser.java
```
However, in the test suite, some test cases are not working(like android test cases), but might not have importance for our further work.


## Submission 2
For making sure there are enough test cases, code coverage tools must be used. Below are some useful tools:
```bash 
Google Code Pro Analytix
EclEmma
-- more to come!
```
All changes, decisions, ideas should be well-documented and available in the designated Google Drive folder for this course.

## Issuetracker
Link to the JME3 issuetracker: http://code.google.com/p/jmonkeyengine/issues/list?can=1&q=label%3AProduct-jME3&colspec=ID%20Type%20Status%20Component%20Priority%20Difficulty%20Product%20Milestone%20Owner%20Summary&groupby=&sort=priority&num=100&start=0
