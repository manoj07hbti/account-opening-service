package AccountOpeningServiceRohit.model;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity (name = "Bank_Opening")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "Account_Number")
    long account_no;

    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
    @Size(max = 10)
    @Column(name = "Pan_Number",nullable = false)
    private String pan_no;

    @Column(name = "Aadhar_Number",nullable = false)
    private double aadhar_no;

    @Column(name ="Amount")
    private double amount;
    public Account() {
    }

    public Account(long account_no, String name, String address, String pan_no, double aadhar_no, double amount) {
        this.account_no = account_no;
        this.name = name;
        this.address = address;
        this.pan_no = pan_no;
        this.aadhar_no = aadhar_no;
        this.amount = amount;
    }

    public long getAccount_no() {
        return account_no;
    }

    public void setAccount_no(long account_no) {
        this.account_no = account_no;
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

