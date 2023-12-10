<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head>
<body>
       
 


    <form action="loginServlet" method="post">
        <fieldset style="width: 300px">
            <legend> Login to App </legend>
            <table>
                <tr>
                    <td>User ID</td>
                    <td><input type="text" name="username" required="required" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="userpass" required="required" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    <td><a href="registerhtmltodb.jsp" class="home"><input type="button" value="Register" /></a></td>
                </tr>
            </table>
        </fieldset>
     
    </form>
    <a href="/gotoservlet1" class="home"><input type="button" value="gotoServletContext-Servlet1" /></a>
</body>
</html>