<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html >

<body>
   <!-- <p> Servelt Context : ${fullname} </p> -->
   <a href="/gotoservlet1" class="home"><input type="button" value="ServletContext-Servlet1" /></a>
   <br>
   <br>
   <a href="/gotoservlet2" class="home"><input type="button" value="ServletContext-Servlet2" /></a>
<!-- 
   <%String text1=(String)request.getAttribute("text1");%>
   <%=text1%>

   <%String name=(String)request.getAttribute("name");%>
   <%=name%> -->
   ${name}
   ${text1}




</body>



</html>