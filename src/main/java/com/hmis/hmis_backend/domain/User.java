package com.hmis.hmis_backend.domain;


import jakarta.persistence.*;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private int age;
    private String name;
    private String department;
    private String email;
    private String gender;

    public User(){}
    public User(Integer age ,String name, String department, String email , String gender){
        this.age= age;
        this.name= name;
        this.department = department;
        this.email = email;
        this.gender = gender;

    }

    //getters and setters
    public void setName(String name){this.name= name;}
    public void setAge(int age){ this.age = age;}
    public void setDepartment(String department){this.department = department;}
    public void setEmail(String email) { this.email= email; }
    public void setGender(String gender) { this.gender = gender; }

    public String getName(){return name;}
    public int getAge(){ return age ;}
    public String getDepartment(){return department;}
    public String getEmail() { return email; }
    public String getGender() { return gender; }


}
