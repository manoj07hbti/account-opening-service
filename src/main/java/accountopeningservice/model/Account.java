package accountopeningservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="account_opening_service")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT NUMBER")
    long account_num;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PAN NUMBER")
    private String pan_num;
    @Column(name = "AADHAR NUMBER")
    private double aadhar_num;
    @Column(name = "AMOUNT")
    private double amount;

    public Account() {
    }

    public Account(long account_num, String name, String address, String pan_num, double aadhar_num, double amount) {
        this.account_num = account_num;
        this.name = name;
        this.address = address;
        this.pan_num = pan_num;
        this.aadhar_num = aadhar_num;
        this.amount = amount;
    }

    public long getAccount_num() {
        return account_num;
    }

    public void setAccount_num(long account_num) {
        this.account_num = account_num;
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

    public String getPan_num() {
        return pan_num;
    }

    public void setPan_num(String pan_num) {
        this.pan_num = pan_num;
    }

    public double getAadhar_num() {
        return aadhar_num;
    }

    public void setAadhar_num(double aadhar_num) {
        this.aadhar_num = aadhar_num;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
