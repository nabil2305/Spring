<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>

<body>
	<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName" />
	
	<br><br>
	Last name: <form:input path="lastName" />
	
	<br><br>

	<form:select path="country">
		<form:options items="${student.countryOptions}" />
	</form:select>
	
		
	<br><br>
	Favorite Language
	Java <form:radiobutton path="favoriteLanguage" value="Java" />
	C# <form:radiobutton path="favoriteLanguage" value="C#" />
	python<form:radiobutton path="favoriteLanguage" value="python" />
	c<form:radiobutton path="favoriteLanguage" value="C" />
	<br><br>
	
	Favorite OS
	Linux <form:checkbox path="operatingSystems" value="Linux" />
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
	Windows <form:checkbox path="operatingSystems" value="Windows" />
	
	<br><br>
	
	<input type="submit" value="Submit" />
	
	</form:form>
	
	
	
	

</body>


</html>