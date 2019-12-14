<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
//	公司 列表
	<%-- <c:forEach  items="${list}" var="li"   >
		${li.fname}
		${li.fprice}
		${li.fstatus}
	</c:forEach>
	 --%>
	 	<a href="<%=request.getContextPath()%>/IndexServlet?m=searchStudent">总的列表</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=dianList">电站列表</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=gongList">公司</a>
	<a href="<%=request.getContextPath()%>/sheet2Servlet?m=sheet2List">复杂的上报那个</a>
	 <br/>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=pwoerupdate&pid=1&pname=222&pprice=2222">电站修改</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=pwoerInsert&pid=1&pname=222&pprice=2222">电站添加</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=pwoerdelete&pid=10">电站删除</a>
	
	
	<a href="<%=request.getContextPath()%>/IndexServlet?m=filialeUpdate&fid=1&fname=1111&fprice=555&fstatus=2">公司修改</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=filialeInsert&fid=1&fname=1111&fprice=5543&fstatus=2">公司添加</a>
	<a href="<%=request.getContextPath()%>/IndexServlet?m=filialeDelete&fid=6">公司删除</a>
	
	
</div>

</body>
</html>