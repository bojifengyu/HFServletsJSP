<h2>Chapter 3 Project from the book, Head First Servlets &amp; JSP</h2>

<p>This project consists of a basic webapp with a controlling servlet and a model class for some business logic 
and at long last utilizes a JSP. 
</p>

<p>This exercise is from the Chapter 3, pages 67-91. The whole chapter is about building this simple app</br>
This is a full blown webapp (a very simple one) with a servlet, a model class, an html form, and a JSP for the response. 
The whole Chapter 3 is about guiding the reader in building this webapp from the ground up. The code here is the final
product of the chapter (called version three in the book).
</p>

<p>There are a few significant changes from the book example.
<ul>
	<li>The html syntax is html 5 compliant and css is used for styling</li>
	<li>The web.xml uses slightly different, but more descriptive values than the book example</li>
	<li>A welcome-file is specified in the web.xml to direct any request of the basic domain.com/studies/HFServlets/ch03m to the form.html</li>
	<li>Package names have been changed to reflect my own tastes</li>
	<li>The project organization has been altered to conform to the Maven Standard Directory Layout</li>
	<li>Character encoding set to UTF-8 in the servlet</li>
</ul>
</p>

<h4>Notes</h4>
<p>
Take note that the result.jsp uses a scriptlet (the java code between <code>&lt;% ... %&gt;</code>), which is not a good practice 
and is generally considered bad form. It is present because that is how it is presented in the book and the book eventually explains that this is bad.
</p>

<h4>Maven Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the pom.xml.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch03m.war</br>
This will make the app deploy to the directory structure:  /studies/HFServletsJSP/ch03m in the webapp 
container. 
</p>