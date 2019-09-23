<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=8" />

</head>

<body>
<table width="100%" border="1" cellpadding="4" cellspacing="0">
    <caption>Характеристика</caption>
    <tr>
        <th>&nbsp;</th><th>Выбранный товар</th>
    </tr>
    <tr>
        <td>ID</td><td>${product.id}</td>
    </tr>
    <tr>
        <td>Название</td><td>${product.title}</td>
    </tr>
    <tr>
        <td>Стоимость</td><td>${product.cost}</td>
    </tr>
</table>
</body>



<p>
<p><button onclick="location.href ='/products/add'">Добавить товар</button>
</p>




</body>
</html>
