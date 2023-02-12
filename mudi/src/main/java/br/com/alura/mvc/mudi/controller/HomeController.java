package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51nddK6nSwL._AC_SX679_.jpg");
		pedido.setUrlProduto(
				"https://www.amazon.com.br/Mi-Basic-2S-Xiaomi-Conectividade/dp/B095ZTNFJ2/ref=sr_1_1_sspa?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=10NGBEA45E7N1&keywords=xiaomi&qid=1676175504&sprefix=xiaomi%2Caps%2C237&sr=8-1-spons&ufe=app_do%3Aamzn1.fos.6a09f7ec-d911-4889-ad70-de8dd83c8a74&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExV0NaSlcyQTFKN0hDJmVuY3J5cHRlZElkPUEwNTI2NjU5R05MNEw1RTNPNzRXJmVuY3J5cHRlZEFkSWQ9QTA0ODU1OTIxRzVVTEFZQ1VRQUtXJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		pedido.setDescricao(
				"Fone de Ouvido Bluetooth Mi Basic 2S Xiaomi Preto, da Marca Xiaomi com Conectividade: Bluetooth: 5.0, Capacidade estojo de carregamento: 600 mAh, Conexão Wireless, Porta do estojo de carregamento USB-C, Tempo de música fone Até 4 horas");

		List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
		model.addAttribute("pedidos", pedidos);

		return "home";
	}
}
