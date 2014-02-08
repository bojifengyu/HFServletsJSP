<h2>Chapter 2 Project from the book, Head First Servlets &amp; JSP</h2>

<p>This project consists of a single servlet class called Ch2Dice which is a very basic servlet that does not 
even utilize a JSP. It merely writes html to the output response. It is a slight variation of the Ch1Servlet of
chapter 1. It create some local variables and then uses them as part of the output of the response
</p>

<p>This exercise is from the Code Magnets excercise from pages 60-61</br>
This is basically just like Ch1Servlet of chapter 1 with some local variable thrown into it. Again, take notice 
of how painful it could be if we had to write html to the output. JSPs will make life easier. 
</p>

<p>There are a few minor changes from the book example.
<ul>
	<li>The html syntax is html 5 compliant and css is used for styling</li>
	<li>The web.xml uses slightly different, but more descriptive values than the book example</li>
	<li>The url pattern in the web.xml is wildcarded to /* to make the servlet the default servlet of the webapp</li>
	<li>Packages are used in this project. The book did not use packages</li>
	<li>The project organization has been altered to conform to the Maven Standard Directory Layout</li>
	<li>Explicitly set the response content type to text/html</li>
</ul>
</p>

<h4>Maven Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the pom.xml.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch02m.war</br>
This will make the app deploy to the directory structure:  /studies/HFServletsJSP/ch02m in the webapp 
container. 
</p>