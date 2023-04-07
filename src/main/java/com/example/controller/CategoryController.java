package com.example.controller;

import com.example.dto.ResponseData;
import com.example.dto.request.CategoryRequestData;
import com.example.facade.CategoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryController
{
	@Autowired
	private CategoryFacade categoryFacade;

	@PostMapping(value = "/category")
	public ResponseData addCategory(final @RequestBody CategoryRequestData categoryRequestData)
	{
		return categoryFacade.createCategory(categoryRequestData);
	}
}
