<h2>Chapter 1 Project from the book, Head First Servlets &amp; JSP</h2>

<h4>Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the build.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch01m##1.0.war</br>
This will make the app deploy to the directory structure /studies/HFServletsJSP/ch01m in the webapp 
container. The final ##1.0 won't cause another directory, but it does let Tomcat know the version number of the app.
</p>