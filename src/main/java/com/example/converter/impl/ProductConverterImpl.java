package com.example.converter.impl;

import com.example.constant.B2BCoreConstants;
import com.example.constant.Constant;
import com.example.converter.ProductConverter;
import com.example.converter.exception.B2bConvertDataType;
import com.example.dto.ResponseData;
import com.example.dto.request.ProductRequestData;
import com.example.entity.ProductEntity;
import org.springframework.stereotype.Component;


@Component("ProductConverterImpl")
public class ProductConverterImpl implements ProductConverter
{
	@Override
	public ProductEntity convertDataToModel(final ProductRequestData data)
	{
		ProductEntity model = null;
		if (data != null)
		{
			model = new ProductEntity();
			model.setCategories(B2bConvertDataType.convertListToString(data.getCategories()));
			model.setDeleted(false);
			model.setDiscount(data.getDiscount());
			model.setProductDescription(data.getProductDescription());
			model.setProductName(data.getProductName());
			model.setProductPrice(data.getProductPrice());
			model.setProductImageUrl(data.getMainImageUrl());
			model.setSku(data.getSku());
			model.setProductCode(Integer.parseInt(data.getProductCode()));
		}
		return model;
	}
}
