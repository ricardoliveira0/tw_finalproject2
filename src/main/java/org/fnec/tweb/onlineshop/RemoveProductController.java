package org.fnec.tweb.onlineshop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RemoveProductController {

    @Autowired
    private ProductsRepository repository;
	
	@PostMapping("/remove")
	public String removeProduct(
		@RequestParam(name="id", required=false, defaultValue="") Long id,
		Model model)
	{
		repository.deleteById(id);

		List<Products> productsList = (List<Products>) repository.findAll();
		model.addAttribute("productsList", productsList);
		return "list-products";
	}
}
