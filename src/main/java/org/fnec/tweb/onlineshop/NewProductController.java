package org.fnec.tweb.onlineshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NewProductController {
    
    @Autowired
    private ProductsRepository productsRepository;
    
    @PostMapping("/add")
	public String newProduct(
			@RequestParam(name="type", required=false, defaultValue="") int type,
			@RequestParam(name="label", required=false, defaultValue="") String label,
			@RequestParam(name="price", required=false, defaultValue="") float price,
			@RequestParam(name="quantity", required=false, defaultValue="") int quantity,
			@RequestParam(name="desc", required=false, defaultValue="") String desc,
			@RequestParam(name="typeLabel", required=false, defaultValue="") String typeLabel,
			Model model)
	{

		if(type == 0)
		{
			typeLabel = "Informática";
		}
		else if(type == 1)
		{
			typeLabel = "Telemóveis";
		}
		else if(type == 2)
		{
			typeLabel = "Música, CDs, Vinil";
		}
		else if(type == 3)
		{
			typeLabel = "Som, Colunas, Auscultadores";
		}
		else if(type == 4)
		{
			typeLabel = "Livros";
		}
		else 
		{
			typeLabel = "Filmes, DVDs";
		}

		productsRepository.save(new Products(type, label, price, quantity, desc, typeLabel));

		model.addAttribute("type", type);
		model.addAttribute("label", label);
		model.addAttribute("price", price);
		model.addAttribute("quantity", quantity);
		model.addAttribute("desc", desc);
		model.addAttribute("typeLabel", typeLabel);

		return "new-product-view";
	}
}
