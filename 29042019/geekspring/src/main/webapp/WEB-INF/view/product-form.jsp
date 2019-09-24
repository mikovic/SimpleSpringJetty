<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=8" />

</head>
<body>
<h2></h2>
<%--@elvariable id="product" type=""--%>



<form:form action="processForm" modelAttribute="product">
    <fieldset>
        <legend>Добавить товар</legend>
        <p><form:label path="title"> Название<em>:</em></form:label><form:input path ="title"/></p>
        <p><form:label path="id"> Стоимость<em>:</em></form:label><form:input path ="cost"/></p>
        <p><input type="submit" value="Отправить"></p>
    </fieldset>
</form:form>







</body>
</html>
