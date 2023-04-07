package com.example.dto.response;


import java.util.ArrayList;
import java.util.List;


public class FacetResult
{
	private String code;
	private String localizedName;
	private String fieldName;
	private List<FacetResultEntry> facetResultEntries = new ArrayList<FacetResultEntry>();
	boolean isRange;
	private Long priority;
	private boolean isMultiSelect;

	public String getCode()
	{
		return code;
	}

	public void setCode(final String code)
	{
		this.code = code;
	}

	public List<FacetResultEntry> getFacetResultEntries()
	{
		return facetResultEntries;
	}

	public void addFacetResultEntry(final FacetResultEntry facetResultEntry)
	{
		facetResultEntries.add(facetResultEntry);
	}

	public void setFacetResultEntries(final List<FacetResultEntry> facetResultEntries)
	{
		this.facetResultEntries = facetResultEntries;
	}

	public String getLocalizedName()
	{
		return localizedName;
	}

	public void setLocalizedName(final String localizedName)
	{
		this.localizedName = localizedName;
	}

	public String getFieldName()
	{
		return fieldName;
	}

	public void setFieldName(final String fieldName)
	{
		this.fieldName = fieldName;
	}

	public boolean isRange()
	{
		return isRange;
	}

	public void setRange(final boolean isRange)
	{
		this.isRange = isRange;
	}

	public Long getPriority()
	{
		return priority;
	}

	public void setPriority(final Long priority)
	{
		this.priority = priority;
	}

	public boolean isMultiSelect()
	{
		return isMultiSelect;
	}

	public void setMultiSelect(final boolean isMultiSelect)
	{
		this.isMultiSelect = isMultiSelect;
	}


}
