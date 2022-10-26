package com.accountopeningservice.accountopeningservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account_opening_service")
public class Account {
    @Id
    @GeneratedValue
    private long account_no;
    private String name;
    private String address;
    private String pan_no;
    private long aadhar_no;

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

    public long getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(long aadhar_no) {
        this.aadhar_no = aadhar_no;
    }
}
