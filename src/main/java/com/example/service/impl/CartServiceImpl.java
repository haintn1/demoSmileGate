package com.example.service.impl;

import com.example.entity.CartEntity;
import org.springframework.stereotype.Service;
import com.example.repository.CartRepository;
import com.example.service.CartService;

import javax.annotation.Resource;
import java.util.Objects;


@Service("CartServiceImpl")
public class CartServiceImpl implements CartService
{
	@Resource
	CartRepository cartRepository;

	@Override
	public boolean saveCart(final CartEntity cartEntity)
	{
		if(Objects.nonNull(cartEntity)) {
			return Objects.nonNull(cartRepository.save(cartEntity));
		}
		return false;
	}
}
