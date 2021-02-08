package org.fnec.tweb.onlineshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NewOrderController {

    @Autowired
    private ClientRepository clientRepository;
    
    @Autowired
    private OrdersRepository ordersRepository;
    
    @PostMapping("/new-order")
	public String newOrder(
			@ModelAttribute Orders order,
			Model model) 
	{

		model.addAttribute("order", new Orders());
		/* System.out.println(pID);
		Client client = clientRepository.findById(clientID);
		ordersRepository.save(new Orders(client, pID));
		model.addAttribute("order", order);
		model.addAttribute("clientID", clientID);
		model.addAttribute("pID", pID); */

		return "order";
	}
}
