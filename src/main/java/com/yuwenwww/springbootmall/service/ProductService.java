package com.yuwenwww.springbootmall.service;

import com.yuwenwww.springbootmall.dto.ProductQueryParams;
import com.yuwenwww.springbootmall.dto.ProductRequest;
import com.yuwenwww.springbootmall.model.Product;

import java.util.List;


public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
