package br.com.link.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.action.ListCompanies;
import br.com.link.gerenciador.action.NewCompany;
import br.com.link.gerenciador.action.RemoveCompany;
import br.com.link.gerenciador.action.ShowCompany;
import br.com.link.gerenciador.action.UpdateCompany;

@WebServlet("/entry")
public class UniqueEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAction = request.getParameter("action");

		if (paramAction.equals("ListCompanies")) {
			ListCompanies action = new ListCompanies();
			action.execute(request, response);
		} else if (paramAction.equals("RemoveCompany")) {
			RemoveCompany action = new RemoveCompany();
			action.execute(request, response);
		} else if (paramAction.equals("ShowCompany")) {
			ShowCompany action = new ShowCompany();
			action.execute(request, response);
		} else if (paramAction.equals("UpdateCompany")) {
			UpdateCompany action = new UpdateCompany();
			action.execute(request, response);
		} else if (paramAction.equals("NewCompany")) {
			NewCompany action = new NewCompany();
			action.execute(request, response);
		}

	}

}
