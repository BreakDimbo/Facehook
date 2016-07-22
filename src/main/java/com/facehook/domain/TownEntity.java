package com.facehook.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "town", schema = "facehook", catalog = "")
public class TownEntity {
    private int id;
    private String name;
    private Integer cityId;
    private Collection<JuniorEntity> juniorsById;
    private Collection<PrimarySchoolEntity> primarySchoolsById;
    private Collection<SeniorEntity> seniorsById;
    private Collection<TechSchoolEntity> techSchoolsById;
    private CityEntity cityByCityId;

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
    @Column(name = "name", nullable = false, length = 32)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "cityId", nullable = true)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TownEntity that = (TownEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "townByTownId")
    public Collection<JuniorEntity> getJuniorsById() {
        return juniorsById;
    }

    public void setJuniorsById(Collection<JuniorEntity> juniorsById) {
        this.juniorsById = juniorsById;
    }

    @OneToMany(mappedBy = "townByTownId")
    public Collection<PrimarySchoolEntity> getPrimarySchoolsById() {
        return primarySchoolsById;
    }

    public void setPrimarySchoolsById(Collection<PrimarySchoolEntity> primarySchoolsById) {
        this.primarySchoolsById = primarySchoolsById;
    }

    @OneToMany(mappedBy = "townByTownId")
    public Collection<SeniorEntity> getSeniorsById() {
        return seniorsById;
    }

    public void setSeniorsById(Collection<SeniorEntity> seniorsById) {
        this.seniorsById = seniorsById;
    }

    @OneToMany(mappedBy = "townByTownId")
    public Collection<TechSchoolEntity> getTechSchoolsById() {
        return techSchoolsById;
    }

    public void setTechSchoolsById(Collection<TechSchoolEntity> techSchoolsById) {
        this.techSchoolsById = techSchoolsById;
    }

    @ManyToOne
    @JoinColumn(name = "cityId", referencedColumnName = "id", insertable = false, updatable = false)
    public CityEntity getCityByCityId() {
        return cityByCityId;
    }

    public void setCityByCityId(CityEntity cityByCityId) {
        this.cityByCityId = cityByCityId;
    }
}
