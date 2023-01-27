package br.com.link.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

	private static List<Company> list = new ArrayList<Company>();
	private static List<User> listUsers = new ArrayList<User>();
	private static Integer keySequence = 1;

	static {
		Company company1 = new Company("Link");
		company1.setId(Bank.keySequence++);
		Company company2 = new Company("InfoLink");
		company2.setId(Bank.keySequence++);
		list.add(company1);
		list.add(company2);

		User u1 = new User("link", "1234");
		User u2 = new User("luiza", "5678");

		listUsers.add(u1);
		listUsers.add(u2);
	}

	public void add(Company company) {
		company.setId(Bank.keySequence++);
		Bank.list.add(company);
	}

	public List<Company> getCompanies() {
		return Bank.list;
	}

	public void removeCompany(Integer id) {
		Iterator<Company> it = list.iterator();
		while (it.hasNext()) {
			Company company = it.next();
			if (company.getId() == id) {
				it.remove();
			}
		}
	}

	public Company getCompanyById(Integer id) {
		for (Company company : list) {
			if (company.getId() == id) {
				return company;
			}
		}
		return null;
	}

	public User existUser(String login, String password) {
		for (User user : listUsers) {
			if (user.isEqual(login, password)) {
				return user;
			}
		}
		return null;
	}
}
