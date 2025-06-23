package com.yuwenwww.springbootmall.rowmapper;

import com.yuwenwww.springbootmall.constant.ProductCategory;
import com.yuwenwww.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        String categoryStr = rs.getString("category");
        ProductCategory category = ProductCategory.valueOf(categoryStr);
        product.setCategory(category); // 轉成Enum很常用

//        product.setCategory(ProductCategory.valueOf(rs.getString("category")));

        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));

// *** 這裡是最關鍵的修改 ***
        // 從資料庫讀取 Timestamp
        Timestamp createdTimestamp = rs.getTimestamp("created_date");
        Timestamp lastModifiedTimestamp = rs.getTimestamp("last_modified_date");

        // 將 Timestamp 轉換為 LocalDateTime
        if (createdTimestamp != null) {
            product.setCreatedDate(createdTimestamp.toLocalDateTime());
        }
        if (lastModifiedTimestamp != null) {
            product.setLastModifiedDate(lastModifiedTimestamp.toLocalDateTime());
        }


        return product;
    }
}
