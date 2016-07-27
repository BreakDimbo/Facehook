<%--
  Created by IntelliJ IDEA.
  User: Break.D
  Date: 7/21/16
  Time: 11:20 PM
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
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="../login/get">首页</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="../user/gotoHomePage">个人主页</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="#">修改</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="#">好友</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="#">应用</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="#">邀请</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="#">班级</a></li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="top" href="#">站内信</a></li>
        <li>搜索</li>
        <li style="width: 170px;"><input type="text" /><img src="../images/front/sou.jpg" /></li>
    </ul>

    <ul class="nav">
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)">
            <a class="anavi" href="#">账号</a>
        </li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)">
            <a class="anavi" href="#">隐私</a>
        </li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)">
            <a  class="anavi" href="#">退出</a>
        </li>
    </ul>
</div>

