package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "commdisaster", schema = "mydb", catalog = "")
public class CommdisasterEntity {
    private String id;
    private String date;
    private String location;
    private String type;
    private String grade;
    private byte[] picture;
    private String note;
    private String reportingunit;
    private String did;

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
    @Column(name = "type", nullable = false, length = 4)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "grade", nullable = false, length = 4)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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
    @Column(name = "Did", nullable = false, length = 24)
    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommdisasterEntity that = (CommdisasterEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(location, that.location) &&
                Objects.equals(type, that.type) &&
                Objects.equals(grade, that.grade) &&
                Arrays.equals(picture, that.picture) &&
                Objects.equals(note, that.note) &&
                Objects.equals(reportingunit, that.reportingunit) &&
                Objects.equals(did, that.did);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, date, location, type, grade, note, reportingunit, did);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
