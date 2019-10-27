<%--
  Created by IntelliJ IDEA.
  User: ANGLE0
  Date: 2019/10/19
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <h1>登录</h1>
<%--            <span>验证码：</span>--%>
<%--            <img src="code/validateCode" alt="">--%>

    <form action="login" method="post">
        <input type="text" name="username"><br>
        <input type="text" name="password"><br>
        <div>
            <img src="code/validateCode.do" alt="验证码">
        </div><br>
        <input type="reset" value="重置">
        <input type="submit" name="submit" value="login"><br>
    </form>
</body>
</html>
