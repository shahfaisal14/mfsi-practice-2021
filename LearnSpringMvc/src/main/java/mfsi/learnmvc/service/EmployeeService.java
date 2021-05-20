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

<<<<<<< HEAD
	public void delete(Integer id) {
		employees.removeIf(t -> t.getId().equals(id));
	}

	public EmployeeDto update(EmployeeDto dto) {
		/*for (int i = 0; i < employees.size(); i++) {
			EmployeeDto d = employees.get(i);
			if (d.getId().equals(dto.getId())) {
				employees.set(i, dto);
				return;
			}
		}*/
		int index = employees.indexOf(dto);
		employees.set(index, dto);
		return dto;
	}

	public EmployeeDto search(Integer id) {
		
		return employees.stream().filter(t -> t.getId().equals(id)).findAny().orElse(null);
		
	}
}
=======
	public EmployeeDto search(Integer id) {
	
		return employees.stream().filter(t -> t.getId().equals(id)).findAny().orElse(null);
		
	}

}
>>>>>>> 958599eadaa1213316f7a439abe518e671e27499
