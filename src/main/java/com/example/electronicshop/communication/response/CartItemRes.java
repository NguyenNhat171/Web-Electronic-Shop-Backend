package com.example.electronicshop.communication.response;

import com.example.electronicshop.models.product.ProductImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemRes {
    private String itemId;
    private String name;
    private String productid;
    private double sale;
    private List<ProductImage> image;
    private BigDecimal price;
    private String productOptionId;
    private String value;
    private long quantity;
    private long stock;
    private BigDecimal subPrice;
}