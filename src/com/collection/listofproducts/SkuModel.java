package com.collection.listofproducts;

public class SkuModel {

    private String skuId;
    private String skuSize;
    private double price;

    public SkuModel(String skuId, String skuSize, Float price) {
        this.skuId=skuId;
        this.skuSize=skuSize;
        this.price=price;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuSize() {
        return skuSize;
    }

    public void setSkuSize(String skuSize) {
        this.skuSize = skuSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
