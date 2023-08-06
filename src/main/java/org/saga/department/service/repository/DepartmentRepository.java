package org.saga.department.service.repository;

import java.util.Optional;

import org.saga.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	Optional<Department> findByDepartmentCode(String departmentCode);
}
