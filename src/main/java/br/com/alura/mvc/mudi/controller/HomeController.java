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
		pedido.setNomeProduto("AQUECEDOR BAQ1510B 127V");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/41DvD65TeiS._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/gp/product/B0891DVW2K?pf_rd_r=JJ2R0W5WGWD9G4B9QC55&pf_rd_p=abb22e6b-8812-4b76-a424-5f0b098d2c90&pd_rd_r=22074560-ce38-462e-bb71-43d9f7be409f&pd_rd_w=QCvf1&pd_rd_wg=aAPtl&ref_=pd_gw_unk");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
