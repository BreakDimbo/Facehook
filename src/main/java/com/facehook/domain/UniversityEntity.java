package com.facehook.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "university", schema = "facehook", catalog = "")
public class UniversityEntity {
    private int id;
    private String name;
    private Integer countryId;
    private Integer proId;
    private CountryEntity countryByCountryId;
    private ProvinceEntity provinceByProId;
    private Collection<UserUniversityEntity> userUniversitiesById;

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
    @Column(name = "name", nullable = false, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "countryId", nullable = true)
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
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

        UniversityEntity that = (UniversityEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (proId != null ? !proId.equals(that.proId) : that.proId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (proId != null ? proId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "countryId", referencedColumnName = "id", insertable = false, updatable = false)
    public CountryEntity getCountryByCountryId() {
        return countryByCountryId;
    }

    public void setCountryByCountryId(CountryEntity countryByCountryId) {
        this.countryByCountryId = countryByCountryId;
    }

    @ManyToOne
    @JoinColumn(name = "proId", referencedColumnName = "id", insertable = false, updatable = false)
    public ProvinceEntity getProvinceByProId() {
        return provinceByProId;
    }

    public void setProvinceByProId(ProvinceEntity provinceByProId) {
        this.provinceByProId = provinceByProId;
    }

    @OneToMany(mappedBy = "university")
    public Collection<UserUniversityEntity> getUserUniversitiesById() {
        return userUniversitiesById;
    }

    public void setUserUniversitiesById(Collection<UserUniversityEntity> userUniversitiesById) {
        this.userUniversitiesById = userUniversitiesById;
    }
}
