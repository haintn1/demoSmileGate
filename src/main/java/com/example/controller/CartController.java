package com.example.controller;


import com.example.dto.ResponseData;
import com.example.dto.request.CartRequestData;
import com.example.facade.CartFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class CartController
{
    private final Logger logger = LoggerFactory.getLogger(CartController.class);

	@Autowired
	CartFacade cartFacade;

	@PostMapping(value = "/add-to-cart")
	public ResponseData addToCart(@RequestBody final CartRequestData requestCartData)
	{
		return cartFacade.addToCart(requestCartData);
	}
}
