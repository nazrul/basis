package gov.btcl.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "btcl_record")
public class BTCLRecord {

    private int id;
    private String nationalID;
    private String ownerName;
    private double initialDeposit;
    private Date effectiveStartOfService;
    private String connectionType; //land_line, mobile, corporate_line
    private String locationOfReg;
    private String addressOfConnection;// in case of land_line
    //if the user wants to pay the bill online
    private String bankAccountNo;
    private String bankRoutingNo;

    private int version;

    public BTCLRecord() {
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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getEffectiveStartOfService() {
        return effectiveStartOfService;
    }

    public void setEffectiveStartOfService(Date effectiveStartOfService) {
        this.effectiveStartOfService = effectiveStartOfService;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getLocationOfReg() {
        return locationOfReg;
    }

    public void setLocationOfReg(String locationOfReg) {
        this.locationOfReg = locationOfReg;
    }

    public String getAddressOfConnection() {
        return addressOfConnection;
    }

    public void setAddressOfConnection(String addressOfConnection) {
        this.addressOfConnection = addressOfConnection;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankRoutingNo() {
        return bankRoutingNo;
    }

    public void setBankRoutingNo(String bankRoutingNo) {
        this.bankRoutingNo = bankRoutingNo;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}