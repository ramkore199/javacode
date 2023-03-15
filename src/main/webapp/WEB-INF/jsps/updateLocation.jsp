<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Location...</title>
</head>
<body>
<h2>Update Locations Here...</h2>
<form action="updateLocations" method="post">
<pre>
	Id  :<input type="text" name="id" value="${location.id}" readonly="readonly" >
	Code:<input type="text" name="codes" value="${location.codes}" />
	Name:<input type="text" name="name" value="${location.name}" />
	
	Type:
	rural   <input type="radio" name="type" value="rural"/>
	urban   <input type="radio" name="type" value="urban"/>
	<input type="submit" value="update">
	</pre></form>
	
	
	
</body>
</html>