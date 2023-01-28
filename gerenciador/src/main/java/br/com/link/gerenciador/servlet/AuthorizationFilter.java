package br.com.link.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("/entry")
public class AuthorizationFilter implements Filter {

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String paramAction = request.getParameter("action");
		
		HttpSession session = request.getSession();
		boolean userNotLogged = (session.getAttribute("userLogged") == null);
		boolean isProtectedAction = !(paramAction.equals("Login") || paramAction.equals("LoginForm"));
		
		if (isProtectedAction && userNotLogged) {
			response.sendRedirect("entry?action=LoginForm");
			return;
		} 
		
		chain.doFilter(request, response);
	}

}
