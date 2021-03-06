<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextroot" value="${pageContext.request.contextPath}"></c:set>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script>
  	window.menu = '${title}';
  </script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/template.css" rel="stylesheet">

<!-- Bootstrap swatch - Theme css -->
<link href="${css}/bootstrap-swatch.css" rel="stylesheet">

</head>


<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/header.jsp"%>

		<!--  Put condition to show only carosusel and content if on home page. -->
		<div class="content">
			<c:if test="${homeviewclicked}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${contactviewclicked}">
				<%@include file="contact.jsp"%>
			</c:if>

			<c:if test="${aboutviewclicked}">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${allproductsclicked || categoryproductsclicked}">
				<%@include file="viewproducts.jsp"%>
			</c:if>	
			
			
		</div>


		<!-- /.container -->

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/navigation.js"></script>
	</div>
</body>

</html>
