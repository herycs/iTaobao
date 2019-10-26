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
    <form action="user/login">
        <div>
            <span>用户名：</span>
            <input type="text" name="username" id="username">
        </div>
        <div>
            <span>密码：</span>
            <input type="password" name="password" id="password">
        </div>
        <idv>
            <span>邮箱：</span>
            <input type="text" name="email" id="email">
        </idv>
        <div>
            <span>验证码：</span>
            <img src="code/validateCode" alt="">
            <input type="text" name="validateCode" id="code">
        </div>
        <input type="submit" id="submit">
    </form>
</body>
</html>
