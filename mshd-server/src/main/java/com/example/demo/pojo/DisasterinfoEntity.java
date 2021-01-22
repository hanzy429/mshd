package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "disasterinfo", schema = "mydb", catalog = "")
public class DisasterinfoEntity {
    private String dId;
    private String id;
    private String date;
    private String location;
    private double longitude;
    private double latitude;
    private double depth;
    private double magnitude;
    private byte[] picture;
    private String reportingunit;

    @Id
    @Column(name = "D_ID", nullable = false, length = 24)
    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    @Basic
    @Column(name = "ID", nullable = false, length = 19)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = false, length = 12)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "location", nullable = false, length = 100)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "longitude", nullable = false, precision = 0)
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = false, precision = 0)
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "depth", nullable = false, precision = 0)
    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Basic
    @Column(name = "magnitude", nullable = false, precision = 0)
    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Basic
    @Column(name = "picture", nullable = true)
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "reportingunit", nullable = false, length = 50)
    public String getReportingunit() {
        return reportingunit;
    }

    public void setReportingunit(String reportingunit) {
        this.reportingunit = reportingunit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisasterinfoEntity that = (DisasterinfoEntity) o;
        return Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.depth, depth) == 0 &&
                Double.compare(that.magnitude, magnitude) == 0 &&
                Objects.equals(dId, that.dId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(location, that.location) &&
                Arrays.equals(picture, that.picture) &&
                Objects.equals(reportingunit, that.reportingunit);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(dId, id, date, location, longitude, latitude, depth, magnitude, reportingunit);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
