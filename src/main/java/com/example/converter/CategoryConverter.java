package com.example.converter;

import com.example.dto.request.CategoryRequestData;
import com.example.entity.CategoryEntity;


public interface CategoryConverter
{
	CategoryEntity convertDataToModel(CategoryRequestData productData);
}
