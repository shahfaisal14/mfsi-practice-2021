package mfsi.learnmvc.service;

import java.util.ArrayList;
import java.util.List;

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

	public void update(EmployeeDto dto, Integer id) {
		for (int i = 0; i < employees.size(); i++) {
			EmployeeDto d = employees.get(i);
			if (d.getId().equals(id)) {
				employees.set(i, dto);
				return;
			}
		}
	}

}
