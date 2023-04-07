package com.example.facade.impl;

import com.example.constant.B2BCoreConstants;
import com.example.converter.CategoryConverter;
import com.example.converter.CommonConverter;
import com.example.dto.ResponseData;
import com.example.dto.request.CategoryRequestData;
import com.example.entity.CategoryEntity;
import com.example.facade.CategoryFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import com.example.service.CategoryService;

import javax.transaction.Transactional;


@Service
public class CategoryFacadeImpl implements CategoryFacade
{
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CategoryConverter categoryConverter;
	@Autowired
	private CommonConverter commonConverter;
	private final Logger LOGGER = LoggerFactory.getLogger(CategoryFacadeImpl.class);

	@Override
	@Transactional
	public ResponseData createCategory(final CategoryRequestData categoryRequestData)
	{
		CategoryEntity model = null;
		String message = B2BCoreConstants.MESSAGE.SUCCESS;
		try
		{
			if (categoryRequestData != null)
			{
				model = categoryConverter.convertDataToModel(categoryRequestData);
				final boolean isCreated = categoryService.saveOrUpdate(model);
				if (isCreated)
				{
					return commonConverter.convertToResponse(model, true, message);
				}
			}
		}
		catch (final Exception e)
		{
			LOGGER.error("Exception when create category with error : {} ", e.getMessage());
			if (e instanceof HttpClientErrorException)
			{
				HttpClientErrorException ex = (HttpClientErrorException) e;
				return commonConverter.convertToResponse(null, false, ex.getResponseBodyAsString());

			}
		}
		return commonConverter.convertToResponse(null, false, B2BCoreConstants.MESSAGE.CREATE_FAIL);
	}

}
