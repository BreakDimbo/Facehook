<%--
  Created by IntelliJ IDEA.
  User: Break.D
  Date: 7/20/16
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <link rel="stylesheet" href="../css/head.css" type="text/css">
    <script>
        function changeBD(o) {
            o.style.backgroundColor = '#d30033';
        }

        function changeNM(o) {
            o.style.backgroundColor = '';
        }
    </script>

<div class="head">
    <img class="img1" src="../images/front/andy_warhol1.jpg">
    <img class="img2" src="../images/front/Facebook1.jpg">
    <ul class="nav">
        <li onmouseleave="changeNM(this)" onmousemove="changeBD(this)"><a href="../reg/register.do">注册</a></li>
        <li onmouseleave="changeNM(this)" onmousemove="changeBD(this)"><a href="#">设为首页</a></li>
        <li onmouseleave="changeNM(this)" onmousemove="changeBD(this)"><a href="#">加入收藏</a></li>
        <li onmouseleave="changeNM(this)" onmousemove="changeBD(this)"><a href="#">帮助</a></li>
    </ul>
</div>
