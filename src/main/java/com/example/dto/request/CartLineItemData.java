package com.example.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartLineItemData implements Serializable
{
	private String id;
	private String sku;
	private String name;
	private int quantity;
	private Double discount;

	@JsonProperty("type_percent")
	private boolean typePercent;

	@JsonProperty("product_id")
	private String productId;

	@JsonProperty("fixed_price")
	private double fixedPrice;

	@JsonProperty("products_str")
	private String productsStr;

	public String getProductsStr()
	{
		return productsStr;
	}

	public void setProductsStr(String productsStr)
	{
		this.productsStr = productsStr;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public String getSku()
	{
		return sku;
	}

	public void setSku(final String sku)
	{
		this.sku = sku;
	}

	public String getId()
	{
		return id;
	}

	public void setId(final String id)
	{
		this.id = id;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(final int quantity)
	{
		this.quantity = quantity;
	}

	public String getProductId()
	{
		return productId;
	}

	public void setProductId(final String productId)
	{
		this.productId = productId;
	}

	public Double getDiscount()
	{
		return discount;
	}

	public void setDiscount(final Double discount)
	{
		this.discount = discount;
	}

	public boolean isPercentType()
	{
		return typePercent;
	}

	public void setPercentType(final boolean percentType)
	{
		this.typePercent = percentType;
	}

	public boolean isTypePercent()
	{
		return typePercent;
	}

	public void setTypePercent(final boolean typePercent)
	{
		this.typePercent = typePercent;
	}

	public double getFixedPrice()
	{
		return fixedPrice;
	}

	public void setFixedPrice(final double fixedPrice)
	{
		this.fixedPrice = fixedPrice;
	}


	@Override
	public String toString()
	{
		return "CartLineItemData{" + "id='" + id + '\'' + ", sku='" + sku + '\'' + ", name='" + name + '\'' + ", quantity="
				+ quantity + ", discount=" + discount + ", typePercent=" + typePercent + ", productId='" + productId + '\''
				+ ", fixedPrice=" + fixedPrice + ", productsStr='" + productsStr + '\'' + '}';
	}
}