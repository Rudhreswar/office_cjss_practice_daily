package com.collection.listofproducts;

import java.util.List;

public class ProductsModel {

    private String productId;
    private String productName;

    public List<SkuModel> getSkuModelList() {
        return skuModelList;
    }

    public void setSkuModelList(List<SkuModel> skuModelList) {
        this.skuModelList = skuModelList;
    }

    private List<SkuModel> skuModelList;

    public ProductsModel(String productId, String productName, List<SkuModel> skuModelList) {
        this.productId = productId;
        this.productName = productName;
        this.skuModelList = skuModelList;

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
