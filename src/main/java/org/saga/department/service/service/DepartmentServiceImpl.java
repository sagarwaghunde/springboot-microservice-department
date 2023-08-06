package org.saga.department.service.service;

import java.util.Optional;

import org.saga.department.service.dto.DepartmentDto;
import org.saga.department.service.entity.Department;
import org.saga.department.service.exception.DeptCodeAlreadyExistsException;
import org.saga.department.service.exception.ResourceNotFoundException;
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
		// find by department code
		Optional<Department> optionalDept = departmentRepository.findByDepartmentCode(deptDto.getDepartmentCode());
		optionalDept.ifPresent(dept -> {
			throw new DeptCodeAlreadyExistsException(String.format("Department with code '%s' already exists", dept.getDepartmentCode()));
		});
		// convert deptDto to jpa entity
		Department dept = DepartmentMapper.MAPPER.mapToDept(deptDto);
		
		Department savedEntity = departmentRepository.save(dept);
		
		return DepartmentMapper.MAPPER.mapToDeptDto(savedEntity);
	}

	@Override
	public DepartmentDto getDepartmentByCode(String deptCode) {
		Department entity = departmentRepository.findByDepartmentCode(deptCode).orElseThrow(
			() -> new ResourceNotFoundException("Department", "code", deptCode)
		);
		return DepartmentMapper.MAPPER.mapToDeptDto(entity);
	}

}
