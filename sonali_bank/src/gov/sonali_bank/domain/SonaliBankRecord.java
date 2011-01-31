package gov.sonali_bank.domain;

import javax.persistence.*;


@Entity
@Table(name = "sonali_bank_record")
public class SonaliBankRecord {

    private int id;
    private String nationalID;
    private String accountNo;
    private String accountType;//savings, current, foreign_currency
    private String ownerName;
    private int version;

    public SonaliBankRecord() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Column(name = "national_id", length = 20, unique = true, nullable = false)
    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}