<%--
  Created by IntelliJ IDEA.
  User: Break.D
  Date: 7/22/16
  Time: 9:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>入口</title>
</head>
<body>
<%--<a href="#">测试</a>
<c:forEach items="${cityList}" var="city">
<br> ${city.name} | ${city.provinceByProId.name}<br>
</c:forEach>--%>

<%
    response.sendRedirect("public/index.jsp");
%>
</body>
</html>
