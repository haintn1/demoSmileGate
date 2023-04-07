package com.example.facade;

import com.example.dto.Response;
import com.example.dto.ResponseData;
import com.example.dto.request.ProductRequestData;


public interface ProductFacade
{
	ResponseData createProduct(final ProductRequestData productRequestData);
}
