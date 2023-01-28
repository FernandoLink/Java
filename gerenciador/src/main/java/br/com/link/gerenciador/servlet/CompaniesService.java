package br.com.link.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.link.gerenciador.model.Bank;
import br.com.link.gerenciador.model.Company;

@WebServlet("/Companies")
public class CompaniesService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Company> companies = new Bank().getCompanies();

		String value = request.getHeader("Accept");

		if (value.contains("json")) {
			Gson gson = new Gson();
			String json = gson.toJson(companies);
			response.setContentType("application/json");
			response.getWriter().print(json);
		} else if (value.contains("html")) {
			response.setContentType("application/json");
			response.getWriter().print("{'message’:'no content html'}");
		} else if (value.contains("xml")) {
			XStream xstream = new XStream();
			xstream.alias("company", Company.class);
			String xml = xstream.toXML(companies);
			response.setContentType("application/xml");
			response.getWriter().print(xml);
		} else {
			response.setContentType("application/json");
			response.getWriter().print("{'message’:'no content'}");
		}

	}

}
