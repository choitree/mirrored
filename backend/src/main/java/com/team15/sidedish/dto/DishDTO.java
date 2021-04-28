package com.team15.sidedish.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class DishDTO {

    @JsonProperty("detail_hash")
    private String detailHash;
    private String image;

    @JsonProperty("delivery_type")
    private String deliveryType;
    private String title;
    private String description;

    @JsonProperty("normal_price")
    private Integer normalPrice;
    @JsonProperty("special_price")
    private Integer specialPrice;
    private String[] badge;

    public DishDTO(String detailHash, String image, String deliveryType, String title, String description, Integer normalPrice, Integer specialPrice, String[] badge) {
        this.detailHash = detailHash;
        this.image = image;
        this.deliveryType = deliveryType;
        this.title = title;
        this.description = description;
        this.normalPrice = normalPrice;
        this.specialPrice = specialPrice;
        this.badge = badge;
    }

    public String getDetailHash() {
        return detailHash;
    }

    public String getImage() {
        return image;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getNormalPrice() {
        return normalPrice;
    }

    public Integer getSpecialPrice() {
        return specialPrice;
    }

    public String[] getBadge() {
        return badge;
    }

    public Integer[] makePriceArray() {
        return (normalPrice != null) ? new Integer[]{normalPrice, specialPrice} : new Integer[]{specialPrice};
    }

    @Override
    public String toString() {
        return "DishDTO{" +
                "detailHash='" + detailHash + '\'' +
                ", image='" + image + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", normalPrice=" + normalPrice +
                ", specialPrice=" + specialPrice +
                ", badge=" + Arrays.toString(badge) +
                '}';
    }
}
