/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DUCDUY2003
 */
public class Customers {
    String CustomerID, CustomerName, Address, Phone, Email;

    public Customers() {
    }

    public Customers(String CustomerID, String CustomerName, String Address, String Phone, String Email) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    
}
