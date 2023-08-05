package org.saga.department.service.service;

import org.saga.department.service.dto.DepartmentDto;

public interface DepartmentService {
	DepartmentDto saveDepartment(DepartmentDto deptDto);
	
	DepartmentDto getDepartmentByCode(String deptCode);
}
