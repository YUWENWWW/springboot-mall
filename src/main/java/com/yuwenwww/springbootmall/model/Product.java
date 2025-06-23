package com.yuwenwww.springbootmall.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yuwenwww.springbootmall.constant.ProductCategory;

import java.time.LocalDateTime;
import java.util.Date;

public class Product {
    private Integer productId;
    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;
;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // 為 createdDate 欄位添加 @JsonFormat 註解
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdDate;

    // 為 lastModifiedDate 欄位添加 @JsonFormat 註解
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lastModifiedDate;

    // Getter 和 Setter 也必須是 LocalDateTime 類型
    public LocalDateTime getCreatedDate() { // 修改返回類型為 LocalDateTime
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) { // 修改參數類型為 LocalDateTime
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastModifiedDate() { // 修改返回類型為 LocalDateTime
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) { // 修改參數類型為 LocalDateTime
        this.lastModifiedDate = lastModifiedDate;
    }
}
