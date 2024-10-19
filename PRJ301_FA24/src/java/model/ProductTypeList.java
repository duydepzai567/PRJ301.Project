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
    String ProductTypeList, Name;

    public ProductTypeList() {
    }

    public ProductTypeList(String ProductTypeList, String Name) {
        this.ProductTypeList = ProductTypeList;
        this.Name = Name;
    }

    public String getProductTypeList() {
        return ProductTypeList;
    }

    public String getName() {
        return Name;
    }

    public void setProductTypeList(String ProductTypeList) {
        this.ProductTypeList = ProductTypeList;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
