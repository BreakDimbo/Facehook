package com.facehook.domain;

import javax.persistence.*;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "localProvince", schema = "facehook", catalog = "")
public class LocalProvinceEntity {
    private int lpId;
    private String lpName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lp_id", nullable = false)
    public int getLpId() {
        return lpId;
    }

    public void setLpId(int lpId) {
        this.lpId = lpId;
    }

    @Basic
    @Column(name = "lp_name", nullable = false, length = 32)
    public String getLpName() {
        return lpName;
    }

    public void setLpName(String lpName) {
        this.lpName = lpName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalProvinceEntity that = (LocalProvinceEntity) o;

        if (lpId != that.lpId) return false;
        if (lpName != null ? !lpName.equals(that.lpName) : that.lpName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lpId;
        result = 31 * result + (lpName != null ? lpName.hashCode() : 0);
        return result;
    }
}
