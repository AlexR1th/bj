<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Table</title>
</head>
<body style="background: grey">
<div style="display: flex; justify-content: center;align-content: center; height: 100%">
    <div class="wrap" style="width: 500px; height: 500px;background: green">
        <#--        ${card.suit}-->
        <#--        ${card.nominal}-->
        <#--        <img src="${card.img}" alt="${card.img}" style="height: 120px;width: 70px">-->
        <img style=" margin: 35% 45%; height: 120px;width: 70px" src="/img/img_1.png" alt="lol">

        <a href="/web/cards/pick">pick the card</a>
        <#list delivery as card>
            <ul>
                <li>
             <img src="${card.img}" style="height: 70px; width: 35px">
                </li>
            </ul>
        </#list>
    </div>
</div>
</body>
</html>