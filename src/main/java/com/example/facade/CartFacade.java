package com.example.facade;

import com.example.dto.Response;
import com.example.dto.ResponseData;
import com.example.dto.request.CartRequestData;


public interface CartFacade
{
	ResponseData addToCart(CartRequestData requestData);
}
