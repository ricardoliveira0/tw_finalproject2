package org.fnec.tweb.onlineshop;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/signup").setViewName("signup");
		registry.addViewController("/advanced_search").setViewName("advanced_search");
		registry.addViewController("/product").setViewName("product");
		registry.addViewController("/add-client").setViewName("new-client");
		registry.addViewController("/add-order").setViewName("new-order");
		registry.addViewController("/add-product").setViewName("new-product");
		registry.addViewController("/list-products").setViewName("list-products");
	}
}
