package com.example.converter;

import com.example.dto.ResponseData;


public interface CommonConverter
{
	ResponseData convertToResponse(Object model, boolean status, String message);
}
