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
</style>

<body>
    <form action="/tradehtmltodb" method="post">
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
                    <option value="Buy">Buy</option>
                    <option value="Sell">Sell</option>
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