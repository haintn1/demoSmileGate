package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public class BaseCartModel extends CommonEntity implements Serializable
{

    @Column(name = "cart_number")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long cartNumber;

    @JsonProperty("id")
    @Column(name = "cart_id", unique = true)
    private String cartId;

    @JsonProperty("customer_id")
    @Column(name = "customer_id")
    private String customerId;

    @JsonProperty("line_items")
    @Transient
    private LineItemEntity lineItemModel;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public LineItemEntity getLineItemModel() {
        return lineItemModel;
    }

    public void setLineItemModel(LineItemEntity lineItemModel) {
        this.lineItemModel = lineItemModel;
    }

    public Long getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(Long cartNumber) {
        this.cartNumber = cartNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString()
    {
        return "BaseCartModel{" + "cartNumber=" + cartNumber + ", cartId='" + cartId + '\'' + ", customerId='" + customerId + '\''
              + ", lineItemModel=" + lineItemModel + '}';
    }
}
