package mfsi.learnmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mfsi.learnmvc.domain.Employee;
import mfsi.learnmvc.dto.EmployeeDto;
import mfsi.learnmvc.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	private List<EmployeeDto> employees = new ArrayList<>();

	public EmployeeDto save(EmployeeDto dto) {
		employees.add(dto);
		Employee employee = mapper(dto);
		repository.save(employee);
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
	
	private Employee mapper(EmployeeDto dto) {
		Employee employee = new Employee();
		employee.setId(dto.getId());
		employee.setName(dto.getName());
		employee.setSalary(dto.getSalary());
		return employee;
	}
}





