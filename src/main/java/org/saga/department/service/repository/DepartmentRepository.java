package org.saga.department.service.repository;

import org.saga.department.service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	Department findByDepartmentCode(String departmentCode);
}
