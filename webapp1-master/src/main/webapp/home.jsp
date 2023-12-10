<html>

<head>
    <title>Home Page of Krishnan </title>
</head>
<script>
    function validateform() {
        var name = document.myform.username.value;
        var password = document.myform.password.value;

        if (name == null || name == "") {
            alert("Name can't be blank or null");
            return false;
        } else if (password.length < 10) {
            alert("Password must be at least 10 characters long.");
            return false;
        }
    }  
</script>

<body>
    <form name="myform" method="get" action="abc.jsp" onsubmit="return validateform()">
        <br><br><br><br><br>
        <br<br><br><br><br><br><br>
            <fieldset>

                <legend>Personal information:</legend>

                User name:<br>
                <input type="text" name=username><br>

                User password:<br>
                <input type="password" name=password><br>

                <input type="submit" value="Register">

                <input type="reset" onclick="alert('Clear the Field')"><br><br>

                <a href="index.jsp">Go to Input Type html file</a><br><br>
                <a href="trade.jsp">Go to Online Trade Account </a><br><br>
                <a href="page1.jsp">Go to html to html Using Java Script</a><br><br>
                <a href="first.jsp">Go to JSP to JSP Data Transfer </a><br><br>

            </fieldset>
    </form>

</body>

</html>