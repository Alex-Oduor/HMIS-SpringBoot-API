package com.hmis.hmis_backend.controller;

import com.hmis.hmis_backend.entity.Patient;
import com.hmis.hmis_backend.services.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }


  // Adding a new patient
    @PostMapping
    public Patient createUser(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

    //retrieve all patients
    @GetMapping
    public List<Patient> getAllPatients(){
        return patientService.getAllPatients();
    }

    //retrieve a patient by id
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getUserById(@PathVariable Integer id){
        return patientService.getPatientById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
