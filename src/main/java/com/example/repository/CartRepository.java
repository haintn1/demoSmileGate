package com.example.repository;

import com.example.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<CartEntity, String>
{
	CartEntity findByCartIdAndIsDeleted(String cartId, boolean isDeleted);
}
