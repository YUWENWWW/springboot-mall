package com.yuwenwww.springbootmall.service;

import com.yuwenwww.springbootmall.dto.ProductRequest;
import com.yuwenwww.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
