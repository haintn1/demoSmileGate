package com.example.converter.exception;

import com.example.constant.B2BCoreConstants;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.util.Strings;

import java.util.List;


public final class B2bConvertDataType
{

	public static String convertListToString(List<String> categoryStrList){
		if (CollectionUtils.isNotEmpty(categoryStrList)) {
			return String.join(B2BCoreConstants.DELIMITERS.COMMA, categoryStrList);
		}
		return Strings.EMPTY;
	}
}
