package com.facehook.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "city", schema = "facehook", catalog = "")
public class CityEntity {
    private int id;
    private String name;
    private Integer proId;
    private ProvinceEntity provinceByProId;
    private Collection<JuniorEntity> juniorsById;
    private Collection<PrimarySchoolEntity> primarySchoolsById;
    private Collection<SeniorEntity> seniorsById;
    private Collection<TechSchoolEntity> techSchoolsById;
    private Collection<TownEntity> townsById;
    private Collection<UsersEntity> usersesById;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 32)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "proId", nullable = true)
    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (proId != null ? !proId.equals(that.proId) : that.proId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (proId != null ? proId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "proId", referencedColumnName = "id", insertable = false, updatable = false)
    public ProvinceEntity getProvinceByProId() {
        return provinceByProId;
    }

    public void setProvinceByProId(ProvinceEntity provinceByProId) {
        this.provinceByProId = provinceByProId;
    }

    @OneToMany(mappedBy = "cityByCityId")
    public Collection<JuniorEntity> getJuniorsById() {
        return juniorsById;
    }

    public void setJuniorsById(Collection<JuniorEntity> juniorsById) {
        this.juniorsById = juniorsById;
    }

    @OneToMany(mappedBy = "cityByCityId")
    public Collection<PrimarySchoolEntity> getPrimarySchoolsById() {
        return primarySchoolsById;
    }

    public void setPrimarySchoolsById(Collection<PrimarySchoolEntity> primarySchoolsById) {
        this.primarySchoolsById = primarySchoolsById;
    }

    @OneToMany(mappedBy = "cityByCityId")
    public Collection<SeniorEntity> getSeniorsById() {
        return seniorsById;
    }

    public void setSeniorsById(Collection<SeniorEntity> seniorsById) {
        this.seniorsById = seniorsById;
    }

    @OneToMany(mappedBy = "cityByCityId")
    public Collection<TechSchoolEntity> getTechSchoolsById() {
        return techSchoolsById;
    }

    public void setTechSchoolsById(Collection<TechSchoolEntity> techSchoolsById) {
        this.techSchoolsById = techSchoolsById;
    }

    @OneToMany(mappedBy = "cityByCityId")
    public Collection<TownEntity> getTownsById() {
        return townsById;
    }

    public void setTownsById(Collection<TownEntity> townsById) {
        this.townsById = townsById;
    }

    @OneToMany(mappedBy = "cityByHomeCity")
    public Collection<UsersEntity> getUsersesById() {
        return usersesById;
    }

    public void setUsersesById(Collection<UsersEntity> usersesById) {
        this.usersesById = usersesById;
    }
}
