<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

    <div class="header">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/">Главная</a>
                    <a class="navbar-brand" href="/admin">Admin</a>
                    <ul class="nav navbar-nav">
                        <li><a href="/admin/category/all">Категории</a></li>
                        <li><a href="/admin/article/all">Статьи</a></li>
                        <li><a href="/admin/role/all">Роли</a></li>
                        <li><a href="/admin/user/all">Пользователи</a></li>
                        <li><a href="/admin/tag/all">Тэги</a></li>
                        <sec:authorize access="isAnonymous()">
                            <li><a href="/login">Login</a></li>
                        </sec:authorize>
                        <sec:authorize access="isAuthenticated()">
                            <sec:authentication var="principal" property="principal" />
                            <li> <a href="/logout">Logout</a></li>
                            <li> <a href="/${principal.username}">${principal.username}</a></li>
                        </sec:authorize>
                    </ul>
                </div>
            </div>
        </nav>
    </div>

