package com.test.amaro.amarotest.model;

/**
 * Created by luiszacheu on 11/07/18.
 */
public class Product {

    private String name;
    private String style;
    private String codeColor;
    private String color;
    private boolean onSale;
    private String regularPrice;
    private String actualPrice;
    private String discountPercentage;
    private String installments;
    private String image;

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
