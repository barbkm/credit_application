package com.example.credit_application.credit;

import com.example.credit_application.customer.Customer;
import com.example.credit_application.product.Product;

public class CreditInfo
{
    private Credit credit;
    private Customer customer;
    private Product product;

    public CreditInfo(Credit credit, Customer customer, Product product) {
        this.credit = credit;
        this.customer = customer;
        this.product = product;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
