websocket


html 


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>
        solomontechtt
    </p>

    <input type="button" value="Send Message" onclick="javascript:sendMesage();"/>
    <input type="text" id="inputText1"/>

    <script type="text/javascript">
        console.log(location.host)
        let ws;
        ws = new WebSocket("ws://localhost/chatt")

        function sendMesage() {
            ws.send(inputText1.value) 
        }

        ws.onmessage = (msg) => {
            console.log(msg.data)
        } 

    </script>
</body>
</html>


git branch --set-upstream-to=origin/feature/batch fearue/batch
branch 'feature/batch' set up to track 'origin/feature/batch'.


spring boot batch 개발 
HyperSQL Database
schema-all.sql 생성

aop로 log4j2 만들것



