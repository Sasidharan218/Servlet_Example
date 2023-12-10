<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>JSP to JSP</title>
</head>
<body>
        <a href="home.jsp" class="home">Go to Home</a><br><br>
    <form action="second.jsp" >
        <input type="text" name="serialNumber" />
        <input type="submit" value="Submit" />
    </form>
    
</body>
</html>