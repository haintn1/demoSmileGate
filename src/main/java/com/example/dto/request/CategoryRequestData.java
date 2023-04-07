package com.example.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.dto.ProductData;
import lombok.Getter;
import lombok.Setter;


@JsonInclude(value = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class CategoryRequestData
{
    private static final long serialVersionUID = -4806334519886048057L;

    @JsonProperty("category_description")
    private String categoryDescription;

    @JsonProperty("category_name")
    private String categoryName;
}
