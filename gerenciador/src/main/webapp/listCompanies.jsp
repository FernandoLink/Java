<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List, br.com.link.gerenciador.servlet.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/removeCompany" var="linkServletRemoveCompany" />
<c:url value="/showCompany" var="linkServletShowCompany" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Standard Tag Library</title>
</head>
<body>

	List Companies JSTL:
	<br />
	<ul>
		<c:forEach items="${companies}" var="company">
			<li>${company.name}-<fmt:formatDate value="${company.dateOpen}"
					pattern="dd/MM/yyyy" /> <a
				href="${linkServletShowCompany}?id=${company.id}">update</a> <a
				href="${linkServletRemoveCompany}?id=${company.id}">remove</a></li>
		</c:forEach>
	</ul>
</body>
</html>