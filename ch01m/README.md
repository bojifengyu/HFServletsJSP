<h2>Chapter 1 Project from the book, Head First Servlets &amp; JSP</h2>

<p>This project consists of a single servlet class called Ch1Servlet which is a very basic servlet that does not 
even utilize a JSP. It merely writes html to the output response.
</p>

<p>This exercise is from pages 30-31</br>
It is meant to be just a quick guide to writing, deploying, and running a servlet. Take notice of how painful it could be 
if we had to write html to the output this way. JSPs will make life easier for us in this regard.
</p>

<h4>Maven Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the pom.xml.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch01m##1.0.war</br>
This will make the app deploy to the directory structure:  /studies/HFServletsJSP/ch01m in the webapp 
container. The final ##1.0 won't cause another directory, but it does let Tomcat know the version number of the app.
</p>