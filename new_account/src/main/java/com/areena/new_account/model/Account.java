package com.areena.new_account.model;

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
    @Size(min = 3, message = "Your name must be at least 3 character long")
    private String name;
    @Column(name = "phone")
    @Pattern(regexp = "[0-9]{10}",message = "your number should contain digits only and should be of 10 digits ")
    private String phone;
    @Column(name = "panNumber")
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Your PAN should be valid")
    private String panNumber;

    public Account() {

    }

    public Account(String name, String phone, String panNumber) {
        super();
        this.name = name;
        this.phone = phone;
        this.panNumber = panNumber;
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