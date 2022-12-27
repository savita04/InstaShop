package com.Shop.InstaShop.Models;

import javax.persistence.*;

@Entity
@Table(name="ProductInStock")
public class ProductStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int productStockId;
    public int productId;
    public int inStock;

    public ProductStock(int productStockId, int productId, int inStock) {
        this.productStockId = productStockId;
        this.productId = productId;
        this.inStock = inStock;
    }
    public ProductStock(){

    }

    public int getProductStockId() {
        return productStockId;
    }

    public void setProductStockId(int productStockId) {
        this.productStockId = productStockId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
