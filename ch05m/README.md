<h2>Chapter 5 Project from the book, Head First Servlets &amp; JSP</h2>

<p>This project consists of 
</p>

<p>These exercises are from Chapter 5, pages ?.<br/>
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
</ul>
</p>

<h4>Maven Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the pom.xml.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch04m.war</br>
This will make the app deploy to the directory structure:  /studies/HFServletsJSP/ch04m in the webapp 
container. 
</p>