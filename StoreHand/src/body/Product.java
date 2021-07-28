/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package body;

import java.util.Date;

/**
 *
 * @author Suisei
 */
public class Product {
    private int id_product;
    private String product_name;
    private int stock;
    private int total_stock;
    private int sold_stock;
    private Date expiry_date;

    public int getTotal_stock() {
        return total_stock;
    }

    public void setTotal_stock(int total_stock) {
        this.total_stock = total_stock;
    }

    public int getSold_stock() {
        return sold_stock;
    }

    public void setSold_stock(int sold_stock) {
        this.sold_stock = sold_stock;
    }

    
    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }
    
    
}
