package com.facehook.domain;

import javax.persistence.*;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "userSenior", schema = "facehook", catalog = "")
public class UserSeniorEntity {
    private int id;
    private Integer userId;
    private Integer seniorSchId;
    private Integer seniorYear;
    private String grade1;
    private String grade2;
    private String grade3;
    private UsersEntity usersByUserId;
    private SeniorEntity seniorBySeniorSchId;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userId", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "seniorSchId", nullable = true)
    public Integer getSeniorSchId() {
        return seniorSchId;
    }

    public void setSeniorSchId(Integer seniorSchId) {
        this.seniorSchId = seniorSchId;
    }

    @Basic
    @Column(name = "seniorYear", nullable = true)
    public Integer getSeniorYear() {
        return seniorYear;
    }

    public void setSeniorYear(Integer seniorYear) {
        this.seniorYear = seniorYear;
    }

    @Basic
    @Column(name = "grade1", nullable = true, length = 64)
    public String getGrade1() {
        return grade1;
    }

    public void setGrade1(String grade1) {
        this.grade1 = grade1;
    }

    @Basic
    @Column(name = "grade2", nullable = true, length = 64)
    public String getGrade2() {
        return grade2;
    }

    public void setGrade2(String grade2) {
        this.grade2 = grade2;
    }

    @Basic
    @Column(name = "grade3", nullable = true, length = 64)
    public String getGrade3() {
        return grade3;
    }

    public void setGrade3(String grade3) {
        this.grade3 = grade3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSeniorEntity that = (UserSeniorEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (seniorSchId != null ? !seniorSchId.equals(that.seniorSchId) : that.seniorSchId != null) return false;
        if (seniorYear != null ? !seniorYear.equals(that.seniorYear) : that.seniorYear != null) return false;
        if (grade1 != null ? !grade1.equals(that.grade1) : that.grade1 != null) return false;
        if (grade2 != null ? !grade2.equals(that.grade2) : that.grade2 != null) return false;
        if (grade3 != null ? !grade3.equals(that.grade3) : that.grade3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (seniorSchId != null ? seniorSchId.hashCode() : 0);
        result = 31 * result + (seniorYear != null ? seniorYear.hashCode() : 0);
        result = 31 * result + (grade1 != null ? grade1.hashCode() : 0);
        result = 31 * result + (grade2 != null ? grade2.hashCode() : 0);
        result = 31 * result + (grade3 != null ? grade3.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id", insertable = false, updatable = false)
    public UsersEntity getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(UsersEntity usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "seniorSchId", referencedColumnName = "id", insertable = false, updatable = false)
    public SeniorEntity getSeniorBySeniorSchId() {
        return seniorBySeniorSchId;
    }

    public void setSeniorBySeniorSchId(SeniorEntity seniorBySeniorSchId) {
        this.seniorBySeniorSchId = seniorBySeniorSchId;
    }
}
