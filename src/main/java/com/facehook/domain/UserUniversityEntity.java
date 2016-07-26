package com.facehook.domain;

import javax.persistence.*;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "userUniversity", schema = "facehook", catalog = "")
public class UserUniversityEntity {
    private int id;
    private Integer uniYear;
    private String userType;
    private String college;
    private String drom;
    private UsersEntity user;
    private UniversityEntity university;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Basic
    @Column(name = "uniYear", nullable = true)
    public Integer getUniYear() {
        return uniYear;
    }

    public void setUniYear(Integer uniYear) {
        this.uniYear = uniYear;
    }

    @Basic
    @Column(name = "userType", nullable = true, length = 32)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "college", nullable = true, length = 128)
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Basic
    @Column(name = "drom", nullable = true, length = 128)
    public String getDrom() {
        return drom;
    }

    public void setDrom(String drom) {
        this.drom = drom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserUniversityEntity that = (UserUniversityEntity) o;

        if (id != that.id) return false;
        if (uniYear != null ? !uniYear.equals(that.uniYear) : that.uniYear != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (college != null ? !college.equals(that.college) : that.college != null) return false;
        if (drom != null ? !drom.equals(that.drom) : that.drom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (uniYear != null ? uniYear.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (college != null ? college.hashCode() : 0);
        result = 31 * result + (drom != null ? drom.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity usersByUserId) {
        this.user = usersByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "universityId", referencedColumnName = "id")
    public UniversityEntity getUniversity() {
        return university;
    }

    public void setUniversity(UniversityEntity universityByUniversityId) {
        this.university = universityByUniversityId;
    }
}
