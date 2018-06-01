package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.EmpsMapper;
import com.pojo.Emps;
import com.pojo.EmpsExample;
import com.pojo.EmpsExample.Criteria;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpsMapper empsMapper;
	

	public boolean insertEmp(Emps emp) {
		// TODO Auto-generated method stub
		empsMapper.insert(emp);
		return true;
	}


	public List<Emps> getEmps() {
		// TODO Auto-generated method stub
		
		
		List<Emps> emps = empsMapper.selectByExample(null);
		return emps;
	}


	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		int key = empsMapper.deleteByPrimaryKey(id);
		return true;
	}


	public Emps selectEmp(Integer id) {
		// TODO Auto-generated method stub
		Emps emp = empsMapper.selectByPrimaryKey(id);
		return emp;
	}


	public boolean changeEmp(Emps emp) {
		// TODO Auto-generated method stub
		System.out.println("||||||||||||||");
		empsMapper.updateByPrimaryKey(emp);
		return true;
	}



}
