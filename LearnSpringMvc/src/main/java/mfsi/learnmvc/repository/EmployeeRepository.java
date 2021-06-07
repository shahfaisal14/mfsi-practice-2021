package mfsi.learnmvc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mfsi.learnmvc.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public List<Employee> findAll();

}
