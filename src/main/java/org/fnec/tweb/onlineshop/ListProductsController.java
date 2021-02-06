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
public class ListProductsController {

    @Autowired
    private ProductsRepository repository;
	
	@GetMapping("/list-products")
	public String listProducts(Model model) 
	{
		List<Products> productsList = (List<Products>) repository.findAll();

		model.addAttribute("productsList", productsList);
		System.out.print(productsList);
		return "list-products";
	}
}
