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
		Employee employee = mapper(dto);
		employee = repository.save(employee);
		return mapper(employee);
	}

	public List<EmployeeDto> getAll() {
		return employees;
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}

	public EmployeeDto update(EmployeeDto dto) {
		int index = employees.indexOf(dto);
		employees.set(index, dto);
		return dto;
	}

	public EmployeeDto search(Integer id) {
		Employee e = repository.findById(id).get();
		return mapper(e);
	}

	private Employee mapper(EmployeeDto dto) {
		Employee employee = new Employee();
		employee.setId(dto.getId());
		employee.setName(dto.getName());
		employee.setSalary(dto.getSalary());
		return employee;
	}

	private EmployeeDto mapper(Employee e) {
		EmployeeDto dto = new EmployeeDto();
		dto.setId(e.getId());
		dto.setName(e.getName());
		dto.setSalary(e.getSalary());
		return dto;
	}
}
