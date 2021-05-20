package mfsi.learnmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public void delete(Integer id) {
		employees.removeIf(t -> t.getId().equals(id));
	}

	public EmployeeDto update(EmployeeDto dto) {
		int index = employees.indexOf(dto);
		employees.set(index, dto);
		return dto;
	}

	public EmployeeDto search(Integer id) {
		return employees.stream().filter(t -> t.getId().equals(id)).findAny().orElse(null);
	}

}
