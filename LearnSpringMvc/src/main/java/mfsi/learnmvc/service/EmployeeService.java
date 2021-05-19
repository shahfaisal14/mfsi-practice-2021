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

	public EmployeeDto search(Integer id) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<employees.size();i++)
		{
			if(employees.get(i).getId().equals(id))
			{
				return employees.get(i);
			}
			
		}*/
		return employees.stream().filter(t -> t.getId().equals(id)).findAny().get();
		//return null;
	}

}
