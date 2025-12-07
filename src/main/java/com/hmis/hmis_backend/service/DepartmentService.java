package com.hmis.hmis_backend.service;

import com.hmis.hmis_backend.domain.Department;
import com.hmis.hmis_backend.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    public final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository){ this.departmentRepository=departmentRepository;}

    // add a new department
    public Department addDepartment(Department department){ return departmentRepository.save(department);}

    //retrieve all departments
    public List<Department> getAllDepartments(){ return departmentRepository.findAll();}

    //retrieve departments by id
    public Optional<Department> getDepartmentById(int id){return departmentRepository.findById(id);}
}
