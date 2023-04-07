package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


public class LineItemEntity implements Serializable
{
	@JsonProperty("custom_items")
	List<CustomsItemModel> customsItemModelList;

	public List<CustomsItemModel> getCustomsItemModelList()
	{
		return customsItemModelList;
	}

	public void setCustomsItemModelList(final List<CustomsItemModel> customsItemModelList)
	{
		this.customsItemModelList = customsItemModelList;
	}

	public LineItemEntity(List<CustomsItemModel> customsItemModelList)
	{
		this.customsItemModelList = customsItemModelList;
	}

	@Override
	public String toString()
	{
		return "LineItemEntity{" + "customsItemModelList=" + customsItemModelList + '}';
	}
}
