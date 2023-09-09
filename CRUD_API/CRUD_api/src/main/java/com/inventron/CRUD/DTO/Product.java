package com.inventron.CRUD.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private int productPrice;
    private String productDescription;
    private String productValidity;
    private String productQuality;
    private int productRating;
    private String productSeller;
    private String productType;
}
