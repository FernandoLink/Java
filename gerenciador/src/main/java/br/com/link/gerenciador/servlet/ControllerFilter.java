package br.com.link.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.action.Action;

//@WebFilter("/entry")
public class ControllerFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String paramAction = request.getParameter("action");

		String className = "br.com.link.gerenciador.action." + paramAction;
		String name = null;
		try {
			Class classe = Class.forName(className);
			Action action = (Action) classe.newInstance();
			name = action.execute(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] typeAddress = name.split(":");
		if (typeAddress[0].equals("forward")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/view/" + typeAddress[1]);
			requestDispatcher.forward(request, response);
		} else {
			response.sendRedirect(typeAddress[1]);
		}
	}

}
