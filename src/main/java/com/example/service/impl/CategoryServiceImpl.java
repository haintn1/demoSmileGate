package com.example.service.impl;

import com.example.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryService;

import java.util.Objects;


@Service("CategoryServiceImpl")
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public boolean saveOrUpdate(CategoryEntity entity)
	{
		if(Objects.nonNull(entity)) {
			return Objects.nonNull(categoryRepository.save(entity));
		}
		return false;
	}
}
