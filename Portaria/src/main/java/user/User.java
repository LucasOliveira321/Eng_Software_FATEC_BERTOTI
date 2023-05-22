package user;

import java.math.BigDecimal;
import java.util.ArrayList;

public class User {
	
	private String name;
	private BigDecimal salary;
	private ArrayList<String> permissionsAcess;
	
	public User(String name,BigDecimal salary,ArrayList<String> permissionsAcess) {
		this.name = name;
		this.salary = salary;
		this.permissionsAcess = permissionsAcess;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public ArrayList<String> getPermissions(){
		return this.permissionsAcess;
	}
	
}
