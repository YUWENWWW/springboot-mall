package com.yuwenwww.springbootmall.dao;

import com.yuwenwww.springbootmall.constant.ProductCategory;
import com.yuwenwww.springbootmall.dto.ProductQueryParams;
import com.yuwenwww.springbootmall.dto.ProductRequest;
import com.yuwenwww.springbootmall.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
