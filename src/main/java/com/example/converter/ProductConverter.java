package com.example.converter;

import com.example.dto.ResponseData;
import com.example.dto.request.ProductRequestData;
import com.example.entity.ProductEntity;

public interface ProductConverter
{
	ProductEntity convertDataToModel(ProductRequestData productData);
}
