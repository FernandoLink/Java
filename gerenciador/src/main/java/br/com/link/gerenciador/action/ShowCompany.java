package br.com.link.gerenciador.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.model.Bank;
import br.com.link.gerenciador.model.Company;

public class ShowCompany {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Bank bank = new Bank();

		Company company = bank.getCompanyById(id);

		request.setAttribute("company", company);
		RequestDispatcher rd = request.getRequestDispatcher("/formUpdateCompany.jsp");
		rd.forward(request, response);
	}
}
