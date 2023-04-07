package com.example.facade.impl;

import com.example.constant.B2BCoreConstants;
import com.example.converter.CartConverter;
import com.example.converter.CommonConverter;
import com.example.dto.ResponseData;
import com.example.dto.request.CartRequestData;
import com.example.entity.CartEntity;
import com.example.facade.CartFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import com.example.service.CartService;

import java.util.Objects;


@Service
public class CartFacadeImpl implements CartFacade
{
	private final Logger LOGGER = LoggerFactory.getLogger(CartFacadeImpl.class);
	@Autowired
	private CartService cartService;
	@Autowired
	private CartConverter cartConverter;
	@Autowired
	private CommonConverter commonConverter;

	@Override
	public ResponseData addToCart(final CartRequestData requestData)
	{
		String message = B2BCoreConstants.MESSAGE.SUCCESS;
		try
		{
			if (Objects.nonNull(requestData))
			{
				CartEntity cartEntity = cartConverter.convertDataToModel(requestData);
				final boolean isCreated = cartService.saveCart(cartEntity);
				if (isCreated)
				{
					return commonConverter.convertToResponse(cartEntity, true, message);
				}
			}
		}
		catch (final Exception e)
		{
			LOGGER.error("Exception when create product with error : {} ", e.getMessage());
			if (e instanceof HttpClientErrorException)
			{
				HttpClientErrorException ex = (HttpClientErrorException) e;
				return commonConverter.convertToResponse(null, false, ex.getResponseBodyAsString());

			}
		}
		return commonConverter.convertToResponse(null, false, B2BCoreConstants.MESSAGE.ADD_PRODUCT_TO_CART_FAIL);
	}

}
