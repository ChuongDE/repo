/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author PC
 */
public class Account {

    private int userID;
    private String username;
    private String password;
    private int role;
    private String Name;
    private String Address;
    private String Phone;

    public Account() {
    }

    public Account(int userID, String username, String password, int role, String Name, String Address, String Phone) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
    }

    public Account(int userID, String username, String password, int role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Account(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, String Name, String Address, String Phone) {
        this.username = username;
        this.password = password;
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" + " username=" + username + ", password=" + password + ", role=" + role + '}';
    }

}