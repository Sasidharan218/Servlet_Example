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

username = unescape(params["username"]);
password = unescape(params["password"]);


document.write("username = " + username + "<br>");
document.write("password = " + password + "<br>");


</script>
</html>