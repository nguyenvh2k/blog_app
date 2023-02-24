<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title><dec:title default="Trang chủ"/></title>
    <link href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet" type="text/css" media="all"/>
    <link href="<c:url value='/template/web/css/style.css'/>" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
    <%--    Header--%>
    <%@include file="/common/web/header.jsp"%>
    <%--    Header--%>

    <%--body--%>
    <div class="container">
    <dec:body/>
    </div>
    <%--Body--%>

    <%--Footer--%>
    <%@include file="/common/web/footer.jsp"%>
    <%--Footer--%>

    <%--Jquery--%>
    <script type="text/javascript" src="<c:url value='/template/web/jquery/jquery.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
</body>
</html>