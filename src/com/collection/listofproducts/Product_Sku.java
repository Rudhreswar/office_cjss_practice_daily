package com.collection.listofproducts;

import java.util.ArrayList;
import java.util.List;

public class Product_Sku {

    public static void action() {
        SkuModel sku1 = new SkuModel("sku1", "M", 200f);
        SkuModel sku2 = new SkuModel("sku2", "L", 210f);
        SkuModel sku3 = new SkuModel("sku3", "S", 190f);
        SkuModel sku4 = new SkuModel("sku4", "M", 300f);

        List<SkuModel> skuModelList1 = new ArrayList<>();

        skuModelList1.add(sku1);
        skuModelList1.add(sku2);
        skuModelList1.add(sku3);

        List<SkuModel> skuModelList2 = new ArrayList<>();

        skuModelList2.add(sku4);
        skuModelList2.add(sku2);


        ProductsModel productsModel1 = new ProductsModel("product1", "pName1", skuModelList1);
        ProductsModel productsModel2 = new ProductsModel("product2", "pName2", skuModelList2);

        List<ProductsModel> productsModelList = new ArrayList<>();

        productsModelList.add(productsModel1);
        productsModelList.add(productsModel2);

        for (ProductsModel pm : productsModelList) {

            System.out.println("Product Id : " + productsModel1.getProductId() + "Product Name : " + productsModel1.getProductName());

            for (SkuModel sm : pm.getSkuModelList()) {
                System.out.println("SKU ID : " + sm.getSkuId() + "Sku SIZE : " + sm.getSkuSize() + " Price : " + sm.getPrice());
            }
        }


    }

    public static void main(String[] args) {
        action();
    }
}
