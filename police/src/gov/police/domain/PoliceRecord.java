package gov.police.domain;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "police_record")
public class PoliceRecord {

    private int id;
    private String nationalId;
    private String name;
    private String address;
    private String gender;
    private Date dateOfBirth;
    private boolean criminal;
    private int version;

    public PoliceRecord() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "national_id", length = 20, nullable = false)
    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public boolean isCriminal() {
        return criminal;
    }

    public void setCriminal(boolean criminal) {
        this.criminal = criminal;
    }

    @Transient
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Transient
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Transient
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Transient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Version
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

