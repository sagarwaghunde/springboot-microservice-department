package org.saga.department.service.controller;

import org.saga.department.service.dto.DepartmentDto;
import org.saga.department.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("api/v1/departments"))
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	// Build save department rest API
	@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto deptDto) {
		DepartmentDto savedEntity = departmentService.saveDepartment(deptDto);
		return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);
	}
	
	// Build get department by code rest API
	@GetMapping("{dept-code}")
	public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable("dept-code") String deptCode) {
		DepartmentDto deptDto = departmentService.getDepartmentByCode(deptCode);
		return ResponseEntity.ok(deptDto);
	}
}
