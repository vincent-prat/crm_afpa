package com.mycompany.crm.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 75)
    private String name;

    @Column(name = "address", nullable = false, length = 80)
    private String address;

    @Column(name = "post_code", nullable = false, length = 5)
    private String postCode;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "latitude", precision = 5)
    private BigDecimal latitude;

    @Column(name = "longitude", precision = 5)
    private BigDecimal longitude;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

    @Column(name = "siret", nullable = false, length = 14)
    private String siret;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "county_id", nullable = false)
    private County county;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "brand_id", nullable = false)
    private Brand brand;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}