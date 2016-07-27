<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="../css/css/updPersonInfo.css" type="text/css"/>
    <link rel="stylesheet" href="../css/css/common.css" type="text/css"/>
    <script type="text/javascript" src="../js/publicjs.js"></script>
</head>
<body>

<jsp:include page="head.jsp"/>
<div class="info_main">
    <div class="info_left">
        <table width="100%">
            <tr>
                <td width="80%" valign="top">
                    <table width="100%" border="0" cellspacing="0" cellpadding="5"
                    >
                        <tr>
                            <td style="border-bottom: 1px #898989 solid;">
                                <img src="../images/front/photo.gif"/>
                                <font class="word2"> 上传新照片
                                </font>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <img src="../images/front/photo.gif"/>
                                <font class="word2"> 创建相册
                                </font>
                            </td>
                        </tr>
                        <tr>
                            <td valign="top" align="center" style="border-bottom: 1px #D8DFEA solid;">
                                <form:form action="../album/addAlbum" method="post" modelAttribute="albumInfo">
                                    <table width="80%" cellpadding="5" cellspacing="5" border="0">
                                        <tr>
                                            <td align="right" width="20%">
                                                <font class="word3" style="font-weight: bold;">名字:</font>
                                            </td>
                                            <td align="left">
                                                <form:input type="text" id="aname" path="name" class="wby" size="30"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right" valign="top">
                                                <font class="word3" style="font-weight: bold;">描述:</font>
                                            </td>
                                            <td align="left">
                                                <form:textarea class="wbq" path="descript" id="adesc"></form:textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td align="right">
                                                <font class="word3" style="font-weight: bold;">谁能浏览:</font>
                                            </td>
                                            <td align="left">
                                                <form:select style="width: 200px" path="privilege">
                                                    <form:option value="me">
                                                        只有我自己
                                                    </form:option>
                                                    <form:option value="friends">
                                                        我的好友
                                                    </form:option>
                                                    <from:option value="all">
                                                        所有人
                                                    </from:option>
                                                </form:select>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                &nbsp;
                                            </td>
                                            <td align="left">
                                                <input type="submit" class="sub" value="创建相册"
                                                       style="width: 100px"/>
                                                <input type="reset" class="sub" value="取消"
                                                       style="width: 60px"/>
                                            </td>
                                        </tr>
                                    </table>
                                </form:form>
                            </td>

                        </tr>
                        <tr>
                            <td>
                                <img src="../images/front/photo.gif"/>
                                <font class="word2"> 选择相册
                                </font>
                            </td>
                        </tr>
                        <tr>
                            <td valign="top" align="center" style="border-bottom: 1px #D8DFEA solid;">
                                <table width="80%" cellpadding="5" cellspacing="5">

                                    <tr>
                                        <td align="right" width="20%">
                                            <font class="word3" style="font-weight: bold;">选择相册:</font>
                                        </td>
                                        <td align="left">
                                            <select id="selal" style="width: 200px">
                                                <!-- 你的相册有哪些 -->
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            &nbsp;
                                        </td>
                                        <td align="left">
                                            <input type="button" class="sub" value="确定"
                                                   style="width: 60px" onclick="addphoto()"/>
                                            <input type="reset" class="sub" value="取消"
                                                   style="width: 60px"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>

                        </tr>

                    </table>
                </td>
            </tr>
        </table>
    </div>
</div>
<!-- 引入foot.jsp -->
<jsp:include page="../public/foot.jsp"/>
</body>
</html>
