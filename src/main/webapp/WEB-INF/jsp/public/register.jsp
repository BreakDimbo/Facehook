<%--
  Created by IntelliJ IDEA.
  User: Break.D
  Date: 7/21/16
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>注册页面</title>
    <link rel="stylesheet" href="../css/commo.css" type="text/css"/>
    <link rel="stylesheet" href="../css/register.css" type="text/css"/>
    <script type="text/javascript" src="../js/publicJs.js"></script>
    <script type="text/javascript" src="../js/jquery-3.1.0.min.js"></script>
    <script type="text/javascript" src="../ajax/ajax_min_uni.js"></script>
</head>
<body>
<jsp:include page="head.jsp"/>
<div class="reg_main_frame">
    <div class="left_img">
        <img src="../images/front/Little_dragon.gif" width="300px" height="350px">
    </div>

    <%--右侧注册表格--%>
    <div class="reg_form">
        <span class="font6">来吧,加入我们</span><br/>
        <form:form action="../reg/addUser" method="post" modelAttribute="userForm">
            <table>
                <tr>
                    <td class="table_td1">姓名:</td>
                    <td class="table_td2"><form:input type="text" path="name"/></td>
                    <td class="error"><form:errors path="name"/></td>
                </tr>
                <tr>
                    <td class="table_td1">性别:</td>
                    <td class="table_td2"><form:radiobutton path="sex"/>男<form:radiobutton path="sex"/>女</td>
                    <td></td>
                </tr>
                <tr>
                    <td class="table_td1">身份:</td>
                    <td class="table_td2">
                        <form:select size="4" onchange="stateChange(this)" path="state">
                            <form:option value="working">在职</form:option>
                            <form:option value="educated">大学生</form:option>
                            <form:option value="senior">中学生</form:option>
                            <form:option value="none">以上都不是</form:option>
                        </form:select>
                    </td>
                    <td></td>
                </tr>

                <%--已工作--%>
                <tr class="spe_working">
                    <td class="table_td1">居住地:</td>
                    <td class="table_td2">
                        <form:select path="homePro" onchange="setCity(this)">
                            <form:option value="">--省份--</form:option>
                            <c:forEach items="${provinceList}" var="province">
                                <form:option value="${province.id}">${province.name}</form:option>
                            </c:forEach>
                        </form:select>
                    </td>
                    <td></td>
                </tr>
                <tr class="spe_working">
                    <td class="table_td1">选择城市:</td>
                    <td class="table_td2">
                        <form:select id="citySEL" path="homeCity">
                            <form:option value="">--城市--</form:option>
                        </form:select>
                    </td>
                    <td></td>
                </tr>
                <tr class="spe_working">
                    <td class="table_td1">公司:</td>
                    <td class="table_td2"><input type="text" name="??"></td>
                    <td></td>
                </tr>
                <%--已工作 end--%>
                <%--大学生--%>
                <tr class="spe_educate">
                    <td class="table_td1">类型:</td>
                    <td class="table_td2">
                        <form:select path="userType">
                            <form:option value="graduated">本科</form:option>
                            <form:option value="master">硕士</form:option>
                            <form:option value="phd">博士</form:option>
                            <form:option value="teacher">教师</form:option>
                        </form:select>
                    </td>
                    <td></td>
                </tr>
                <tr class="spe_educate">
                    <td class="table_td1">大学:</td>
                    <td class="table_td2">
                        <input id="university" onclick="showTable()" type="text"/>
                        <form:hidden id="universityid" path="universityId"/>
                    </td>
                    <td></td>
                </tr>
                <%--大学生 end--%>
                <tr>
                    <td class="table_td1">电子邮箱: </td>
                    <td class="table_td2"><form:input type="text" path="email"/></td>
                    <td class="error" style=": 0px;"><form:errors path="email"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><span style="font-size: 12px">没有邮箱? <a href="http://gmail-emaillogin.com/gmail-sign-up">注册 Gmail</a></span></td>
                </tr>
                <tr>
                    <td class="table_td1">设置密码</td>
                    <td class="table_td2"><form:password path="pwd" id="pwd1"/></td>
                    <td class="error"><form:errors path="pwd"/></td>
                </tr>
                <tr>
                    <td class="table_td1">确认密码:</td>
                    <td class="table_td2"><form:password path="pwd2" id="pwd2"/></td>
                    <td id="error"></td>
                </tr>
                <tr>
                    <td class="table_td1">验证码:</td>
                    <td class="table_td2"><span style="font-size: 12px">请输入以下验证码, 看不清? 换一张</span>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td class="table_td1"></td>
                    <td class="table_td2"><input type="submit" name="submit" class="button1" value="" onclick="return checkpwd()"></td>
                    <td></td>
                </tr>
                <tr>
                    <td class="table_td1"></td>
                    <td class="table_td2"><input type="checkbox" name="??"/><span class="font3">&nbsp;我已阅读并同意遵守</span>
                        <a href="#">校内网服务条款</a>
                    </td>
                    <td></td>
                </tr>
            </table>
        </form:form>
    </div>

</div>
<jsp:include page="foot.jsp"/>


<%--显示大学表格--%>
<div class="divSch" id="uniDiv"
     style="display: none; position: absolute; top: 50px; left: 750px">
    <table align="center" height="380px" width="500px"
           bordercolor="blanchedalmond">
        <!-- 显示所有国家 -->
        <tr>
            <td bordercolor="blanchedalmond" width="500px">
                <c:forEach items="${countryList}" var="country">
                    <a id="${country.id}" onclick="setCoUnis(this)" class="xh"
                       href="javascript:void(0);">${country.name}</a> |
                </c:forEach>
            </td>
        </tr>
        <!-- 显示当前国家的所有直辖市和省份 -->
        <tr>
            <td bordercolor="blanchedalmond">
                <div id="proTbl">
                    <table width="100%">
                        <tr>
                            <td>
                                <c:forEach items="${provinceList}" var="province">
                                    <a onclick='setProUnis(this)' href="javascript:void(0);"
                                       class="xh" id="${province.id}"  name="${province.countryId}">${province.name} </a>
                                </c:forEach>
                            </td>
                        </tr>
                    </table>
                </div>
            </td>
        </tr>
        <!-- 显示当前省或者直辖市的大学 -->
        <tr>
            <td valign="top" bordercolor="blanchedalmond">
                <div style="width: 550px; height: 280px; overflow: auto"
                     id="uniTbl">
                    <table width="100%">
                        <tr>
                            <c:forEach items="${universityList}" var="university" varStatus="sp">
                            <td><li>
                                <a onclick='showMyUni(this)' href="javascript:void(0);"
                                   class="xh" id="${university.id}">${university.name} </a>
                            </li></td>
                            <c:if test="${sp.count%3==0}"></tr>
                        <tr></c:if>
                            </c:forEach>
                        </tr>
                    </table>
                </div>
            </td>
        </tr>
        <tr>
            <td align="right" bordercolor="blanchedalmond">
                <input type="button" value="关闭窗口" onclick="closeUniTbl()"
                       style="color: white; background-color: crimson; padding: 3px;"/>
                <br/>
                <br/>
                <br/>
                <br/>
            </td>
        </tr>
    </table>
</div>
<%--显示 end--%>
</body>
</html>
