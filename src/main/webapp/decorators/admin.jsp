<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>>
<html>
<head>
    <title><dec:title default="Trang chủ"/></title>
    <meta name="description" content="overview &amp; stats" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/bootstrap.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.5.0/css/font-awesome.min.css'/>" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/fonts.googleapis.com.css'/>" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace.min.css'/>" class="ace-main-stylesheet" id="main-ace-style" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-part2.min.css'/>" class="ace-main-stylesheet" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-skins.min.css'/>" />
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-rtl.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/ace-ie.min.css'/>" />
    <script src="<c:url value='/template/admin/js/ace-extra.min.js'/>"></script>
</head>
<body class="no-skin">
<%--Header--%>
    <%@include file="/common/admin/header.jsp"%>
<%--Header--%>
<%--body--%>
<div class="main-content">
    <script type="text/javascript">
        try{ace.settings.loadState('main-container')}catch(e){}
    </script>
    <%--Menu--%>
    <%@include file="/common/admin/menu.jsp"%>
        <%--Menu--%>
    <dec:body/>
</div>
<%--Body--%>

<%--Footer--%>
<%@include file="/common/admin/footer.jsp"%>
<%--Footer--%>
<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse display">
    <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
</a>
<script src="<c:url value='/template/admin/js/jquery-2.1.4.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery-1.11.3.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/excanvas.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery-ui.custom.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.ui.touch-punch.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.easypiechart.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.sparkline.index.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.flot.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.flot.pie.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/jquery.flot.resize.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/ace-elements.min.js'/>"></script>
<script src="<c:url value='/template/admin/js/ace.min.js'/>"></script>
</body>
</html>
