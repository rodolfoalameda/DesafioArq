package DesafioArq.produto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@GetMapping
	public List<Produto> findAll(){
		return new ArrayList<Produto>();
	}
	
}
