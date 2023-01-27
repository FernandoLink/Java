<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.util.List, br.com.link.gerenciador.model.Company"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entry?action=RemoveCompany" var="linkServletRemoveCompany" />
<c:url value="/entry?action=ShowCompany" var="linkServletShowCompany" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Companies</title>
</head>
<body>
	<c:import url="logout.jsp" />	

	User Logged In: ${userLogged.login}<br><br>
	List Companies:
	<br />
	<ul>
		<c:forEach items="${companies}" var="company">
			<li>${company.name}-<fmt:formatDate value="${company.dateOpen}"
					pattern="dd/MM/yyyy" /> <a
				href="${linkServletShowCompany}&id=${company.id}">update</a> <a
				href="${linkServletRemoveCompany}&id=${company.id}">remove</a></li>
		</c:forEach>
	</ul>
</body>
</html>