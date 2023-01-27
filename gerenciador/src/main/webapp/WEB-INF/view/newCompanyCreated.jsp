<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<c:import url="logout.jsp" />
	<c:if test="${not empty company}">
		New Company ${ company } successfully registered!
	</c:if>
	<c:if test="${empty company}">
		Company not registered!
	</c:if>
</body>
</html>