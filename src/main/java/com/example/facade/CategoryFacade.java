package com.example.facade;

import com.example.dto.ResponseData;
import com.example.dto.request.CategoryRequestData;


public interface CategoryFacade
{
	ResponseData createCategory(final CategoryRequestData productRequestData);
}
