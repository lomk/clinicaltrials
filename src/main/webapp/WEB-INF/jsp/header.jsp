<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div class="jumbotron">
    <div class="row text-center">
        <img src="/images/clinicaltrials.png" width="500" height="100"/>
        <div class="">
            <h3>clinicaltrials.com.ua</h3>
        </div>
    </div>
</div>
<div class="header">
    <div class="row text-center">
    </div>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <%--<div class="navbar-header">--%>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <%--<c:choose>
                        <c:when test="${fn:contains(pageContext.request.requestURI, '/article/all/page/')}">
                            <li class="active"><a href="/article/all/page/1">?????????? <span class="sr-only">(current)</span></a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="/article/all/page/1">??????????</a></li>
                        </c:otherwise>
                    </c:choose>--%>

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Про нас<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Action</a></li>
                            <li><a href="#">Another action</a></li>
                            <li><a href="#">Something else here</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Про клінічні дослідження<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li> <a href="/logout">Контакти</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <sec:authorize access="isAnonymous()">
                        <button type="button" class="btn btn-default navbar-btn"><a href="/login" >Login</a></button>
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
            <%--
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            </div>--%>
        </div>
    </nav>
</div>