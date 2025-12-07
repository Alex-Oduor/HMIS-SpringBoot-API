package com.hmis.hmis_backend.web;

import com.hmis.hmis_backend.domain.Patient;
import com.hmis.hmis_backend.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/patient")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }


  // Adding a new patient
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient){
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
