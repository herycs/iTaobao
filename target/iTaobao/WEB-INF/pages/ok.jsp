<%@page language="java" pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</body>
</html>