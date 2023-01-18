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

@WebServlet("/updateCompany")
public class UpdateCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nameCompany = request.getParameter("name");
		String paramDateOpen = request.getParameter("date");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Date dateOpen = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateOpen = sdf.parse(paramDateOpen);
		} catch (ParseException exception) {
			throw new ServletException(exception);
		}

		Bank bank = new Bank();
		Company empresa = bank.getCompanyById(id);
		empresa.setName(nameCompany);
		empresa.setDateOpen(dateOpen);

		response.sendRedirect("listCompanies");
	}

}
