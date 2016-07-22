package com.facehook.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "country", schema = "facehook", catalog = "")
public class CountryEntity {
    private int id;
    private String name;
    private Collection<ProvinceEntity> provincesById;
    private Collection<UniversityEntity> universitiesById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "countryByCountryId")
    public Collection<ProvinceEntity> getProvincesById() {
        return provincesById;
    }

    public void setProvincesById(Collection<ProvinceEntity> provincesById) {
        this.provincesById = provincesById;
    }

    @OneToMany(mappedBy = "countryByCountryId")
    public Collection<UniversityEntity> getUniversitiesById() {
        return universitiesById;
    }

    public void setUniversitiesById(Collection<UniversityEntity> universitiesById) {
        this.universitiesById = universitiesById;
    }
}
