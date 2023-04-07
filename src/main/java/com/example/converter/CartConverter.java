package com.example.converter;

import com.example.dto.request.CartLineItemData;
import com.example.dto.request.CartRequestData;
import com.example.entity.CartEntity;
import com.example.entity.CustomsItemModel;
import com.example.entity.ProductEntity;

import java.util.List;


public interface CartConverter
{
	CartEntity convertDataToModel(CartRequestData cartRequestData);
	List<CustomsItemModel> convertCartLineItemDataToCartLineItemModel(List<CartLineItemData> cartLineItemDataList);
}
