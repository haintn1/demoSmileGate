package com.example.dto;

import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;

import java.util.ArrayList;
import java.util.List;


public class Query
{

	private String query;
	private Integer page = 0;
	private Integer limit = 16;
	private List<Filter> filters = new ArrayList<>();
	private List<Filter> preFilters = new ArrayList<>();

	private String indexName;
	private String customerId;
	private String sort;

	public String getQuery()
	{
		return query;
	}

	public void setQuery(final String query)
	{
		this.query = query;
	}

	public List<Filter> getFilters()
	{
		return filters;
	}

	public void setFilters(final List<Filter> filters)
	{
		this.filters = filters;
	}



	public Integer getPage()
	{
		return page;
	}

	public void setPage(final Integer page)
	{
		this.page = page;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public static final class Filter
	{
		private String key;
		private Object value;
		private String from;
		private String to;
		private String type;
		private boolean isMultiSelect;

		public boolean isMultiSelect()
		{
			return isMultiSelect;
		}

		public void setMultiSelect(final boolean isMultiSelect)
		{
			this.isMultiSelect = isMultiSelect;
		}

		public String getType()
		{
			return type;
		}

		public String getFrom()
		{
			return from;
		}

		public String getTo()
		{
			return to;
		}

		public String getKey()
		{
			return key;
		}

		public Object getValue()
		{
			return value;
		}

		public QueryBuilder toQuery(final String fieldName)
		{
			if ("term".equals(type))
			{
				return QueryBuilders.termQuery(fieldName + ".keyword", this.value);
			}
			if ("value".equals(type))
			{
				return QueryBuilders.termQuery(fieldName, this.value);
			}
			else if ("range".equals(type) && !this.getKey().startsWith("nested_"))
			{
				return createRangeQueryBuilder(fieldName, from, to);
			}
			else
			{
				throw new RuntimeException("Unknown type: " + type);
			}
		}

		private RangeQueryBuilder createRangeQueryBuilder(final String name, final String from, final String to)
		{
			final RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery(name);
			if (StringUtils.isEmpty(from) == false)
			{
				rangeQueryBuilder.from(from);
			}
			if (StringUtils.isEmpty(to) == false)
			{
				rangeQueryBuilder.to(to);
			}

			return rangeQueryBuilder;
		}
	}

	public String getIndexName()
	{
		return indexName;
	}

	public void setIndexName(final String indexName)
	{
		this.indexName = indexName;
	}

	public List<Filter> getPreFilters()
	{
		return preFilters;
	}

	public void setPreFilters(final List<Filter> preFilters)
	{
		this.preFilters = preFilters;
	}

	public String getSort()
	{
		return sort;
	}

	public void setSort(final String sort)
	{
		this.sort = sort;
	}

	public String getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(final String customerId)
	{
		this.customerId = customerId;
	}

}
