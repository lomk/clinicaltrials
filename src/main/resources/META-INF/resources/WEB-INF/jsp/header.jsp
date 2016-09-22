<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
   <div class="jumbotron">
        <div class="row text-center">
            <img src="/images/1212.png" width="1000" height="100"/>
            <div class="">
                <h3>Spring Boot Web App</h3>
            </div>
        </div>
    </div>
    <div class="header">
        <div class="row text-center">
        </div>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <ul class="nav navbar-nav">
                        <c:choose>
                            <c:when test="${fn:contains(pageContext.request.requestURI, '/article/all/page/')}">
                                <li class="active"><a href="/article/all/page/1">Публикации <span class="sr-only">(current)</span></a></li>
                            </c:when>
                            <c:otherwise>
                                <li><a href="/article/all/page/1">Публикации</a></li>
                            </c:otherwise>
                        </c:choose>
                        <%--<li><a href="/article/all/page/1">Публикации</a></li>--%>
                        <li><a href="/article/all/page/1">Тематика</a></li>
                        <li><a href="/">FAQ</a></li>
                        <sec:authorize access="isAnonymous()">
                            <button type="button" class="btn btn-default navbar-btn"><a href="/login" >Вход</a></button>
                        </sec:authorize>
                            <sec:authentication var="principal" property="principal"/>
                            <sec:authorize access="hasAuthority('ADMIN')">
                                <li> <a href="/logout">Выход</a></li>
                                <li><a href="/admin">(${principal.username})</a></li>
                            </sec:authorize>
                            <sec:authorize access="hasAuthority('USER')">
                                <li> <a href="/logout">Выход</a></li>
                                <li><a href="/user/${principal.username}">(${principal.username})</a></li>
                            </sec:authorize>
                            <sec:authorize access="hasAuthority('MANAGER')">
                                <li> <a href="/logout">Выход</a></li>
                                <li><a href="/manager/${principal.username}">(${principal.username})</a></li>
                            </sec:authorize>
                    </ul>
                </div>
            </div>
        </nav>
    </div>