package com.facehook.domain;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "junior", schema = "facehook", catalog = "")
public class JuniorEntity {
    private int id;
    private String name;
    private Integer cityId;
    private Integer townId;
    private CityEntity cityByCityId;
    private TownEntity townByTownId;
    private Collection<UsersEntity> usersesById;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "cityId", nullable = true)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "townId", nullable = true)
    public Integer getTownId() {
        return townId;
    }

    public void setTownId(Integer townId) {
        this.townId = townId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JuniorEntity that = (JuniorEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (townId != null ? !townId.equals(that.townId) : that.townId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (townId != null ? townId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cityId", referencedColumnName = "id", insertable = false, updatable = false)
    public CityEntity getCityByCityId() {
        return cityByCityId;
    }

    public void setCityByCityId(CityEntity cityByCityId) {
        this.cityByCityId = cityByCityId;
    }

    @ManyToOne
    @JoinColumn(name = "townId", referencedColumnName = "id", insertable = false, updatable = false)
    public TownEntity getTownByTownId() {
        return townByTownId;
    }

    public void setTownByTownId(TownEntity townByTownId) {
        this.townByTownId = townByTownId;
    }

    @OneToMany(mappedBy = "juniorByJuniorSch")
    public Collection<UsersEntity> getUsersesById() {
        return usersesById;
    }

    public void setUsersesById(Collection<UsersEntity> usersesById) {
        this.usersesById = usersesById;
    }
}
