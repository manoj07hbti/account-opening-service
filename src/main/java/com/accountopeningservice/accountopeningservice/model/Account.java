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
   // @Pattern(regexp = "\"[A-Z]{5}[0-9]{4}[A-Z]{1}\"")
    @Size(max = 10)
    @Column(name = "PAN_Number", nullable = false)
    private String pan_no;


    @Size(max = 12)
    @Column(name = "Aadhar_Number", nullable = false)
    private String aadhar_no;

    @Size(max = 16)
    @Column(name = "Amount")
    private String amount;
    public Account() {
    }

    public Account(long account_no, String name, String address, String pan_no, String aadhar_no,String amount) {
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

    public String getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(String aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String  amount) {
        this.amount = amount;
    }
}
