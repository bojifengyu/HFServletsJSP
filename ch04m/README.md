<h2>Chapter 4 Project from the book, Head First Servlets &amp; JSP</h2>

<p>This project consists of couple of simple servlets 
<ul>
	<li>CodeReturn - returns a particular file called bookCode.jar in a response</li>
	<li>RedirectExercise1 - does a redirect relative to the webapp
	<li>RedirectExercise2 - does a redirect relative to the web container</li>
	<li>RequestDispatchExercise - does a request dispatch to a jsp</li>
</ul>
</p>

<p>These exercises are from Chapter 4, pages 128-129 (CodeReturn), and page 136 (RedirectExercises), and page 138 (RequestDispatch)
<br/>
Some things to grasp in this exercise:
<ul>
	<li>CodeReturn servlet sets the content type to something other than text/html, in this case the response is an jar file so
		the content type is application/jar</li>
	<li>CodeReturn servlet uses a servletcontext to get access to the data of the file that is to be downloaded</li>
</ul>
</p>

<p>There are a few significant changes from the book example.
<ul>
	<li>The html syntax is html 5 compliant and css is used for styling</li>
	<li>The web.xml uses slightly different, but more descriptive values than the book example</li>
	<li>A welcome-file is specified in the web.xml to direct any request of the basic domain.com/studies/HFServlets/ch04m to the 
		download.html</li>
	<li>Package names have been changed to reflect my own tastes</li>
	<li>The project organization has been altered to conform to the Maven Standard Directory Layout</li>
	<li>Character encoding set to UTF-8 in the servlet</li>
	<li>The redirect and Request Dispatch exercises are my own contrivance based on book material presented</li>
</ul>
</p>

<h4>Maven Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the pom.xml.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch04m.war</br>
This will make the app deploy to the directory structure:  /studies/HFServletsJSP/ch04m in the webapp 
container. 
</p>