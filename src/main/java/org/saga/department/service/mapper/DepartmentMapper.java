package org.saga.department.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.saga.department.service.dto.DepartmentDto;
import org.saga.department.service.entity.Department;


@Mapper
public interface DepartmentMapper {
	// entrypoint
	DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);
	
	// Source and target objects should have same filed names for default implementation
	// if field names are not same, mapping can be used
	DepartmentDto mapToDeptDto(Department dept);
	
	Department mapToDept(DepartmentDto dept);
}
