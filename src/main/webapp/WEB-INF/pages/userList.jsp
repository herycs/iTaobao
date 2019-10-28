<%@ page import="org.apache.ibatis.javassist.bytecode.CodeIterator" %><%--
  Created by IntelliJ IDEA.
  User: ANGLE0
  Date: 2019/10/26
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${users}" var="userInfo">
        ${userInfo.username}<br>
    </c:forEach>
</body>
</html>
