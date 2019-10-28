<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>req</title>
    <meta charset="UTF-8">
</head>
<body>
    <h3>hello</h3>
    <h4>以下是您查询的信息</h4>
    <c:forEach items="${list}" var="a">
        ${a.ac_name}
        ${a.ac_money}
    </c:forEach>
    <br>
    转换后日期为：${date}
    <br>
    用户自定义语言：<spring:message code="hello" text="未获取到国际化语言配置"/>
    国际化后语言显示：
    <spring:message code="hello" text="未获取到国际化语言配置"/>
</body>
</html>