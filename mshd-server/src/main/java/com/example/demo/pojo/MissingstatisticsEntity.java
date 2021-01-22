package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "missingstatistics", schema = "mydb", catalog = "")
public class MissingstatisticsEntity {
    private String id;
    private String location;
    private String date;
    private int number;
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
    @Column(name = "location", nullable = false, length = 100)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    @Column(name = "number", nullable = false)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        MissingstatisticsEntity that = (MissingstatisticsEntity) o;
        return number == that.number &&
                Objects.equals(id, that.id) &&
                Objects.equals(location, that.location) &&
                Objects.equals(date, that.date) &&
                Objects.equals(reportingunit, that.reportingunit) &&
                Objects.equals(diD, that.diD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location, date, number, reportingunit, diD);
    }
}
