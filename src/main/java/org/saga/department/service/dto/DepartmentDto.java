package org.saga.department.service.dto;

import jakarta.validation.constraints.NotBlank;

public class DepartmentDto {
	private Long id;
	@NotBlank(message = "department name should not be blank")
	private String departmentName;
	
	@NotBlank(message = "department description should not be blank")
	private String departmentDescription;
	
	@NotBlank(message = "department code should not be blank")
	private String departmentCode;

	public DepartmentDto() {}

	public DepartmentDto(Long id, String departmentName, String departmentDescription, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.departmentCode = departmentCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	
}
