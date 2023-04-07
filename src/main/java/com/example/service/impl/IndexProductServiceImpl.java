package com.example.service.impl;

import com.example.converter.IndexProductConverter;
import com.example.dto.B2BProduct;
import com.example.entity.CategoryEntity;
import com.example.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.CategoryRepository;
import com.example.repository.ProductRepository;
import com.example.service.IndexProductService;

import java.util.List;


@Service
public class IndexProductServiceImpl implements IndexProductService
{
	@Autowired
	private IndexProductConverter converter;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public List<B2BProduct> getIndexedProducts() {
		final List<ProductEntity> products = productRepository.findAllByIsDeleted(false);
		final List<CategoryEntity> categories = categoryRepository.findAllByIsDeleted(false);

		return converter.convertToB2bProduct(products, categories);
	}

}
