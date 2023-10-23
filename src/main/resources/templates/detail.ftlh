[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
    <style>
        body {
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
        <div class="delete">
            <form method="post" action="/delete" class="d-inline">
                <input type="hidden" name="id" value=${vizitkaID} />
                <button class="omerta-button" type="submit">
                    <img class="omerta" src="/images/omerta.jpg" role="img" aria-label="Delete"/>
                </button>
            </form>
        </div>
        <div class="status">${vizitka.status}</div>
        <div class="jmeno">${vizitka.name!x}</div>
        <div class="firma">${vizitka.company!x}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${vizitka.street!x}</div>
                <div><span>${vizitka.celaAdresa!x}</span></div>
            </div>
            <div class="kontakty">
                <div><i class="bi bi-at"></i>${vizitka.email!x}</div>
                <div><i class="bi bi-phone"></i>${vizitka.phoneNumber!x}</div>
                <div><i class="bi bi-globe"></i>${vizitka.web!x}</div>
            </div>
        </div>
    </div>

[#--    [#if vizitka.celaAdresa??]--]
[#--        <div class="mapa">--]
[#--            <iframe style="border:none"  width="100%"--]
[#--                    height="100%" frameborder="0"></iframe>--]
[#--        </div>--]
[#--    [#else]--]
[#--        <div class="mapa">--]
[#--            <iframe style="border:none" src="images/lost-heaven.jpg" width="100%"--]
[#--                    height="100%" frameborder="0"></iframe>--]
[#--        </div>--]
[#--    [/#if]--]

    [#if vizitka.getCelaAdresa()??]
        <div class="mapa">
            <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%" height="100%" frameborder="0"></iframe>
        </div>
    [#else]
        <div class="mapa-error">
            <img src="/images/lost-heaven.jpg"></img>
            <div class="status">Gangster position not found.</div>
        </div>
    [/#if]


    <div class="back-main">
        <a href="/">◂ Back to main page</a>
    </div>
</div>
</body>
</html>
