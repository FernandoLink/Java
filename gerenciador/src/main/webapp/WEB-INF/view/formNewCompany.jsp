<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entry" var="linkServletNewCompany"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Company</title>
</head>
<body>
<c:import url="logout.jsp" />
	
	<form action="${linkServletNewCompany}" method="post">

		Name: <input type="text" name="name" /> 
		Opening Date: <input type="text" name="date" /> 
		<input
			type="hidden" name="action" value="NewCompany" />
		<input type="submit" />
	</form>

</body>
</html>