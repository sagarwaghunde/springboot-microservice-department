package org.saga.department.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DeptCodeAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1121L;
	private String message;
	
	public DeptCodeAlreadyExistsException(String message) {
		super(message);
	}
}
