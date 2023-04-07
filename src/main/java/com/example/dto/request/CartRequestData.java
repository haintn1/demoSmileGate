package com.example.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartRequestData implements Serializable
{
	@JsonProperty("checkout_id")
	private String checkoutId;

	@JsonProperty("customer_id")
	private String customerId;

	@JsonProperty("line_items")
	private List<CartLineItemData> lineItems;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public List<CartLineItemData> getLineItems()
	{
		return lineItems;
	}

	public void setLineItems(List<CartLineItemData> lineItems)
	{
		this.lineItems = lineItems;
	}

	public String getCheckoutId()
	{
		return checkoutId;
	}

	public void setCheckoutId(String checkoutId)
	{
		this.checkoutId = checkoutId;
	}

	@Override
	public String toString()
	{
		return "CartRequestData{" + "checkoutId='" + checkoutId + '\'' + ", customerId='" + customerId + '\'' + ", lineItems="
				+ lineItems + '}';
	}
}

