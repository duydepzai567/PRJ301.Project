/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author DUCDUY2003
 */
public class ProductTypeList {
    String ProductTypeID, Name;

    public ProductTypeList() {
    }

    public ProductTypeList(String ProductTypeID, String Name) {
        this.ProductTypeID = ProductTypeID;
        this.Name = Name;
    }

    public String getProductTypeID() {
        return ProductTypeID;
    }

    public String getName() {
        return Name;
    }

    public void setProductTypeID(String ProductTypeID) {
        this.ProductTypeID = ProductTypeID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public String toString() {
        return "ProductTypeList{" + "ProductTypeID=" + ProductTypeID + ", Name=" + Name + '}';
    }

   
    }
    
    

