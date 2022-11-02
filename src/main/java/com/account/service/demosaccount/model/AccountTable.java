package com.account.service.demosaccount.model;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_PENING")
public class AccountTable {

    @Id
    @GeneratedValue
    private long id;

    @Column(name ="name")
    private String name;
    @Column(name ="CurrentAddress")
    private String CurrentAddress;
    @Column(name ="PermanentAddress")
    private String PermanentAddress;
    @Column(name ="PAN")
    private int PAN;
    @Column(name ="ADHAR")
    private int ADHAR;
    @Column(name ="amount")
    private int amount;

    public AccountTable() {

    }

    public long getId() {
        return id;
    }

    public AccountTable(String name, String currentAddress, String permanentAddress, int PAN, int ADHAR, int amount) {
        this.name = name;
        CurrentAddress = currentAddress;
        PermanentAddress = permanentAddress;
        this.PAN = PAN;
        this.ADHAR = ADHAR;
        this.amount = amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentAddress() {
        return CurrentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        CurrentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return PermanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        PermanentAddress = permanentAddress;
    }

    public int getPAN() {
        return PAN;
    }

    public void setPAN(int PAN) {
        this.PAN = PAN;
    }

    public int getADHAR() {
        return ADHAR;
    }

    public void setADHAR(int ADHAR) {
        this.ADHAR = ADHAR;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
