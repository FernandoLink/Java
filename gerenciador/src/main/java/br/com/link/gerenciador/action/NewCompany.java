package br.com.link.gerenciador.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.model.Bank;
import br.com.link.gerenciador.model.Company;

public class NewCompany implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

		return "redirect:entry?action=ListCompanies";
	}
}
