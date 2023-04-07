package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "product")
@Getter
@Setter
public class ProductEntity extends CommonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_code")
    private int productCode;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name = "product_description", length = 3000)
    private String productDescription;

    @Column(name = "product_image")
    private String productImageUrl;

    @Column(name = "product_sku")
    private String sku;

    @Column(name = "product_categories")
    @Lob
    private String categories;

    @Column(name = "product_cost")
    private Double cost;

    @Column(updatable = false, name = "product_discount")
    private Integer discount;
}
