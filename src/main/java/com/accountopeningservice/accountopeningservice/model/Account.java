package com.accountopeningservice.accountopeningservice.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Account_Opening_Service")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "Account_Number")
    long account_no;

    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name = "Current_Address",nullable = false)
    private String address;
    @Max(10)
   // @Pattern(regexp = "^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$")
    @Column(name = "PAN_Number", nullable = false)
    private String pan_no;

    @Max(12)
    @Column(name = "Aadhar_Number", nullable = false)
    private double aadhar_no;

    @Max(10)
    @Column(name = "Amount")
    private double amount;
    public Account() {
    }

    public Account(long account_no, String name, String address, String pan_no, long aadhar_no,double amount) {
        this.account_no = account_no;
        this.name = name;
        this.address = address;
        this.pan_no = pan_no;
        this.aadhar_no = aadhar_no;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public double getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(double aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
