package com.example.productService.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductEntity {

    @Id
    private String productId;
    private String name;
    private BigDecimal price;

    private Integer quantity;
}
