package com.example.converter.impl;

import com.example.converter.CategoryConverter;
import com.example.dto.request.CategoryRequestData;
import com.example.entity.CategoryEntity;
import org.springframework.stereotype.Component;


@Component("CategoryConverterImpl")
public class CategoryConverterImpl implements CategoryConverter
{
	@Override
	public CategoryEntity convertDataToModel(final CategoryRequestData data)
	{
		CategoryEntity model = null;
		if (data != null)
		{
			model = new CategoryEntity();
			model.setCategoryName(data.getCategoryName());
			model.setCategoryDescription(data.getCategoryDescription());
		}
		return model;
	}
}
