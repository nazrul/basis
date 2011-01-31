package gov.nbr.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "nbr_record")
public class NBRRecord {

    private int id;
    private String nationalID;
    private String TIN;
    private Date lastTaxClearanceDate;
    private double taxAmountInLastFiscalYr;
    private int version;

    public NBRRecord() {
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

    @Column(name = "tin", length = 20, unique = true, nullable = false)
    public String getTIN() {
        return TIN;
    }

    public void setTIN(String TIN) {
        this.TIN = TIN;
    }

    public Date getLastTaxClearanceDate() {
        return lastTaxClearanceDate;
    }

    public void setLastTaxClearanceDate(Date lastTaxClearanceDate) {
        this.lastTaxClearanceDate = lastTaxClearanceDate;
    }

    public double getTaxAmountInLastFiscalYr() {
        return taxAmountInLastFiscalYr;
    }

    public void setTaxAmountInLastFiscalYr(double taxAmountInLastFiscalYr) {
        this.taxAmountInLastFiscalYr = taxAmountInLastFiscalYr;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}