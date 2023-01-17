package br.com.link.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String nameCompany = request.getParameter("name");
		String paramDateOpen = request.getParameter("date");
		
		Date dateOpen = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateOpen = sdf.parse(paramDateOpen);
		} catch (ParseException exception) {
			throw new ServletException(exception);
		}

		Company company = new Company(nameCompany);
		company.setDateOpen(dateOpen);

		Bank bank = new Bank();
		bank.add(company);

		request.setAttribute("company", company.getName());

//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listCompanies");
//		requestDispatcher.forward(request, response);
		
		response.sendRedirect("listCompanies");
	}
}
