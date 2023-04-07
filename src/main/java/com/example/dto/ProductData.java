package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@lombok.Data
public class ProductData implements Serializable
{
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private String productCode;

	@JsonProperty("name")
	private String productName;

	@JsonProperty("price")
	private double productPrice;

	@JsonProperty("description")
	private String productDescription;

	@JsonProperty("image_url")
	private String mainImageUrl;

	@JsonProperty("sku")
	private String sku;

	@JsonProperty("categories")
	private List<String> categories;

	@JsonProperty("discount")
	private int discount;

	@Override
	public String toString()
	{
		return "ProductData{" + "productCode='" + productCode + '\'' + ", productName='" + productName + '\'' + ", productPrice="
				+ productPrice + ", productDescription='" + productDescription + '\'' + ", mainImageUrl='" + mainImageUrl + '\''
				+ ", sku='" + sku + '\'' + ", categories=" + categories + ", discount=" + discount + '}';
	}

}
