package com.facehook.domain;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Break.D on 7/22/16.
 */
@Entity
@Table(name = "users", schema = "facehook", catalog = "")
@DynamicInsert
public class UsersEntity {
    private int id;
    private String email;
    private String name;
    private String pwd;
    private String photo;
    private String sex;
    private Integer homePro;
    private Integer homeCity;
    private Integer albums;
    private Date birth;
    private String tel;
    private String mobile;
    private String oicq;
    private String msn;
    private String website;
    private Integer techSch;
    private Integer techSchYear;
    private Integer juniorSch;
    private Integer juniorYear;
    private Integer primarySch;
    private Integer primaryYear;
    private String interest;
    private String music;
    private String movie;
    private String game;
    private String cartoon;
    private String sport;
    private String book;
    private String assn;
    private Integer visited;
    private String doing;
    private Byte online;
    private java.util.Date registerDate;
    private java.util.Date loginDate;
    private Byte level;
    private Byte locked;
    private Collection<UserNetEntity> userNetsById;
    private Collection<UserSeniorEntity> userSeniorsById;
    private Collection<UserUniversityEntity> userUniversitiesById;
    private Collection<AlbumEntity> albumsById;
    private ProvinceEntity provinceByHomePro;
    private CityEntity cityByHomeCity;
    private TechSchoolEntity techSchoolByTechSch;
    private JuniorEntity juniorByJuniorSch;
    private PrimarySchoolEntity primarySchoolByPrimarySch;

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
    @Column(name = "email", nullable = false, length = 128)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 128)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pwd", nullable = false, length = 128)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "photo", nullable = true, length = 128)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 16)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "homePro", nullable = true)
    public Integer getHomePro() {
        return homePro;
    }

    public void setHomePro(Integer homePro) {
        this.homePro = homePro;
    }

    @Basic
    @Column(name = "homeCity", nullable = true)
    public Integer getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(Integer homeCity) {
        this.homeCity = homeCity;
    }

    @Basic
    @Column(name = "albums", nullable = true)
    public Integer getAlbums() {
        return albums;
    }

    public void setAlbums(Integer albums) {
        this.albums = albums;
    }

    @Basic
    @Column(name = "birth", nullable = true)
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Basic
    @Column(name = "tel", nullable = true, length = 32)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 32)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "oicq", nullable = true, length = 32)
    public String getOicq() {
        return oicq;
    }

    public void setOicq(String oicq) {
        this.oicq = oicq;
    }

    @Basic
    @Column(name = "msn", nullable = true, length = 128)
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Basic
    @Column(name = "website", nullable = true, length = 128)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "techSch", nullable = true)
    public Integer getTechSch() {
        return techSch;
    }

    public void setTechSch(Integer techSch) {
        this.techSch = techSch;
    }

    @Basic
    @Column(name = "techSchYear", nullable = true)
    public Integer getTechSchYear() {
        return techSchYear;
    }

    public void setTechSchYear(Integer techSchYear) {
        this.techSchYear = techSchYear;
    }

    @Basic
    @Column(name = "juniorSch", nullable = true)
    public Integer getJuniorSch() {
        return juniorSch;
    }

    public void setJuniorSch(Integer juniorSch) {
        this.juniorSch = juniorSch;
    }

    @Basic
    @Column(name = "juniorYear", nullable = true)
    public Integer getJuniorYear() {
        return juniorYear;
    }

    public void setJuniorYear(Integer juniorYear) {
        this.juniorYear = juniorYear;
    }

    @Basic
    @Column(name = "primarySch", nullable = true)
    public Integer getPrimarySch() {
        return primarySch;
    }

    public void setPrimarySch(Integer primarySch) {
        this.primarySch = primarySch;
    }

    @Basic
    @Column(name = "primaryYear", nullable = true)
    public Integer getPrimaryYear() {
        return primaryYear;
    }

    public void setPrimaryYear(Integer primaryYear) {
        this.primaryYear = primaryYear;
    }

    @Basic
    @Column(name = "interest", nullable = true, length = 256)
    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "music", nullable = true, length = 256)
    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    @Basic
    @Column(name = "movie", nullable = true, length = 256)
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Basic
    @Column(name = "game", nullable = true, length = 256)
    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Basic
    @Column(name = "cartoon", nullable = true, length = 256)
    public String getCartoon() {
        return cartoon;
    }

    public void setCartoon(String cartoon) {
        this.cartoon = cartoon;
    }

    @Basic
    @Column(name = "sport", nullable = true, length = 256)
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Basic
    @Column(name = "book", nullable = true, length = 256)
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Basic
    @Column(name = "assn", nullable = true, length = 256)
    public String getAssn() {
        return assn;
    }

    public void setAssn(String assn) {
        this.assn = assn;
    }

    @Basic
    @Column(name = "visited", nullable = true)
    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    @Basic
    @Column(name = "doing", nullable = true, length = 128)
    public String getDoing() {
        return doing;
    }

    public void setDoing(String doing) {
        this.doing = doing;
    }

    @Basic
    @Column(name = "online", nullable = true)
    public Byte getOnline() {
        return online;
    }

    public void setOnline(Byte online) {
        this.online = online;
    }

    @Basic
    @Column(name = "registerDate", nullable = true)
    public java.util.Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(java.util.Date registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "loginDate", nullable = true)
    public java.util.Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(java.util.Date loginDate) {
        this.loginDate = loginDate;
    }

    @Basic
    @Column(name = "level", nullable = true)
    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    @Basic
    @Column(name = "locked", nullable = true)
    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (homePro != null ? !homePro.equals(that.homePro) : that.homePro != null) return false;
        if (homeCity != null ? !homeCity.equals(that.homeCity) : that.homeCity != null) return false;
        if (birth != null ? !birth.equals(that.birth) : that.birth != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (oicq != null ? !oicq.equals(that.oicq) : that.oicq != null) return false;
        if (msn != null ? !msn.equals(that.msn) : that.msn != null) return false;
        if (website != null ? !website.equals(that.website) : that.website != null) return false;
        if (techSch != null ? !techSch.equals(that.techSch) : that.techSch != null) return false;
        if (techSchYear != null ? !techSchYear.equals(that.techSchYear) : that.techSchYear != null) return false;
        if (juniorSch != null ? !juniorSch.equals(that.juniorSch) : that.juniorSch != null) return false;
        if (juniorYear != null ? !juniorYear.equals(that.juniorYear) : that.juniorYear != null) return false;
        if (primarySch != null ? !primarySch.equals(that.primarySch) : that.primarySch != null) return false;
        if (primaryYear != null ? !primaryYear.equals(that.primaryYear) : that.primaryYear != null) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;
        if (music != null ? !music.equals(that.music) : that.music != null) return false;
        if (movie != null ? !movie.equals(that.movie) : that.movie != null) return false;
        if (game != null ? !game.equals(that.game) : that.game != null) return false;
        if (cartoon != null ? !cartoon.equals(that.cartoon) : that.cartoon != null) return false;
        if (sport != null ? !sport.equals(that.sport) : that.sport != null) return false;
        if (book != null ? !book.equals(that.book) : that.book != null) return false;
        if (assn != null ? !assn.equals(that.assn) : that.assn != null) return false;
        if (visited != null ? !visited.equals(that.visited) : that.visited != null) return false;
        if (doing != null ? !doing.equals(that.doing) : that.doing != null) return false;
        if (online != null ? !online.equals(that.online) : that.online != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (loginDate != null ? !loginDate.equals(that.loginDate) : that.loginDate != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (locked != null ? !locked.equals(that.locked) : that.locked != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (homePro != null ? homePro.hashCode() : 0);
        result = 31 * result + (homeCity != null ? homeCity.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (oicq != null ? oicq.hashCode() : 0);
        result = 31 * result + (msn != null ? msn.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        result = 31 * result + (techSch != null ? techSch.hashCode() : 0);
        result = 31 * result + (techSchYear != null ? techSchYear.hashCode() : 0);
        result = 31 * result + (juniorSch != null ? juniorSch.hashCode() : 0);
        result = 31 * result + (juniorYear != null ? juniorYear.hashCode() : 0);
        result = 31 * result + (primarySch != null ? primarySch.hashCode() : 0);
        result = 31 * result + (primaryYear != null ? primaryYear.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (music != null ? music.hashCode() : 0);
        result = 31 * result + (movie != null ? movie.hashCode() : 0);
        result = 31 * result + (game != null ? game.hashCode() : 0);
        result = 31 * result + (cartoon != null ? cartoon.hashCode() : 0);
        result = 31 * result + (sport != null ? sport.hashCode() : 0);
        result = 31 * result + (book != null ? book.hashCode() : 0);
        result = 31 * result + (assn != null ? assn.hashCode() : 0);
        result = 31 * result + (visited != null ? visited.hashCode() : 0);
        result = 31 * result + (doing != null ? doing.hashCode() : 0);
        result = 31 * result + (online != null ? online.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (loginDate != null ? loginDate.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (locked != null ? locked.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "usersByUserId")
    public Collection<UserNetEntity> getUserNetsById() {
        return userNetsById;
    }

    public void setUserNetsById(Collection<UserNetEntity> userNetsById) {
        this.userNetsById = userNetsById;
    }

    @OneToMany(mappedBy = "usersByUserId")
    public Collection<UserSeniorEntity> getUserSeniorsById() {
        return userSeniorsById;
    }

    public void setUserSeniorsById(Collection<UserSeniorEntity> userSeniorsById) {
        this.userSeniorsById = userSeniorsById;
    }

    @OneToMany(mappedBy = "user")
    public Collection<UserUniversityEntity> getUserUniversitiesById() {
        return userUniversitiesById;
    }

    public void setUserUniversitiesById(Collection<UserUniversityEntity> userUniversitiesById) {
        this.userUniversitiesById = userUniversitiesById;
    }

    @ManyToOne
    @JoinColumn(name = "homePro", referencedColumnName = "id", insertable = false, updatable = false)
    public ProvinceEntity getProvinceByHomePro() {
        return provinceByHomePro;
    }

    public void setProvinceByHomePro(ProvinceEntity provinceByHomePro) {
        this.provinceByHomePro = provinceByHomePro;
    }

    @ManyToOne
    @JoinColumn(name = "homeCity", referencedColumnName = "id", insertable = false, updatable = false)
    public CityEntity getCityByHomeCity() {
        return cityByHomeCity;
    }

    public void setCityByHomeCity(CityEntity cityByHomeCity) {
        this.cityByHomeCity = cityByHomeCity;
    }

    @ManyToOne
    @JoinColumn(name = "techSch", referencedColumnName = "id", insertable = false, updatable = false)
    public TechSchoolEntity getTechSchoolByTechSch() {
        return techSchoolByTechSch;
    }

    public void setTechSchoolByTechSch(TechSchoolEntity techSchoolByTechSch) {
        this.techSchoolByTechSch = techSchoolByTechSch;
    }

    @ManyToOne
    @JoinColumn(name = "juniorSch", referencedColumnName = "id", insertable = false, updatable = false)
    public JuniorEntity getJuniorByJuniorSch() {
        return juniorByJuniorSch;
    }

    public void setJuniorByJuniorSch(JuniorEntity juniorByJuniorSch) {
        this.juniorByJuniorSch = juniorByJuniorSch;
    }

    @ManyToOne
    @JoinColumn(name = "primarySch", referencedColumnName = "id", insertable = false, updatable = false)
    public PrimarySchoolEntity getPrimarySchoolByPrimarySch() {
        return primarySchoolByPrimarySch;
    }

    public void setPrimarySchoolByPrimarySch(PrimarySchoolEntity primarySchoolByPrimarySch) {
        this.primarySchoolByPrimarySch = primarySchoolByPrimarySch;
    }

    @OneToMany(mappedBy = "userById")
    public Collection<AlbumEntity> getAlbumsById() {
        return albumsById;
    }

    public void setAlbumsById(Collection<AlbumEntity> albumsById) {
        this.albumsById = albumsById;
    }


}
