package AccountOpeningServiceRohit.model;


import javax.persistence.*;
import javax.validation.constraints.*;

@Entity (name = "Bank_Opening")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "Account_Number",nullable = false)
    long account_no;

    @Column(name = "Name",nullable = false)
    private String name;

    @Column(name = "Address")
    private String address;

    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
    @Size(max = 10,message = "pan card number should be 10 digit...........:)")
    @Column(name = "Pan_Number",nullable = false)
    private String pan_no;


    @Column(name = "Aadhaar_No",nullable = false)
    @Size(min = 12,max = 12,message = "please Enter valid AadhaarCard Number" )
    private String Aadhaar_No;


    @Column(name ="Amount")
    @NotNull(message = "Enter Amount")
    @Min(value = 1000,message = "You must Deposit 1000/- Rupees to open your Bank account......:)")
    private double amount;
    public Account() {
    }
    public Account(long account_no, String name, String address, String pan_no, String Aadhaar_No, double amount) {
        this.account_no = account_no;
        this.name = name;
        this.address = address;
        this.pan_no = pan_no;
        this.Aadhaar_No = Aadhaar_No;
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

    public String getAadhaar_No() {
        return Aadhaar_No;
    }

    public void setAadhaar_No(String Aadhaar_No) {
        this.Aadhaar_No = Aadhaar_No;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

