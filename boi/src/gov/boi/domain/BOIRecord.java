package gov.boi.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "boi_record")
public class BOIRecord {

    private int id;
    private String nationalID;
    private String ownerName;
    private String companyName;
    private String typeOfBusiness;
    private Date initialStartOfOperation;
    private Date licenseIssuanceDate;
    private Date licenseExpirationDate;
    private String areaOfOperation;//any EPZ
    private long initialCapital;
    private boolean isTaxHolidayApplicable;

    private int version;

    public BOIRecord() {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public Date getInitialStartOfOperation() {
        return initialStartOfOperation;
    }

    public void setInitialStartOfOperation(Date initialStartOfOperation) {
        this.initialStartOfOperation = initialStartOfOperation;
    }

    public Date getLicenseIssuanceDate() {
        return licenseIssuanceDate;
    }

    public void setLicenseIssuanceDate(Date licenseIssuanceDate) {
        this.licenseIssuanceDate = licenseIssuanceDate;
    }

    public String getAreaOfOperation() {
        return areaOfOperation;
    }

    public void setAreaOfOperation(String areaOfOperation) {
        this.areaOfOperation = areaOfOperation;
    }

    public long getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(long initialCapital) {
        this.initialCapital = initialCapital;
    }

    public boolean isTaxHolidayApplicable() {
        return isTaxHolidayApplicable;
    }

    public void setTaxHolidayApplicable(boolean taxHolidayApplicable) {
        isTaxHolidayApplicable = taxHolidayApplicable;
    }

    public Date getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.licenseExpirationDate = licenseExpirationDate;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}