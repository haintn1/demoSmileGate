package com.example.dto.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Product
{


	private String image_url;
	private String sku;
	private double max_price;
	private double min_price;
	private double discount;
	private double product_type;
	private boolean is_base_product;

	private String name;
	private String code;
	private double price;
	private String color;
	private String material;
	private String id;
	private String productImageUrl;
	private String brand;
	private String brandLogoUrl;
	private Date lastUpdated;
	private int stock;
	private int commission;
	private String description;

	private List<String> categories;
	private List<String> acls;

	public Product()
	{

	}

	public Product(final String name, final double price, final String color, final String material, final String id,
			final String productImageUrl, final String brand, final String brandLogoUrl, final Date lastUpdated, final int stock,
			final int commission)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.material = material;
		this.id = id;
		this.productImageUrl = productImageUrl;
		this.brand = brand;
		this.brandLogoUrl = brandLogoUrl;
		this.lastUpdated = lastUpdated;
		this.stock = stock;
		this.commission = commission;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public String getColor()
	{
		return color;
	}

	public String getId()
	{
		return id;
	}

	public String getProductImageUrl()
	{
		return productImageUrl;
	}

	public String getBrand()
	{
		return brand;
	}

	public String getBrandLogoUrl()
	{
		return brandLogoUrl;
	}

	public Date getLastUpdated()
	{
		return lastUpdated;
	}

	public int getStock()
	{
		return stock;
	}

	public int getCommission()
	{
		return commission;
	}

	public String getMaterial()
	{
		return material;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public void setPrice(final double price)
	{
		this.price = price;
	}

	public void setColor(final String color)
	{
		this.color = color;
	}

	public void setMaterial(final String material)
	{
		this.material = material;
	}

	public void setId(final String id)
	{
		this.id = id;
	}

	public void setProductImageUrl(final String productImageUrl)
	{
		this.productImageUrl = productImageUrl;
	}

	public void setBrand(final String brand)
	{
		this.brand = brand;
	}

	public void setBrandLogoUrl(final String brandLogoUrl)
	{
		this.brandLogoUrl = brandLogoUrl;
	}

	public void setLastUpdated(final Date lastUpdated)
	{
		this.lastUpdated = lastUpdated;
	}

	public void setStock(final int stock)
	{
		this.stock = stock;
	}

	public void setCommission(final int commission)
	{
		this.commission = commission;
	}

	public List<String> getCategories()
	{
		return categories;
	}

	public void setCategories(final List<String> categories)
	{
		this.categories = categories;
	}

	public List<String> getAcls()
	{
		return acls;
	}

	public void setAcls(final List<String> acls)
	{
		this.acls = acls;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getImage_url()
	{
		return image_url;
	}

	public void setImage_url(final String image_url)
	{
		this.image_url = image_url;
	}

	public String getSku()
	{
		return sku;
	}

	public void setSku(final String sku)
	{
		this.sku = sku;
	}

	public double getMax_price()
	{
		return max_price;
	}

	public void setMax_price(final double max_price)
	{
		this.max_price = max_price;
	}

	public double getMin_price()
	{
		return min_price;
	}

	public void setMin_price(final double min_price)
	{
		this.min_price = min_price;
	}

	public double getDiscount()
	{
		return discount;
	}

	public void setDiscount(final double discount)
	{
		this.discount = discount;
	}

	public double getProduct_type()
	{
		return product_type;
	}

	public void setProduct_type(final double product_type)
	{
		this.product_type = product_type;
	}

	public boolean isIs_base_product()
	{
		return is_base_product;
	}

	public void setIs_base_product(final boolean is_base_product)
	{
		this.is_base_product = is_base_product;
	}

	public String getDescription()
	{
		if (StringUtils.isEmpty(description)) {
			return "";
		}
		return description.replaceAll("\\<.*?\\>", "");
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
