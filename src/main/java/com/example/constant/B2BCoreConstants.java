package com.example.constant;

import org.springframework.stereotype.Component;


@Component
public final class B2BCoreConstants
{

	public interface PRODUCT_TYPE
	{
		int NORMAL = 1;

	}
	public interface MESSAGE
	{
		String SUCCESS = "Success";

		String CREATE_FAIL = "Created fail";

		String ADD_PRODUCT_TO_CART_FAIL = "Add product to cart fail";
	}

	public interface DELIMITERS
	{
		String COMMA = ",";
	}
}
