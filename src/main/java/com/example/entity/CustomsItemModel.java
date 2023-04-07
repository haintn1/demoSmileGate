package com.example.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


public class CustomsItemModel implements Serializable
{
    @JsonProperty("id")
    private String itemId;

    @JsonProperty("sku")
    private String sku;

    @JsonProperty("name")
    private String itemName;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("list_price")
    private double listPrice;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(final String itemId) {
        this.itemId = itemId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(final double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "CustomsItemModel{" +
                "itemId='" + itemId + '\'' +
                ", sku='" + sku + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", listPrice='" + listPrice + '\'' +
                '}';
    }


}
