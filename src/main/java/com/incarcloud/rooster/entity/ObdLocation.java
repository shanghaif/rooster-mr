package com.incarcloud.rooster.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Incar on 2017/3/2.
 */
@Entity
@Table(name = "t_obd_location")
public class ObdLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "obdcode")
    private String obdCode;
    private String vin;
    private String longitude;
    private String latitude;
    @Column(name = "locationtime")
    private Timestamp locationTime;

    public ObdLocation() {
    }

    public ObdLocation(String obdCode, String vin, String longitude, String latitude, Timestamp locationTime) {
        this.obdCode = obdCode;
        this.vin = vin;
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationTime = locationTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObdCode() {
        return obdCode;
    }

    public void setObdCode(String obdCode) {
        this.obdCode = obdCode;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Timestamp getLocationTime() {
        return locationTime;
    }

    public void setLocationTime(Timestamp locationTime) {
        this.locationTime = locationTime;
    }
}
