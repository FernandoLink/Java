package br.com.link.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.model.Bank;

public class RemoveCompany implements Action {

	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Bank bank = new Bank();
		bank.removeCompany(id);

		return "redirect:entry?action=ListCompanies";
	}
}
