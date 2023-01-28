package br.com.link.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/entry")
public class MonitoringFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		String action = request.getParameter("action");
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		System.out.println("Execution time of " + action + ": " + (after - before) + " milliseconds");
	}

}
