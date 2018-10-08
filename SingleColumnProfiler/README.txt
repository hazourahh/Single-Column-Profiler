How two use:
1. Import both projects as maven projects into your IDE.
2. Run the MetanomeTestRunner to see if everything works.
3. Rename "MyOdDetector" into your own algorithms name. Your algorithm should have a unique name!
   3.1 Rename the project.
   3.2 Rename the name of the project's classes.
   3.3 Change the names in the pom.xml files of both projects accordingly.
       Do not forget to rename the Algorithm-Bootstrap-Class!!!
   3.4 Change the names in the MetanomeTestRunner classes.
4. Run the TestRunner again to see if the renaming was correct.
5. Start implementing and testing your algorithm.
   You can change the input datasets in the TestRunner's Config class.
   If you extend your algorithm's interface (e.g. with additional parameters), you need to extend the the TestRunner as well.
6. Do not forget to test your algorithm in Metanome.
   See the Metanome user guide in the GitHub Wiki on how to deploy your algorithm.
   (https://github.com/HPI-Information-Systems/Metanome)
   You only need the algorithm project for the deployment; the TestRunner is only used to ease the development process!