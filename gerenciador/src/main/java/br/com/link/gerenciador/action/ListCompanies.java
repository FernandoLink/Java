package br.com.link.gerenciador.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.model.Bank;
import br.com.link.gerenciador.model.Company;

public class ListCompanies implements Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Bank bank = new Bank();
		List<Company> list = bank.getCompanies();
		request.setAttribute("companies", list);
		return "forward:listCompanies.jsp";
	}

}
