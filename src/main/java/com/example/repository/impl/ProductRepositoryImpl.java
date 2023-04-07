package com.example.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public class ProductRepositoryImpl
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductRepositoryImpl.class);
}
