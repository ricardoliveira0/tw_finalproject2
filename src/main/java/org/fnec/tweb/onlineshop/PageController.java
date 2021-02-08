package org.fnec.tweb.onlineshop;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @Autowired
    private ProductsRepository repository;
	
	@GetMapping("/")
	public String listProductsPage(Model model) 
	{
		List<Products> listProductsPage = (List<Products>) repository.findAll();

		model.addAttribute("listProductsPage", listProductsPage);
		return "/index";
	}
}
