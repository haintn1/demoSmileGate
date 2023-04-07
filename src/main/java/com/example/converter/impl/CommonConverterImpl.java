package com.example.converter.impl;

import com.example.constant.Constant;
import com.example.converter.CommonConverter;
import com.example.dto.ResponseData;
import org.springframework.stereotype.Component;


@Component("CommonConverterImpl")
public class CommonConverterImpl implements CommonConverter
{
	@Override
	public ResponseData convertToResponse(final Object model, final boolean status, final String message)
	{
		final ResponseData data = new ResponseData();
		data.setResult(model);
		if (model == null)
		{
			data.setMessage(Constant.MESSAGE.UPDATE_FAIL);
			data.setDescription(message);
			data.setSuccess(false);
		}
		else
		{
			data.setMessage(Constant.MESSAGE.UPDATE_SUCCESS);
			data.setDescription(message);
			data.setSuccess(true);
		}
		return data;
	}
}
