package com.deli.server.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.*;

@Data
public class ProductListDto {
    private int id;
    private String productname;
    private int gender;
    private int age;
    private int price;
    private String imageUrl;

    @QueryProjection
    public ProductListDto(int id, String productname, int gender, int age, int price, String imageUrl) {
        this.id = id;
        this.productname = productname;
        this.gender = gender;
        this.age = age;
        this.price = price;
        this.imageUrl = imageUrl;
    }
}
