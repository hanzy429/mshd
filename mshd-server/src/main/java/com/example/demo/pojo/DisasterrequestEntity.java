package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "disasterrequest", schema = "mydb", catalog = "")
public class DisasterrequestEntity {
    private String id;
    private String date;
    private String disasterType;
    private String status;
    private String oUrl;
    private String requestunit;
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
    @Column(name = "disasterType", nullable = false, length = 3)
    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "o_URL", nullable = false, length = 200)
    public String getoUrl() {
        return oUrl;
    }

    public void setoUrl(String oUrl) {
        this.oUrl = oUrl;
    }

    @Basic
    @Column(name = "requestunit", nullable = false, length = 50)
    public String getRequestunit() {
        return requestunit;
    }

    public void setRequestunit(String requestunit) {
        this.requestunit = requestunit;
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
        DisasterrequestEntity that = (DisasterrequestEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(disasterType, that.disasterType) &&
                Objects.equals(status, that.status) &&
                Objects.equals(oUrl, that.oUrl) &&
                Objects.equals(requestunit, that.requestunit) &&
                Objects.equals(diD, that.diD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, disasterType, status, oUrl, requestunit, diD);
    }
}
