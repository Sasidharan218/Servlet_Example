<html>
<script LANGUAGE="JavaScript">
function getParams()
{
            var idx = document.URL.indexOf('?');
            var params = new Array();
                if (idx != -1) 
                {
                    var pairs = document.URL.substring(idx+1, document.URL.length).split('&');

                    for (var i=0; i<pairs.length; i++)
                    {
                    nameVal = pairs[i].split('=');
                    params[nameVal[0]] = nameVal[1];
                    }

                }
        return params;
}


params = getParams();

id = unescape(params["id"]);
document.write("Entered Id = " + id + "<br>");
ucccode= unescape(params["ucccode"]);
document.write("Entered  Ucccode = " + ucccode + "<br>");
Scrip= unescape(params["Scrip"]);
document.write("Entered Scrip = " + Scrip + "<br>");
tdate= unescape(params["tdate"]);
document.write("Entered  Trade date = " + tdate + "<br>");
tradetype= unescape(params["tradetype"]);
document.write("Entered  Trade Type = " +  tradetype+ "<br>");
quantity= unescape(params["quantity"]);
document.write("Entered Quantity = " + quantity + "<br>");
tradeprice= unescape(params["tradeprice"]);
document.write("Entered  Trade Price = " + tradeprice + "<br>");

</script>
</html>