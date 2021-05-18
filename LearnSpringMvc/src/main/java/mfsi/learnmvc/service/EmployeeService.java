package mfsi.learnmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mfsi.learnmvc.dto.EmployeeDto;

@Service
public class EmployeeService {

	private List<EmployeeDto> employees = new ArrayList<>();

	public EmployeeDto save(EmployeeDto dto) {
		employees.add(dto);
		return dto;
	}

	public List<EmployeeDto> getAll() {
		return employees;
	}

}
