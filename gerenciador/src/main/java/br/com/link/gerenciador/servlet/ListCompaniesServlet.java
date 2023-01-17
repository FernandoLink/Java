package br.com.link.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listCompanies")
public class ListCompaniesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Bank bank = new Bank();
		List<Company> list = bank.getCompanies();

		request.setAttribute("companies", list);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listCompanies.jsp");
		requestDispatcher.forward(request, response);
	}

}
