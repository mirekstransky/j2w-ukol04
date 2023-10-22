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
        <div class="first-container">
            <div class="container-foto">
                <div>
                    <img class="foto-nova" src="images/unknown.jpg" />
                </div>
                <div>
                    <input name="foto" type="file">
                </div>
            </div>
            <div class="container-jmeno" >
                <input name="jmeno" class="jmeno input" placeholder="Enter Name"></input>
            </div>
        </div>

        <input name="firma" class="firma input"placeholder="Enter Company"></input>
        <div class="udaje">
            <div class="adresa">
                <div>
                    <input name="adresa" class="adresa input" placeholder="Street"></input>
                </div>
                <div>
                    <input name="obecPSC" class="adresa input" placeholder="Post Code Town"></input>
                </div>
            </div>
            <div class="kontakty">
                <input name="email" placeholder="Enter email" class="input"></input>
                <input name="telefon" placeholder="Enter phone" class="input"></input>
                <input name="web" placeholder="Enter web" class="input"></input>
            </div>
        </div>
    </div>
    <button type="submit" class="btn">Ulož</button>

    <nav class="btn-nav">
        <button type="button" class="btn"><a href="/">◂ Back to main page</a></button>
        <button type="button" class="btn">Save</button>
    </nav>

</form>

<div class="offer">
    Nabídka která se neodmítá
</div>

</body>
</html>
