package com.mit.hibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
//@Table(name="department")
public class Department

{

    @Id

    @Column(name="deptno")

    private int departmnetNo;

    

    @Column(name="deptname")

    private String dapartmentName;

    
    @Column(name="location")
    private String location;

    

  /*  @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)

    @JoinColumn(name="deptno")*/

    @OneToMany(mappedBy="department")
    List<Employee> employees;

    public Department() {}

 

    public Department(int departmnetNo, String dapartmentName, String location) {

        

        this.departmnetNo = departmnetNo;

        this.dapartmentName = dapartmentName;

        this.location = location;

    }

 

    public int getDepartmnetNo() {

        return departmnetNo;

    }

 

    public void setDepartmnetNo(int departmnetNo) {

        this.departmnetNo = departmnetNo;

    }

 

    public String getDapartmentName() {

        return dapartmentName;

    }

 

    public void setDapartmentName(String dapartmentName) {

        this.dapartmentName = dapartmentName;

    }

 

    public String getLocation() {

        return location;

    }

 

    public void setLocation(String location) {

        this.location = location;

    }

 

    public List<Employee> getEmployees() {

        return employees;

    }

 

    public void setEmployees(List<Employee> employees) {

        this.employees = employees;

    }

    

    

}

 
