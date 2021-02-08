package org.fnec.tweb.onlineshop;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductPageController {

    @Autowired
    private ProductsRepository repository;
	
	@GetMapping("/product")
	public String ProductPage(@RequestParam(name="id", required=false, defaultValue="") Long id, Model model) 
	{
		Products products = repository.findById(id).orElse(null);

		model.addAttribute("products", products);
		return "product.html";
	}
}
