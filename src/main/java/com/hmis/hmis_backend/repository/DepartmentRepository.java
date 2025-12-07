package com.hmis.hmis_backend.repository;

import com.hmis.hmis_backend.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
