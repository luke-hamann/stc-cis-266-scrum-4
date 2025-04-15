<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="Team1_scrum4.*" %>
<html>
<head>
<title>Team1 Cat</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>Team1 Cat</h1>
<%
	Team1_Cat_API api = new Team1_Cat_API();

	String name = request.getParameter("name");
	String color = request.getParameter("color");
	String weightStr = request.getParameter("weiht");
	double weight = Double.parseDouble(weightStr);
	
	Team1_Cat cat = api.createCat(name, color, weight);
	
	out.print("Name: " + cat.getName() + "<br />" +
		"Color: " + cat.getColor() + "<br />" +
		"Weight (lbs): " + cat.getWeight());
%>
<p><a href="Team1_Cat.html">Back</a></p>
</body>
</html>
