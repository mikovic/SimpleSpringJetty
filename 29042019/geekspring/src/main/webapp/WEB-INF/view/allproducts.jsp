<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=8" />

</head>
<body>
<h2>Products</h2>


<table width="100%" border="1" cellpadding="4" cellspacing="0">
    <caption>Товары</caption>
    <tr>
        <td>id</td> <th>Название</th><th>Стоимость</th>
    </tr>

    <c:forEach items="${requestScope.products}" var="product">
    <tr>
        <td><a href="${product.id}"> ${product.id}</a></td><td>${product.title}</td><td>${product.cost}</td>
    </tr>
    </c:forEach>
</table>
<p>
<p><button onclick="location.href ='/products/add'">Добавить товар</button>
</p>




</body>
</html>
