package com.test.amaro.amarotest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class Product {

    @SerializedName("name")
    private String name;

    @SerializedName("style")
    private String style;

    @SerializedName("code_color")
    private String codeColor;

    @SerializedName("code_slug")
    private String colorSlug;

    @SerializedName("color")
    private String color;

    @SerializedName("on_sale")
    private boolean onSale;

    @SerializedName("regular_price")
    private String regularPrice;

    @SerializedName("actual_price")
    private String actualPrice;

    @SerializedName("discount_percentage")
    private String discountPercentage;

    @SerializedName("installments")
    private String installments;

    @SerializedName("image")
    private String image;

    private List<Size> sizes;

    public Product() {
    }

    public Product(String name, String actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCodeColor() {
        return codeColor;
    }

    public void setCodeColor(String codeColor) {
        this.codeColor = codeColor;
    }

    public String getColorSlug() {
        return colorSlug;
    }

    public void setColorSlug(String colorSlug) {
        this.colorSlug = colorSlug;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(String actualPrice) {
        this.actualPrice = actualPrice;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public int getActualPriceCents() {
        return Integer.parseInt(this.actualPrice.replace("R$", "")
                .replace(",", "")
                .replace(".", "")
                .trim());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", actualPrice='" + actualPrice + '\'' +
                '}';
    }

}
