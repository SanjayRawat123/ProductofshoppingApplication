/*
 * Author Name:
 * Date: 11/22/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp.ProductofshoppingApplication.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
   @Id
    private int productId;

    private String productDescrition;

    private double amountInStock;

    public Product() {
    }

    public Product(int productId, String productDescrition, double amountInStock) {
        this.productId = productId;
        this.productDescrition = productDescrition;
        this.amountInStock = amountInStock;
    }

    public int getProductId() {
        return productId;
    }

    public Product setProductId(int productId) {
        this.productId = productId;
        return this;
    }

    public String getProductDescrition() {
        return productDescrition;
    }

    public Product setProductDescrition(String productDescrition) {
        this.productDescrition = productDescrition;
        return this;
    }

    public double getAmountInStock() {
        return amountInStock;
    }

    public Product setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productDescrition='" + productDescrition + '\'' +
                ", amountInStock=" + amountInStock +
                '}';
    }
}