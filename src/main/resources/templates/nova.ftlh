[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
    <style>
        body{
            background: white url(/images/image-offer.jpg) center center/cover no-repeat;
        }
    </style>
</head>

<body>

<form action="/nova" method="post" class="detail">

    <div class="vizitka vizitka-detail">

        <input class="status status-input" type="text" placeholder="Enter Status" name="status">

        <div class="first-container">
            <div class="container-foto">
                <div>
                    <img class="foto-nova" src="images/unknown.jpg" />
                </div>
                <div>
                    <input name="foto" type="file" value="images/unknows.jpg">
                </div>
            </div>
            <div class="container-jmeno" >
                <input name="jmeno" class="jmeno input" placeholder="Enter Name"></input>
            </div>
        </div>

        <input name="firma" class="firma input"placeholder="Enter Company"></input>
        <div class="udaje">
            <div class="adresa-in">
                <div>
                    <input name="ulice" class="adresa-in input" placeholder="Street"></input>
                </div>
                <div>
                    <input name="obecPsc" class="adresa-in input" placeholder="Post Code Town"></input>
                </div>
            </div>
            <div class="kontakty">
                <input name="email" placeholder="Enter email" class="input"></input>
                <input name="telefon" placeholder="Enter phone" class="input"></input>
                <input name="web" placeholder="Enter web" class="input"></input>
            </div>
        </div>
    </div>
        <button type="submit" class="back-main">Save</button>
        <button type="button" class="back-main"><a href="/">◂ Back to main page</a></button>
</form>

<div class="offer">
    An offer that cannot be refused.
</div>

</body>
</html>
