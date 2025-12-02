package com.hmis.hmis_backend.entity;
import jakarta.persistence.*;



@Entity    //Tells JPA that this class should be mapped to a table in the database.
@Table(name = "patients")
public class Patient {

    @Id  // marks the primary key,
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL-friendly  //automatically generates the ID for each new record.
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String gender;

    @Column(name = "seen_by_doctor")
    private Boolean seenByDoctor;

    public Patient() {}

    public Patient(String name, Integer age, String email, String gender, Boolean seenByDoctor) {
        this.name = name;
        this.age=age;
        this.email=email;
        this.gender = gender;
        this.seenByDoctor =seenByDoctor;
    }

    // getters & setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email= email; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age= age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Boolean getSeenByDoctor() { return seenByDoctor; }
    public void setSeenByDoctor(boolean seenByDoctor) { this.seenByDoctor =seenByDoctor; }
}
