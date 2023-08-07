package com.mit.hibernate.entity;


import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Column;


@Entity
public class Person 
{
    @Id
    private int ssn;
    @Column(name="name")
    private String personName;

    @Column(name="age")
    private int personAge;

    private String gender;

    @OneToOne
    @JoinColumn(name="address_id")
    Address address;

    public Person() {}

 

    public Person(int ssn, String personName, int personAge, String gender, Address address) {

        this.ssn = ssn;
        this.personName = personName;
        this.personAge = personAge;
        this.gender = gender;
        this.address = address;
    }

 

    public int getSsn() {
        return ssn;
    }

 

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

 

    public String getPersonName() {
        return personName;
    }

 

    public void setPersonName(String personName) {
        this.personName = personName;
    }

 

    public int getPersonAge() {
        return personAge;
    }

 

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

 

    public String getGender() {
        return gender;
    }

 

    public void setGender(String gender) {
        this.gender = gender;
    }

 

    public Address getAddress() {
        return address;
    }

 

    public void setAddress(Address address) {
        this.address = address;
    }



 

    
}