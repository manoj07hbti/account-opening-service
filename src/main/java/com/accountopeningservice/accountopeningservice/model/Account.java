package com.accountopeningservice.accountopeningservice.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "Account_opening_service")
public class Account {
    @Id
    @GeneratedValue
    private long account_no;
    @NotEmpty
    @Column(name = "Name",nullable = false)
    private String name;
    @NotEmpty
    @Column(name = "Current_Address",nullable = false)
    private String address;
    @Pattern(regexp = "^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$")
    @NotEmpty
    @Column(name = "PAN_no", nullable = false, unique = true, length = 10)
    private String pan_no;
    @Digits(integer = 16, fraction = 0)
    @NotEmpty
    @Column(name = "Aadhar_No", nullable = false, unique = true)
    private double aadhar_no;

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public Account() {
    }

    public Account(long account_no, String name, String address, String pan_no, long aadhar_no) {
        this.account_no = account_no;
        this.name = name;
        this.address = address;
        this.pan_no = pan_no;
        this.aadhar_no = aadhar_no;
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

}
