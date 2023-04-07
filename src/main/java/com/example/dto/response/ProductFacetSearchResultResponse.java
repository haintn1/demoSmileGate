package com.example.dto.response;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class ProductFacetSearchResultResponse
{
	private List<Product> products = new ArrayList<Product>();
	private List<FacetResult> facets = new ArrayList<FacetResult>();
	private List<FacetSortResult> sortFilters = new ArrayList<FacetSortResult>();


	long limit;
	long page;
	int total_page;
	int total_record;

	public List<Product> getProducts()
	{
		return products;
	}

	public void setProducts(final List<Product> products)
	{
		this.products = products;
	}

	public void addProduct(final Product product)
	{
		products.add(product);
	}

	public List<FacetResult> getFacets()
	{
		return facets;
	}

	public void addFacet(final FacetResult facet)
	{
		facets.add(facet);
	}

	public void setFacets(final List<FacetResult> facets)
	{
		this.facets = facets;
	}

	public List<FacetSortResult> getSortFilters()
	{
		return sortFilters;
	}

	public void setSortFilters(final List<FacetSortResult> sortFilters)
	{
		this.sortFilters = sortFilters;
	}


	public long getLimit()
	{
		return limit;
	}

	public void setLimit(final long limit)
	{
		this.limit = limit;
	}

	public long getPage()
	{
		return page;
	}

	public void setPage(final long page)
	{
		this.page = page;
	}

	public int getTotal_page()
	{
		return total_page;
	}

	public void setTotal_page(final int total_page)
	{
		this.total_page = total_page;
	}

	public int getTotal_record()
	{
		return total_record;
	}

	public void setTotal_record(final int total_record)
	{
		this.total_record = total_record;
	}

}
