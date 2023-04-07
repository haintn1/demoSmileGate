package com.example.service.impl;

import com.example.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;

import java.util.Objects;


@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public boolean saveOrUpdate(ProductEntity entity)
	{
		if(Objects.nonNull(entity)) {
			return Objects.nonNull(productRepository.save(entity));
		}
		return false;
	}
}
