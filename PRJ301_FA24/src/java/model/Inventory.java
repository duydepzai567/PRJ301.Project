/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DUCDUY2003
 */
public class Inventory {
    String  ProductID, ProductType, Name, Brand, MadeIn, Price, ProductTypeID;
    
    public Inventory() {
    }

    public Inventory(String ProductID, String ProductType, String Name, String Brand, String MadeIn, String Price, String ProductTypeID) {
        this.ProductID = ProductID;
        this.ProductType = ProductType;
        this.Name = Name;
        this.Brand = Brand;
        this.MadeIn = MadeIn;
        this.Price = Price;
        this.ProductTypeID = ProductTypeID;
    }

    public String getProductID() {
        return ProductID;
    }

    public String getProductType() {
        return ProductType;
    }

    public String getName() {
        return Name;
    }

    public String getBrand() {
        return Brand;
    }

    public String getMadeIn() {
        return MadeIn;
    }

    public String getPrice() {
        return Price;
    }

    public String getProductTypeID() {
        return ProductTypeID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setMadeIn(String MadeIn) {
        this.MadeIn = MadeIn;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public void setProductTypeID(String ProductTypeID) {
        this.ProductTypeID = ProductTypeID;
    }
    
    
}