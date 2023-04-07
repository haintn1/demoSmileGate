package com.example.converter.impl;

import com.example.converter.CartConverter;
import com.example.dto.request.CartLineItemData;
import com.example.dto.request.CartRequestData;
import com.example.entity.CartEntity;
import com.example.entity.CustomsItemModel;
import com.example.entity.LineItemEntity;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Component("CartConverterImpl")
public class CartConverterImpl implements CartConverter
{
	@Override
	public CartEntity convertDataToModel(CartRequestData cartRequestData)
	{
		CartEntity cartEntity = null;
		if (Objects.nonNull(cartRequestData))
		{
			cartEntity = new CartEntity();
			cartEntity.setCustomerId(cartRequestData.getCustomerId());
			cartEntity.setLineItemModel(new LineItemEntity(convertCartLineItemDataToCartLineItemModel(cartRequestData.getLineItems())));
		}
		return cartEntity;
	}

	@Override
	public List<CustomsItemModel> convertCartLineItemDataToCartLineItemModel(List<CartLineItemData> cartLineItemDataList)
	{
		List<CustomsItemModel> customsItemModelList = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(cartLineItemDataList))
		{
			for (CartLineItemData cartLineItemData:cartLineItemDataList)
			{
				CustomsItemModel customsItemModel = new CustomsItemModel();
				customsItemModel.setItemId(cartLineItemData.getProductId());
				customsItemModel.setItemName(cartLineItemData.getName());
				customsItemModel.setListPrice(cartLineItemData.getFixedPrice());
				customsItemModel.setQuantity(cartLineItemData.getQuantity());
				customsItemModel.setSku(cartLineItemData.getSku());
				customsItemModelList.add(customsItemModel);
			}
		}
		return customsItemModelList;
	}
}
