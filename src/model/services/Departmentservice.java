package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class Departmentservice {
	
	public List<Department> findAll(){
		
		List<Department> lis = new ArrayList<>();
		lis.add(new Department(1,"Books"));
		lis.add(new Department(2,"Compuer"));
		lis.add(new Department(3,"eleronics"));
		return lis;
	}

}
