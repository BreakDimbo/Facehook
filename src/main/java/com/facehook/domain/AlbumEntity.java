package com.facehook.domain;

import javax.persistence.*;

/**
 * Created by Break.D on 7/27/16.
 */
@Entity
@Table(name = "album", schema = "facehook")
public class AlbumEntity {
    private int id;
    private String name;
    private String descript;
    private String privilege;
    private Integer user_id;
    private UsersEntity userById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "descript", nullable = true, length = 200)
    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Basic
    @Column(name = "privilege", nullable = true, length = 20)
    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlbumEntity that = (AlbumEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (descript != null ? !descript.equals(that.descript) : that.descript != null) return false;
        if (privilege != null ? !privilege.equals(that.privilege) : that.privilege != null) return false;
        if (userById != null ? !userById.equals(that.userById) : that.userById != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (descript != null ? descript.hashCode() : 0);
        result = 31 * result + (privilege != null ? privilege.hashCode() : 0);
        result = 31 * result + (userById != null ? userById.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    public UsersEntity getUserById() {
        return userById;
    }

    public void setUserById(UsersEntity userById) {
        this.userById = userById;
    }
}
