<html>

<body>
<?php
    print "test06.php";
    require_once('xmlrpc.inc');
    $server = new xmlrpc_client('/', 'localhost', 8099);
    $message = new xmlrpcmsg('ogxmlrpcserver.test06');
            
    $result = $server->send($message);
    $value = $result->value();
    if (!$result){
        print "<p>Could not connect to HTTP server.</p>";
    } elseif ($result->faultcode()){
        print "<p>XML-RPC Fault #" . $result->faultCode() . ": " .
            $result->faultString();
    } else{

        print "<BR>Answer =";
        $nbElements = $value->arraysize();
        print "<BR>nbElements = " . $nbElements;
        for ($i = 0; $i < $nbElements; $i++){
            $v = $value->arraymem($i)->scalarVal();
            print "<BR>El " . $i . " : " . $v;
        }
        
        print "<HR>I got this value back<BR><PRE>" .
        htmlentities($result->serialize()) . "</PRE><HR>\n";
    }

?>
</body>

</html>