package com.example.repository;

import com.example.dto.B2BProduct;
import com.example.dto.Query;
import com.example.dto.response.ProductFacetSearchResultResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexProductRepository
{
	public ResponseEntity<String> indexProduct(List<B2BProduct> products);

	ResponseEntity<ProductFacetSearchResultResponse> search(Query query);
}
