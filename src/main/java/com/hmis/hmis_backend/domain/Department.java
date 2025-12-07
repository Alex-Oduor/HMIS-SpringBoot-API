package com.hmis.hmis_backend.domain;

import jakarta.persistence.*;

@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;

    public Department(){}
    public Department(String name){ this.name = name;}

    //getters and setters
    public void setName(String name){ this.name = name;}
    public void  setId(Integer id){ this.Id = id;}

    public String getName(){return name;}
    public Integer getId(){return Id;}

}
