/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DUCDUY2003
 */
public class Employees {
    String EmployeesID, Name, Birthday, JoinDate, Address, Phone, Email;

    public Employees() {
    }

    public Employees(String EmployeesID, String Name, String Birthday, String JoinDate, String Address, String Phone, String Email) {
        this.EmployeesID = EmployeesID;
        this.Name = Name;
        this.Birthday = Birthday;
        this.JoinDate = JoinDate;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public String getEmployeesID() {
        return EmployeesID;
    }

    public String getName() {
        return Name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getJoinDate() {
        return JoinDate;
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

    public void setEmployeesID(String EmployeesID) {
        this.EmployeesID = EmployeesID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public void setJoinDate(String JoinDate) {
        this.JoinDate = JoinDate;
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
