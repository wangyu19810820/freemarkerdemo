<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>audit warning</title>
</head>
<body>
<table border="1">
    <tr>
        <td>产品编号</td>
        <td>产品名称</td>
        <td>送审时间</td>
        <td>审核预警</td>
    </tr>
    <#list productList as product>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.auditDate?datetime}</td>
        <td>${auditWarningMethod(product.auditDate)}</td>
    </tr>
    </#list>
</table>
</body>
</html>