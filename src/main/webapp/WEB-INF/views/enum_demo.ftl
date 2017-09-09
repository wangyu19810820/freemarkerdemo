<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table border="1">
    <tr>
        <td>产品编号</td>
        <td>产品名称</td>
        <td>类别</td>
    </tr>
<#list productList as product>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.type}</td>
        <#-- product.type值是一个枚举，应用对象转换技术，直接转换成期望的值，此处是String -->
        <#-- 类似的写法在其他项目中如下实现： -->
        <#-- 药品公版<@dicDisplay type="productType" value="product.type"> -->
        <#-- 耗材内控<#if>...<#elseif>...<#else>...</#if> -->
    </tr>
</#list>
</table>
</body>
</html>