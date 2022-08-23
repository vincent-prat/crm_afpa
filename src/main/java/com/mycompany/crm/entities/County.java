package com.mycompany.crm.entities;

import javax.persistence.*;

@Entity
@Table(name = "county")
public class County {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "county_id", nullable = false, length = 2)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

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

}