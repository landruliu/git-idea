<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>集合显示</title>
</head>
<body>
<h3>查询结果...</h3>
<c:forEach items="${list}" var="account">
    ${account.name}<br>
</c:forEach>
</body>
</html>
