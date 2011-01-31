package gov.airport.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ncra_record")
public class DepartureRecord {

    private int id;
    private String nationalID;
    private Date departureTime;
    private String finalDestination;
    private String nationality;
    private String passportNo;
    private int version;

    public DepartureRecord() {
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
