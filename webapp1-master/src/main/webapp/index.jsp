<html>

<head>
    <title> Online Trade </title>
    <h1>Online Trade Account</h1>
</head>
<style>
    h1
    {
        text-align: center;
    }
    .home
    {text-align: right}
</style>

<body>
     <a href="home.jsp" class="home">Go to Home</a><br><br>
    <form action="/action_page.php">
        <fieldset>
            <legend>Personal information:</legend>
            First name:
            <input type="text" name="firstname">    
            Last name:
            <input type="text" name="lastname">
            Gender:
                <select name="Gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Others">Others</option>
            </select>
            <br>
            <br>
            User name:<br>
            <input type="text" name="username"><br>
            User password:<br>
            <input type="password" name="psw">
            <br>
            Retype password:<br>
            <input type="password" name="psw">
            <br>
            <br>
            <input type="checkbox" name="vehicle1" value="Bike"> I am a Student <br>
            <input type="checkbox" name="vehicle2" value="Car"> I am a Employee <br>
            <br>
            Birthday:
            <input type="date" name="bday">
                Age:
            <input type="number" name="quantity" min="18" max="50"><br><br>
            Telephone:
            <input type="tel" name="phone" pattern="[0-9]{3}-[0-9]{2}-[0-9]{3}">
            E-mail:
            <input type="email" name="email"><br>
            <br>
            Select your favorite color:
            <input type="color" name="favcolor"><br>
            <br>
            Select a file: <input type="file" name="myFile"><br><br>
            
            <label>
                <input type="checkbox"> I agree to the terms
            </label><br>
            <br>
            <input type="submit" value="Submit">
            <input type="reset" onclick="alert('Clear the Field')">
            <br>
        </fieldset>
    </form>

</body>

</html>