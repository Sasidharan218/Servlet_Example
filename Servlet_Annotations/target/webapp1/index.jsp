<html>

<body>
    <h2>Hello World!</h2>
    <a href="/gotoservlet1">gotoservlet1</a>
    <a href="/gotoservlet2">gotoservlet2</a><br><br>
    <a href="Servlet001.jsp">Cookies</a><br><br>
    <a href="gotoServlet_1">Cookie Servlet1</a><br><br>
    <a href="gotoServlet_2">Cookie Servlet2</a><br><br>

    <p>JSP HHTP Session Login and Logout Example</p>

    <br><br>


    <form name="formname" action="/Login" method="post">
        User name : <input type="text" required="required" name="uname"><br><br>

        Password: <input type="password"  required="required" id="myInput">
      
        <input type="checkbox" onclick="myFunction()">Show Password  <br><br>

        <script>
            function myFunction() {
                var x = document.getElementById("myInput");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>

        <input type="submit" value="Login">
    </form>
     
<h1>File Upload</h1>
<form method="post" action="UploadServlet"
 enctype="multipart/form-data">
Select file to upload: <input type="file" name="file" size="60" /><br />
<br /> <input type="submit" value="Upload" />
</form>
        
<p> To Call the Stored Procedure Through Java </p>
<a href="/sprocedure">CAll STORED PROCEDURE </a>

       
<p> To Call the Stored Procedure Through Java </p>
<a href="/sprocedure1">CAll STORED PROCEDURE1 to author </a>

<p> To CREATE Procedure Through Java </p>
<a href="/cprocedure">CREATE PROCEDURE </a>


<p> To CALL SUMMARY REPORT Through Java </p>
<a href="/summaryreport">CALL SUMMARY REPORT </a>



<p> To CALL RATING  </p>
<a href="/sgetrating">CALL RATING </a>


</body>

</html>