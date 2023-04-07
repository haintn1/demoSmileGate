package com.example.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class CategoryId implements Serializable {

    private static final long serialVersionUID = -8697261371942777214L;

    private String categoryId;

    private String branchId;
}
