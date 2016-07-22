package com.facehook.domain;

import javax.persistence.*;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "localCity", schema = "facehook", catalog = "")
public class LocalCityEntity {
    private int lcId;
    private String lcName;
    private Integer lcLpId;

    @Id
    @Column(name = "lc_id", nullable = false)
    @GeneratedValue
    public int getLcId() {
        return lcId;
    }

    public void setLcId(int lcId) {
        this.lcId = lcId;
    }

    @Basic
    @Column(name = "lc_name", nullable = true, length = 32)
    public String getLcName() {
        return lcName;
    }

    public void setLcName(String lcName) {
        this.lcName = lcName;
    }

    @Basic
    @Column(name = "lc_lpId", nullable = true)
    public Integer getLcLpId() {
        return lcLpId;
    }

    public void setLcLpId(Integer lcLpId) {
        this.lcLpId = lcLpId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalCityEntity that = (LocalCityEntity) o;

        if (lcId != that.lcId) return false;
        if (lcName != null ? !lcName.equals(that.lcName) : that.lcName != null) return false;
        if (lcLpId != null ? !lcLpId.equals(that.lcLpId) : that.lcLpId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lcId;
        result = 31 * result + (lcName != null ? lcName.hashCode() : 0);
        result = 31 * result + (lcLpId != null ? lcLpId.hashCode() : 0);
        return result;
    }
}
