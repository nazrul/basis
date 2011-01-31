package gov.brta.domain;

import javax.persistence.*;


@Entity
@Table(name = "brta_record")
public class BRTARecord {

    private int id;
    private String nationalID;
    private String vehicleRegNo;
    private String vehicleChasisNo;
    private String vehicleEngineNo;
    private int version;

    public BRTARecord() {
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

    @Column(name = "vehicle_reg_no", length = 20, unique = true, nullable = false)
    public String getVehicleRegNo() {
        return vehicleRegNo;
    }

    public void setVehicleRegNo(String vehicleRegNo) {
        this.vehicleRegNo = vehicleRegNo;
    }

    @Column(name = "vehicle_chais_no", length = 50, unique = true, nullable = false)
    public String getVehicleChasisNo() {
        return vehicleChasisNo;
    }

    public void setVehicleChasisNo(String vehicleChasisNo) {
        this.vehicleChasisNo = vehicleChasisNo;
    }

    @Column(name = "vehicle_engine_no", length = 20, unique = true, nullable = false)
    public String getVehicleEngineNo() {
        return vehicleEngineNo;
    }

    public void setVehicleEngineNo(String vehicleEngineNo) {
        this.vehicleEngineNo = vehicleEngineNo;
    }

    @Version
    private int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}