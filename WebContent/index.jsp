<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<body>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=searchStudent">总的列表</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=dianList">电站列表</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=gongList">公司</a>
	<a href="<%=request.getContextPath()%>/sheet2Servlet?m=sheet2List">复杂的上报那个</a>

</body>
</html>