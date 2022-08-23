package com.mycompany.crm.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", length = 25)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(name = "\"position\"", nullable = false, length = 40)
    private String position;

    @Column(name = "phone", length = 10)
    private String phone;

    @Column(name = "email", length = 256)
    private String email;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

/*
    TODO [JPA Buddy] create field to map the 'gender' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "gender", columnDefinition = "civility not null")
    private Object gender;
*/
}