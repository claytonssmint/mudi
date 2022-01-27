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
		pedido.setUrlImagem("https://cf.shopee.com.br/file/b0fe3c80de9c867a6ac377f165c3ab43");
		pedido.setUrlProduto("https://shopee.com.br/Xiaomi-Redmi-Note-8-Dual-SIM-64-GB-Neptune-blue-4-GB-RAM-Azul-Vers%C3%A3o-Global-i.332650533.5261524519?sp_atk=6b4dee1c-ea53-4f61-848a-935a9187923e");
		pedido.setDescricao("uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
