package account_opening.Service.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Entity(name = "AccountOpening")
public class Account_Details {

    @Id
    @GeneratedValue
    long AccountNo;

    @NotNull
    @Column(name = "Name",nullable = false)
    @Size(min = 2, message = "user name should have at least 2 characters")
    private String name;


    private String Address;
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
    @Column(name = "PAN_NO",nullable = false)
    @Size(min = 10,max = 10,message = "please Enter valid PanCard Number")
    private String Pan_No;

    @Pattern(regexp = "^[0-9]{4}\s[0-9]{4}\s[0-9]{4}+$")
    @Column(name = "Aadhaar_No",nullable = false)
    @Size(min = 14,max = 14,message = "please Enter valid AadhaarCard Number" )
    private String Aadhaar_No;


    private Double Amount;

    //Default const


    public Account_Details() {
    }

    //Pera Const

    public Account_Details(String name, String address, String pan_No, String aadhaar_No, Double amount) {
        this.name = name;
        this.Address = address;
        this.Pan_No = pan_No;
        this.Aadhaar_No = aadhaar_No;
       this.Amount = amount;
    }


    //getter and setter


    public long getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(long accountNo) {
        AccountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPan_No() {
        return Pan_No;
    }

    public void setPan_No(String pan_No) {
        Pan_No = pan_No;
    }

    public String getAadhaar_No() {
        return Aadhaar_No;
    }

    public void setAadhaar_No(String aadhaar_No) {
        Aadhaar_No = aadhaar_No;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double amount) {
        Amount = amount;
    }
}
