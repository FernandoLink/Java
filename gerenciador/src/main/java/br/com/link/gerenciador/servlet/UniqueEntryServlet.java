package br.com.link.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.link.gerenciador.action.Action;

@WebServlet("/entry")
public class UniqueEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAction = request.getParameter("action");

		String className = "br.com.link.gerenciador.action." + paramAction;

		String name;
		try {
			Class classe = Class.forName(className);
			Action action = (Action) classe.newInstance();
			name = action.execute(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] typeAddress = name.split(":");
		if (typeAddress[0].equals("forward")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/view/" + typeAddress[1]);
			requestDispatcher.forward(request, response);
		} else {
			response.sendRedirect(typeAddress[1]);
		}

	}

}
