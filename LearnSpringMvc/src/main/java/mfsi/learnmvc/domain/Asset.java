package mfsi.learnmvc.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asset extends BaseEntity {

	private String name;

	private String type;

	private String batchNo;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public Asset() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Asset [name=" + name + ", type=" + type + ", batchNo=" + batchNo + ", employee=" + employee + "]";
	}

}
