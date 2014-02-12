<h2>Chapter 5 Project from the book, Head First Servlets &amp; JSP</h2>

<p>This project consists of a few different servlets and classes meant to demonstrate servlet
init parameters and context parameters and attributes and even a listener
</p>

<p>
These exercises are from Chapter 5<br/>
	<ul>
		<li>TestInitParams - page 154</li>
		<li>TestContextParams - my contrivance meant to work similarly to TestInitParams except it's 
			for context params, it does use the context parameter name/value from the code magnet of 
			page 161 </li>
		<li>Dog, ListenerTester, and MyServletContextListener - this is from the Listener tutorial 
			from pages 168 - 179
			</li> 
	</ul>
</p>

<p>There are a few significant changes from the book example.
<ul>
	<li>The html syntax is html 5 compliant and css is used for styling</li>
	<li>The web.xml uses slightly different, but more descriptive values than the book example</li>
	<li>An index.html was created to list the links of the webapp and provide some cohesion to the exercises</li>
	<li>A welcome-file is specified in the web.xml to direct any request of the basic domain.com/studies/HFServlets/ch05m to the index.html</li>
	<li>Package names have been changed to reflect my own tastes</li>
	<li>The project organization has been altered to conform to the Maven Standard Directory Layout</li>
	<li>Character encoding set to UTF-8 in the servlet</li>
</ul>
</p>

<h4>Note</h4>
<p>
We haven't gotten to the JSP chapter yet, so JSP are still being avoided.  Don't worry, the JSP chapter is the
next chapter, Woo-Hoo!
</p>

<h4>Maven Notes</h4>
<p>
Take notice of the <code>&lt;finalName&gt;</code> in the pom.xml.  This tag makes use of # symbol in the 
construction of the .war file name so the actual filename would end up being studies#HFServletsJSP#ch05m.war</br>
This will make the app deploy to the directory structure:  /studies/HFServletsJSP/ch05m in the webapp 
container. 
</p>