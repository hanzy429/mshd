package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "otherstructure", schema = "mydb", catalog = "")
public class OtherstructureEntity {
    private String id;
    private String date;
    private String location;
    private String basicallyintactsquare;
    private String slightdamagedsquare;
    private String moderatedamagedsquare;
    private String seriousdamagedsquare;
    private String destroyedsquare;
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
    @Column(name = "basicallyintactsquare", nullable = false, length = 6)
    public String getBasicallyintactsquare() {
        return basicallyintactsquare;
    }

    public void setBasicallyintactsquare(String basicallyintactsquare) {
        this.basicallyintactsquare = basicallyintactsquare;
    }

    @Basic
    @Column(name = "slightdamagedsquare", nullable = false, length = 6)
    public String getSlightdamagedsquare() {
        return slightdamagedsquare;
    }

    public void setSlightdamagedsquare(String slightdamagedsquare) {
        this.slightdamagedsquare = slightdamagedsquare;
    }

    @Basic
    @Column(name = "moderatedamagedsquare", nullable = false, length = 6)
    public String getModeratedamagedsquare() {
        return moderatedamagedsquare;
    }

    public void setModeratedamagedsquare(String moderatedamagedsquare) {
        this.moderatedamagedsquare = moderatedamagedsquare;
    }

    @Basic
    @Column(name = "seriousdamagedsquare", nullable = false, length = 6)
    public String getSeriousdamagedsquare() {
        return seriousdamagedsquare;
    }

    public void setSeriousdamagedsquare(String seriousdamagedsquare) {
        this.seriousdamagedsquare = seriousdamagedsquare;
    }

    @Basic
    @Column(name = "destroyedsquare", nullable = false, length = 6)
    public String getDestroyedsquare() {
        return destroyedsquare;
    }

    public void setDestroyedsquare(String destroyedsquare) {
        this.destroyedsquare = destroyedsquare;
    }

    @Basic
    @Column(name = "note", nullable = false, length = 100)
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
        OtherstructureEntity that = (OtherstructureEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(location, that.location) &&
                Objects.equals(basicallyintactsquare, that.basicallyintactsquare) &&
                Objects.equals(slightdamagedsquare, that.slightdamagedsquare) &&
                Objects.equals(moderatedamagedsquare, that.moderatedamagedsquare) &&
                Objects.equals(seriousdamagedsquare, that.seriousdamagedsquare) &&
                Objects.equals(destroyedsquare, that.destroyedsquare) &&
                Objects.equals(note, that.note) &&
                Objects.equals(reportingunit, that.reportingunit) &&
                Objects.equals(diD, that.diD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, location, basicallyintactsquare, slightdamagedsquare, moderatedamagedsquare, seriousdamagedsquare, destroyedsquare, note, reportingunit, diD);
    }
}
