[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
    <style>
        body{
            background: white url(/images/mafia-background.jpg) center center/cover no-repeat;
        }
    </style>
</head>
<body>
[#assign x="Unknown"]
<div class="seznam">
    [#list seznam as vizitka]
    <a href="/detail/${vizitka?index}">
        <div class="vizitka">
            <img class="foto" src="images/${vizitka.foto}"alt="${vizitka.name!x}!"/>
            <div class="status-seznam">${vizitka.status}</div>
            <div class="jmeno">${vizitka.name!x}</div>
            <div class="firma">${vizitka.company!x}</div>
            <div class="udaje">
                <div class="adresa">
                    <div>${vizitka.street!x}</div>
                    <div>${vizitka.streetPostCode!x}</div>
                </div>
                <div class="kontakty">
                    <div><i class="bi bi-at"></i>${vizitka.email!x}</div>
                    <div><i class="bi bi-phone"></i>${vizitka.phoneNumber!x}</div>
                    <div><i class="bi bi-globe"></i>${vizitka.web!x}</div>
                </div>
            </div>
        </div>
    </a>
    [/#list]
    <a href="/nova">
        <div class="vizitka vizitka--nova">
            <svg width="100" height="100">
                <rect width="20" height="100" x="40" y="0" fill="rgb(136, 8, 8)" />
                <rect width="100" height="20" x="0" y="40" fill="rgb(136, 8, 8)" />
            </svg>
        </div>
    </a>
</div>
</body>
</html>
