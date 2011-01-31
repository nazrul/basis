package gov.rajuk.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "rajuk_record")
public class RAJUKRecord {

    private int id;
    private String nationalID;
    private String assetLocation;
    private Date dateOfPurchase;
    private String previousOwnerName;
    private String previousOwnerNID;
    private double price;    
    private int version;

    public RAJUKRecord() {
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

    public String getAssetLocation() {
        return assetLocation;
    }

    public void setAssetLocation(String assetLocation) {
        this.assetLocation = assetLocation;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPreviousOwnerName() {
        return previousOwnerName;
    }

    public void setPreviousOwnerName(String previousOwnerName) {
        this.previousOwnerName = previousOwnerName;
    }

    public String getPreviousOwnerNID() {
        return previousOwnerNID;
    }

    public void setPreviousOwnerNID(String previousOwnerNID) {
        this.previousOwnerNID = previousOwnerNID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}