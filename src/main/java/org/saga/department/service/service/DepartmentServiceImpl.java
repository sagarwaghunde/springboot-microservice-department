package org.saga.department.service.service;

import org.saga.department.service.dto.DepartmentDto;
import org.saga.department.service.entity.Department;
import org.saga.department.service.mapper.DepartmentMapper;
import org.saga.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public DepartmentDto saveDepartment(DepartmentDto deptDto) {
		// convert deptDto to jpa entity
		Department dept = DepartmentMapper.MAPPER.mapToDept(deptDto);
		
		Department savedEntity = departmentRepository.save(dept);
		
		return DepartmentMapper.MAPPER.mapToDeptDto(savedEntity);
	}

	@Override
	public DepartmentDto getDepartmentByCode(String deptCode) {
		Department entity = departmentRepository.findByDepartmentCode(deptCode);
		return DepartmentMapper.MAPPER.mapToDeptDto(entity);
	}

}
