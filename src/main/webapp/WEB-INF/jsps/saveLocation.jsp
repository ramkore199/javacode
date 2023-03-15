<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
<h2>Save New Location details here...</h2>
<form action="saveLocationData" method="post">
<pre>
	Id  :<input type="text" name="id"/>
	Code:<input type="text" name="codes"/>
	Name:<input type="text" name="name"/>
	
	Type:
	rural   <input type="radio" name="type" value="rural"/>
	urban   <input type="radio" name="type" value="urban"/>
	<input type="submit" value="save">
</pre>
	${msg }
	<a href="getLocations">Click here to see all locations stored...</a>
</form>
</body>
</html>