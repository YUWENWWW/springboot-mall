package com.yuwenwww.springbootmall.service;

import com.yuwenwww.springbootmall.constant.ProductCategory;
import com.yuwenwww.springbootmall.dto.ProductRequest;
import com.yuwenwww.springbootmall.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
