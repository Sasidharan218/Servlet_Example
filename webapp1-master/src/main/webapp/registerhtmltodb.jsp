<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head>

<script>
    function validate() {
        var name = document.register.userName.value;
        var password = document.register.userPass.value;
        var firstpassword = document.register.userPass.value;
        var secondpassword = document.register.userPass2.value;
        
        if (name == null || name == "") {
            alert("Name can't be blank or null !!!");
           return false;
        }
        if (name.length<6) {
            alert("Name should be 6 char long !!!");
           return false;
        }
        if(password == null || password == "")
        {
            alert("Please enter password must have one upper,lower and special character... !!!");
            return false;
        }
        if(password.length<8) 
        {
            alert("Password must be at least 8 characters long !!!");
           return false;
        }
       
var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
if(document.register.userPass.value.match(passw)) 
{ 
//yalert('Correct Password ...!');
if (firstpassword == secondpassword && firstpassword != null) 
        {
            alert("successfully registered... !!!");
            return true;
        }
        else
        {
            alert("password must be same!");
            return false;
        }
}
else
{ 
alert('Wrong...! Your Password must have one upper,lower and special character... !!!')
return false;
}

        
    }
</script>
<body>
    <form name="register" action="/htmltodb" method="post" onsubmit="return validate()">
        <fieldset style="width: 300px">
            <legend> Register to Application </legend>
            <table>
                <tr>
                    <td>User ID</td>
                    <td><input type="text" name="userName" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="userPass"/></td>
                </tr>
                <tr>
                    <td>Retype Password</td>
                    <td><input type="password" name="userPass2"/></td>
                   
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
        </fieldset>
     
    </form>
    
</body>
</html>