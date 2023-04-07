package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@FieldNameConstants
public class B2BProduct
{
    @JsonProperty("id")
    private Long id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "image")
    private String image;

    @JsonProperty(value = "sku")
    private String sku;

    @JsonProperty(value = "price")
    private Double price;

    @JsonProperty(value = "categoryNames")
    List<String> categoryNames;

    @JsonProperty(value = "discount")
    private Integer discount;
}