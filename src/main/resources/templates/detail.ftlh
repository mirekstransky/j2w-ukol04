[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
    <style>
        body{
            background: white url(${picture}) center center/cover no-repeat;
        }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
</head>
<body>
[#assign x="Unknown"]
<div class="detail">
        <div class="vizitka">
            <img class="foto" src="/images/${vizitka.foto}" alt="Vizitková fotografie">
            <div class="jmeno">${vizitka.jmeno!x}</div>
            <div class="firma">${vizitka.firma!x}</div>
            <div class="udaje">
                <div class="adresa">
                    <div>${vizitka.ulice!x}</div>
                    <div><span>${vizitka.celaAdresa!x}</span></div>
                </div>
                <div class="kontakty">
                    <div><i class="bi bi-at"></i>${vizitka.email!x}</div>
                    <div><i class="bi bi-phone"></i>${vizitka.telefon!x}</div>
                    <div><i class="bi bi-globe"></i>${vizitka.web!x}</div>
                </div>
            </div>
        </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${"${vizitka.celaAdresa}"?url}" width="100%" height="100%" frameborder="0"></iframe>
    </div>
    <nav>
        <form method="post" action="/delete/${vizitkaID}" class="d-inline">
            <input type="button" name="id" value="${vizitkaID}" />
            <button type="submit" class="btn">Delete</button>
        </form>
        <a href="/">◂ Zpět na seznam</a>
    </nav>
</div>
</body>
</html>
