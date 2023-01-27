package br.com.link.gerenciador.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.model.Bank;
import br.com.link.gerenciador.model.User;

public class Login implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		Bank bank = new Bank();
		User user = bank.existUser(login, password);
		if(user != null) {
			return "redirect:entry?action=ListCompanies";
		} else {
			return "redirect:entry?action=LoginForm";
		}
	}

}
