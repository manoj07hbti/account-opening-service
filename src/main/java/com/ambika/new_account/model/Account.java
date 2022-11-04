package com.ambika.new_account.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name")
    @Size(min = 4, message = "Name should have at least 4 characters")
    private String name;
    @Column(name = "phone")
    @Pattern(regexp = "[0-9]{10}", message = "Mobile No. should be of 10 digit")
    private String phone;
    @Column(name = "panNumber")
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]", message = "Please enter a valid PAN number")
    private String panNumber;
    @Column(name="address")
    private String address;



    public Account() {

    }

    public Account(String name, String phone, String panNumber,String address) {
        this.name = name;
        this.phone = phone;
        this.panNumber = panNumber;
        this.address = address;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", panNumber='" + panNumber + '\'' +
                '}';

    }
}