<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Customer Confirmation Page</title>
</head>

<body>
	The customer is confirmed : ${customer.firstName } ${customer.lastName}
	<br><br>
	Free passes: ${customer.freePasses}	
	<br><br>
	Postal Code entered: ${customer.postalCode}
	<br><br>
	COurse Code entered: ${customer.courseCode}
</body>
</html>