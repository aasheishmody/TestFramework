# TestFramework

Steps to run:

1)Clone the project. </br>
2)Navigate to the project through command line. </br>
3)Execute the command - mvn clean install -P Chrome,Extra\ Large\ View\ Port,Production\ Environment </br>
4)Check reports - TestFramework/target/cucumber-html-report/feature-overview.html </br>


Features of the framework </br>

1)Can be run on different browsers using multiple view ports. </br>
 
 Example to run on Firefox in Medium View Port Landscape mode - </br>
 
 mvn clean install -P Firefox,Medium\ View\ Port\ Landscape,Production\ Environment </br>
 
2)Tests run parallely (count can be increased) through multiple runners and the json files </br> 
from different runners are merged at the end to produce a consolidated HTML report. </br>

3)Can be run on different environments. </br>

  Example to run on QA Environment - </br>
  
  mvn clean install -P Chrome,Extra\ Large\ View\ Port,QA\ Environment </br>
  
4)Can run on different Operating Systems (Currently Windows and Mac - more can be added). </br>

5)Takes screenshot of failing scenarios and embeds it in the test report. </br>



Things to note </br>

1)All the timeouts are dynamic in nature with regular polling. </br>

2)Binaries have been included for demonstration purposes. Jenkins job can easily be customised </br> 
in order to avoid inclusion of binaries in the repository. </br>

3)Additional feature file (Search Demo For Parallel Run) has been created with the same scenarios </br>
just to demonstrate parallel run. </br>

4)Chrome and Firefox need to be updated to the latest version. </br>

5)Operating System should have maven and java installed. </br>

6)Parallel run for multiple browsers for different view ports and environments can be easily  
achieved through Jenkins

For example - Multiple instances of firefox can run parallely with multiple instances of chrome
through jenkins at the same time using the same code base.