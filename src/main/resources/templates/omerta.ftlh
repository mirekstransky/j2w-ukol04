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

    [#list seznam as omerta]
    <div class="container-omerta">
        <div class="container-omerta">
            <img class="omerta-foto" src="/images/${omerta.foto}" alt="Omerta fotografie">
            <div>${omerta.jmeno}</div>
            <div>${omerta.status}</div>
        </div>

        <div class="omerta-datum">Date of Omerta: ${omerta.datum}</div>

    </div>
    [/#list]
<div class="back-main">
    <a href="/">◂ Main page</a>
</div>

</body>
</html>
