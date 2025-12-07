package com.hmis.hmis_backend.service;
import com.hmis.hmis_backend.repository.PatientRepository;
import com.hmis.hmis_backend.domain.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Service layer interacting with the repository
@Service
public class PatientService {
    private final PatientRepository patientRepository;

    //constructor
    public PatientService(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    //save new patient
    public Patient savePatient(Patient patient){
        return  patientRepository.save(patient);
    }

    //retrieve all patients
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    // retrieve a patient by id
    public Optional<Patient> getPatientById(Integer id){
        return patientRepository.findById(id);
    }

}
