package com.example.credit_application.SpringBootProduct;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {


    @Id
    private int creditId;
    private String productName;
    private int productValue;



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductValue() {
        return productValue;
    }

    public void setProductValue(int productValue) {
        this.productValue = productValue;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }
}
