package mfsi.learnmvc.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee extends BaseEntity {

	@Column
	private String name;

	@Column
	private Double salary;

	@OneToMany(mappedBy = "employee")
	private Set<Asset> assets;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Double salary) {
		super();
		super.setId(id);
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Set<Asset> getAssets() {
		return assets;
	}

	public void setAssets(Set<Asset> assets) {
		this.assets = assets;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", assets=" + assets + "]";
	}

}
