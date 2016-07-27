<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>Facehook</title>
    <link rel="stylesheet" href="../css/commo.css" type="text/css"/>
    <link rel="stylesheet" href="../css/index.css" type="text/css"/>
</head>
<body>
<!-- 引入多页面 -->
<jsp:include page="head.jsp" />
<div class="main">
    <div class="reg_login">
        <div class="logForm">
            <form:form action="../login/check" method="post" modelAttribute="loginInfo">
                <span class="font4">登录邮箱:</span><br/>
                <form:input type="text"  path="email" /><br/>
                <span  class="font4">登录密码:</span><br/>
                <form:password path="pwd" /><br/>
                <input type="checkbox" /> 自动登录<br/>
                <input type="submit" value="　登录　" class="sub" />
                　<a href="#">找回密码</a>
            </form:form>

<%-- <form action="/login" method="post">
    <span class="font4">登录邮箱:</span><br/>
    <input type="text"  name="email" /><br/>
    <span  class="font4">登录密码:</span><br/>
    <input type="password" name="pwd" /><br/>
    <input type="checkbox" /> 自动登录<br/>
    <input type="submit" value="　登录　" class="sub" />
    　<a href="#">找回密码</a>
</form>--%>

        </div>
        <div class="reg">
            <span class="font5">注册</span><br/>
            <a>校内期待你的加入</a>
        </div>
        <div class="mobile_login">
            <span class="font5">手机登录</span><br/>
            <a href="#">请访问m.xiaonei.com </a>
        </div>
    </div>
    <div class="banner1">
        <img src="../images/front/Bigfish.jpg" />
    </div>
    <div  class="intro">
        <span class="font2">校内是一个真实社交网络，加入她你可以：</span>

        <li>联络朋友，了解他们的最新动态</li>
        <li>用照片和日志记录生活，展示自我</li>
        <li>找到老同学结识新朋友</li>
        <li>和朋友分享相片、音乐和电影</li>
        <li>自由、安全地控制个人隐私</li>

    </div>
    <!-- 注册第二个入口 -->
    <div class="reg2">
        <span class="font2">因为真实 所以精彩</span>
        <p>
            校内存知己<br/>
            <input type="image" onclick="location.href='../reg/register'" src="../images/front/register.jpg" />
        </p>
    </div>
    <!-- 寻找你的朋友 -->
    <div class="sea_friend">
        <span class="font2">寻找你的朋友</span>　<input type="text" name="sea_friend" />
        <img src="../images/front/sou.jpg" /><br/>
        * <span class="font3">校内网目前已开通海外1500所大学、 国内3000所大学、 56000所中学及 85000家公司。</span>
    </div>
    <!-- 建议 -->
    <div class="advice">
        10月16日 狗狗：全新界面登场 <br/>
        10月15日 相册预加载和FLASH版上传，浏览相册更快更爽<br/>
        10月14日 留言板新增“悄悄话”功能 <br/>
    </div>
</div>
<jsp:include page="foot.jsp" />
</body>
</html>
