package com.example.dto.response;

public class FacetSortResult
{
	private String code;
	private String localizedName;
	private boolean isSelected;
	private boolean isDefault;

	public String getCode()
	{
		return code;
	}

	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getLocalizedName()
	{
		return localizedName;
	}

	public void setLocalizedName(final String localizedName)
	{
		this.localizedName = localizedName;
	}

	public boolean isSelected()
	{
		return isSelected;
	}

	public void setSelected(final boolean selected)
	{
		isSelected = selected;
	}

	public boolean isDefault()
	{
		return isDefault;
	}

	public void setDefault(final boolean aDefault)
	{
		isDefault = aDefault;
	}
}
