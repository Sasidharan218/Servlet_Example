<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>Add Trade</h1>
    <a href="home.jsp">|Home|</a><br>
    <hr>
    <form action="/addtrade" method="post">
        <fieldset>
            <legend>Trade information:</legend>
            Id:<br>
            <input type="number" name="id" placeholder="enter id"> <br> <br>
            Ucc Code:<br>
            <input type="text" name="ucccode" placeholder="enter ucccode"><br><br>
            Scrip:<br>
            <input type="text" name="Scrip" placeholder="enter scrip"><br><br>
            TradeDate:<br>
            <input type="date" name="tdate" placeholder="enter date "><br><br>
            Trade Type:<br>
            <select name="tradetype">
                    <option value="B">Buy</option>
                    <option value="S">Sell</option>
            </select><br><br>
            Quatity:<br>
            <input type="number" name="quantity"placeholder="enter quantity"><br><br>
            Trade Price:<br>
            <input type="number" name="tprice"placeholder="enter tradeprice"><br><br>
            <label>
                <input type="checkbox"> I agree to the terms
            </label>
            <br>
            <br>
            <input type="submit" value="Submit">
            <input type="reset" onclick="alert('Clear the Field')">
            <br>

        </fieldset>
    </form>
</body>
</html>