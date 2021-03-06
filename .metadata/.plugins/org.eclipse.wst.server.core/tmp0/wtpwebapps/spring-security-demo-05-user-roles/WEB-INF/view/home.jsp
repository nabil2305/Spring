<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<title>luv2code Company Home Page</title>
</head>

<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
		<p>
			User: <security:authentication property="principal.username"/>
			<br><br>
			Roles(s):<security:authentication property="principal.authorities"/>
		</p>
	<hr>
	<security:authorize access="hasRole('MANAGER')">
		<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
		
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
	<a href="${pageContext.request.contextPath}/systems">Systems Meeting</a>
	</security:authorize>
	<hr>
	Welcome to the luv2code company home page!
	<hr>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		
		<input type="submit" value="logout" />
	
	</form:form>
</body>

</html>