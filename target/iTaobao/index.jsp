<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
    <h1>主页</h1>
    <a href="logout">登出</a><br>
    <a href="login.jsp">登录</a><br>
    <a href="register.jsp">注册</a><br>
    <a href="user/findAll.do">查询所有</a><br>
    <form action="convert.do">
        <input type="text" name="date">
        <input type="submit" value="日期转换">
    </form>
    国际化：<spring:message code="hello" text="未获取到数据"/><br>
    用户自定义国际化:
    <a href="changeLanguage.do?locale=en_US">英语</a>
    <a href="changeLanguage.do?locale=zh_CN">中文</a>
</body>
</html>