package com.hmis.hmis_backend.web;

import com.hmis.hmis_backend.domain.Department;
import com.hmis.hmis_backend.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    //retrieve all patients
    @GetMapping
    public List<Department> getAllPatients(){
        return departmentService.getAllDepartments();
    }

    //retrieve a patient by id
    @GetMapping("/{id}")
    public ResponseEntity<Department> getUserById(@PathVariable Integer id){
        return departmentService.getDepartmentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
