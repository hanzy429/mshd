package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "disasterprediction", schema = "mydb", catalog = "")
public class DisasterpredictionEntity {
    private String id;
    private String date;
    private String location;
    private double longitude;
    private double latitude;
    private double depth;
    private double magnitude;
    private String intensity;
    private String type;
    private byte[] picture;
    private String note;
    private String reportingunit;
    private String diD;

    @Id
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
    @Column(name = "intensity", nullable = false, length = 6)
    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    @Basic
    @Column(name = "type", nullable = false, length = 2)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "note", nullable = false, length = 200)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "reportingunit", nullable = false, length = 50)
    public String getReportingunit() {
        return reportingunit;
    }

    public void setReportingunit(String reportingunit) {
        this.reportingunit = reportingunit;
    }

    @Basic
    @Column(name = "DiD", nullable = false, length = 24)
    public String getDiD() {
        return diD;
    }

    public void setDiD(String diD) {
        this.diD = diD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisasterpredictionEntity that = (DisasterpredictionEntity) o;
        return Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                Double.compare(that.depth, depth) == 0 &&
                Double.compare(that.magnitude, magnitude) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(location, that.location) &&
                Objects.equals(intensity, that.intensity) &&
                Objects.equals(type, that.type) &&
                Arrays.equals(picture, that.picture) &&
                Objects.equals(note, that.note) &&
                Objects.equals(reportingunit, that.reportingunit) &&
                Objects.equals(diD, that.diD);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, date, location, longitude, latitude, depth, magnitude, intensity, type, note, reportingunit, diD);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
