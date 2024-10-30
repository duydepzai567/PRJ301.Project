/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author DUCDUY2003
 */
public class Management {

    public static void add(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String EmployeesID, DateofReceipt, ShippingDate, PurchasePrice, SellingPrice, IOputID, CustomerID, ProductID;

    public Management() {
    }

    public Management(String EmployeesID, String DateofReceipt, String ShippingDate, String PurchasePrice, String SellingPrice, String IOputID, String CustomerID, String ProductID) {
        this.EmployeesID = EmployeesID;
        this.DateofReceipt = DateofReceipt;
        this.ShippingDate = ShippingDate;
        this.PurchasePrice = PurchasePrice;
        this.SellingPrice = SellingPrice;
        this.IOputID = IOputID;
        this.CustomerID = CustomerID;
        this.ProductID = ProductID;
    }

    public String getEmployeesID() {
        return EmployeesID;
    }

    public String getDateofReceipt() {
        return DateofReceipt;
    }

    public String getShippingDate() {
        return ShippingDate;
    }

    public String getPurchasePrice() {
        return PurchasePrice;
    }

    public String getSellingPrice() {
        return SellingPrice;
    }

    public String getIOputID() {
        return IOputID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setEmployeesID(String EmployeesID) {
        this.EmployeesID = EmployeesID;
    }

    public void setDateofReceipt(String DateofReceipt) {
        this.DateofReceipt = DateofReceipt;
    }

    public void setShippingDate(String ShippingDate) {
        this.ShippingDate = ShippingDate;
    }

    public void setPurchasePrice(String PurchasePrice) {
        this.PurchasePrice = PurchasePrice;
    }

    public void setSellingPrice(String SellingPrice) {
        this.SellingPrice = SellingPrice;
    }

    public void setIOputID(String IOputID) {
        this.IOputID = IOputID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    @Override
    public String toString() {
        return "Management{" + "EmployeesID=" + EmployeesID + ", DateofReceipt=" + DateofReceipt + ", ShippingDate=" + ShippingDate + ", PurchasePrice=" + PurchasePrice + ", SellingPrice=" + SellingPrice + ", IOputID=" + IOputID + ", CustomerID=" + CustomerID + ", ProductID=" + ProductID + '}';
    }

}
