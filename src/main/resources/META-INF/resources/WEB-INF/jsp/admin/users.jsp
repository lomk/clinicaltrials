<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page isELIgnored="false" %>
<html>
<head><title>Hello world Example</title></head>
<%@ include file="../bootstrapsource.jsp"%>
<body>
<div class="container">
    <%@ include file="header.jsp"%>
    <h2>Пользователи</h2>
    <a href="/admin/user/new">Создать нового</a>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Имя пользователя</th>
            <th>Роль</th>
            <th>Редактировать</th>
            <th>Удалить</th>
        </tr>
        <c:if test="${not empty users}">
            <c:forEach var="user" items="${users}">
                <tr>
                    <td text="${user.id}"><a href="/user/${user.id}">${user.id}</a></td>
                    <td text="${user.username}">${user.username}</td>
                    <td>${user.role.name}</td>
                    <td><a href="edit/${user.id}">Редактировать</a></td>
                    <td><a href="delete/${user.id}">Удалить</a></td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
    <a href="/admin/user/new">Создать нового</a>
</div>
</body>
</html>
