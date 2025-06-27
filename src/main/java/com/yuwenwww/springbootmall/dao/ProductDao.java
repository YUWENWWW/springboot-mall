package com.yuwenwww.springbootmall.dao;

import com.yuwenwww.springbootmall.dto.ProductRequest;
import com.yuwenwww.springbootmall.model.Product;
import org.springframework.stereotype.Repository;


public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
