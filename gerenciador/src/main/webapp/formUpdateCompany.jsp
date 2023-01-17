<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/updateCompany" var="linkServletUpdateCompany" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Company</title>
</head>
<body>


	<form action="${linkServletUpdateCompany}" method="post">

		Name: <input type="text" name="name" value="${company.name}" />
		Opening Date: <input type="text" name="date" value="<fmt:formatDate value="${company.dateOpen}"
					pattern="dd/MM/yyyy" />" /> 
		<input type="submit" />
	</form>

</body>
</html>
