<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="navbar navbar-default navbar-static-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
            </button>
            <div class="navbar-brand logo">
                <a href="/">clinicaltrials.com.ua</a>
            </div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-default">
                <li> </li>
                <li> </li>
                <li class="divider-vertical"></li>
                <form class="navbar-form navbar-right" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Пошук досліджень">
                    </div>
                    <button type="submit" class="btn btn-default">Шукати</button>
                </form>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <sec:authorize access="isAnonymous()">
                    <%--<button type="button" class="btn btn-default navbar-btn"><a href="/login" >Login</a></button>--%>
                    <li><a href="/login" >Login</a></li>
                </sec:authorize>
                <sec:authentication var="principal" property="principal"/>
                <sec:authorize access="hasAuthority('ADMIN')">
                    <li> <a href="/logout">Logout</a></li>
                    <li><a href="/admin">(${principal.username})</a></li>
                </sec:authorize>
                <sec:authorize access="hasAuthority('USER')">
                    <li> <a href="/logout">Logout</a></li>
                    <li><a href="/user/${principal.username}">(${principal.username})</a></li>
                </sec:authorize>
                <sec:authorize access="hasAuthority('MANAGER')">
                    <li> <a href="/logout">Logout</a></li>
                    <li><a href="/manager/${principal.username}">(${principal.username})</a></li>
                </sec:authorize>
            </ul>

        </div>
    </div>
</div>