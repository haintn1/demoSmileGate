package com.example.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "cart")
@DynamicUpdate
public class CartEntity extends BaseCartModel implements Serializable {

    @Column(name = "cart_name")
    private String name;

    @Column(name = "cart_description")
    private String description;

    @Column(name = "cart_saved_date")
    private Date saveDate;

    @Column(name = "cart_status")
    private Integer status;

    @Column(name = "cart_sub_total")
    private Double cartSubTotal;

    @Column(name = "cart_qty")
    private Integer quantity;

    public Date getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(final Date saveDate) {
        this.saveDate = saveDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(final Integer status) {
        this.status = status;
    }

    public Double getCartSubTotal() {
        return cartSubTotal;
    }

    public void setCartSubTotal(final Double cartSubTotal) {
        this.cartSubTotal = cartSubTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
