package com.example.dto.response;

public class FacetResultEntry
{
	private String label;
	private String value;
	private long count;
	Double from;
	Double to;

	public long getCount()
	{
		return count;
	}

	public void setCount(final long count)
	{
		this.count = count;
	}

	public Double getFrom()
	{
		return from;
	}

	public void setFrom(final Double from)
	{
		this.from = from;
	}

	public Double getTo()
	{
		return to;
	}

	public void setTo(final Double to)
	{
		this.to = to;
	}

	public String getLabel()
	{
		return label;
	}

	public void setLabel(final String label)
	{
		this.label = label;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(final String value)
	{
		this.value = value;
	}
}