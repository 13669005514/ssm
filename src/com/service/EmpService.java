package com.service;

import java.util.List;

import com.pojo.Emps;





public interface EmpService {
	
	boolean insertEmp(Emps emp);
	
	List<Emps> getEmps();
	
	boolean deleteEmp(int id);
	
	Emps selectEmp(Integer id);
	
	boolean changeEmp(Emps emp);

}
