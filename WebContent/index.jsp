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


	<a href="<%=request.getContextPath()%>/sheet2Servlet?m=sheet2Delete&aid=1&qing=222">删除</a>
	<a href="<%=request.getContextPath()%>/sheet2Servlet?m=sheetUpBy&aid=1&qing=222">驳回</a>
	<a href="<%=request.getContextPath()%>/sheet2Servlet?m=sheetInsert&aid=1&fid=444&fname=222&pnum=222&gong=222&gprice=222&gdian=66&gsav=555&maxprice=25&minprice=5555&psave=555&zprice=55&zhuan=555&qing=5555">添加</a>                                             
	<a href="<%=request.getContextPath()%>/sheet2Servlet?m=sheetUpdate&aid=1&fid=444&fname=222&pnum=222&gong=222&gprice=222&gdian=66&gsav=555&maxprice=25&minprice=5555&psave=555&zprice=55&zhuan=555&qing=5555">修改</a>                                             

</body>
</html>