package com.pontt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pontt.entity.product.Product;

@Controller

public class ProductController {

	@RequestMapping(value = "product/seek", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public Product getProductById() {
		return new Product("producto", "el mejor producto especial");
	}
	
}
