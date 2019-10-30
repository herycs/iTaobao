<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
</head>
<body>
<h1>文件列表</h1>

可下载的文件：

<c:choose>
    <c:when test="${empty files}">
        暂无文件，等待上传
    </c:when>
    <c:otherwise>
            <c:forEach items="${files}" var="file">
                <br><a href="downFiles.do?filename=${file.realName}">${file.name}-点击下载</a>
            </c:forEach>
    </c:otherwise>
</c:choose>

</body>
</html>