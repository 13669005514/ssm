package com.cn;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Emps;
import com.service.EmpService;




@Controller
public class ComController {
	@Autowired
	private EmpService empService;

	//查询员工信息列表
	@RequestMapping("/empLists")
	public 	@ResponseBody List<Emps> EmpLists(){
		System.out.println("=============================================");
		List<Emps> emps = empService.getEmps();
		for (Emps emps2 : emps) {
			System.out.println(emps2.toString());
		}
		return emps;
	}
	
	//新增用户
	@RequestMapping(value="/empInsert",method=RequestMethod.POST)
	public void insert(Emps emps,HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("=============================================");
		System.out.println(emps.getName());
		boolean flag = empService.insertEmp(emps);
		try {
			request.getRequestDispatcher("Home.htm").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//删除用户
	@RequestMapping("/DeleteEmp")
	public  void deleteEmp(int id,HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("dasdadadada");
		boolean key = empService.deleteEmp(id);
		System.out.println(key);
	}
	
	//查询单个用户信息
	@RequestMapping(value="/selectEmpId",method=RequestMethod.POST)
	public void selectEmpId(int id,HttpSession session,HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("==================444===========================");
		session.setAttribute("id", id);

	}
	
	//渲染单个员工信息
		@RequestMapping("/getEmp")
		public 	@ResponseBody Emps GetEmp(HttpSession session,HttpServletRequest request){
			System.out.println("=================5555============================");
	
			Integer id = (Integer) session.getAttribute("id");
			
			System.out.println(id);

			Emps emp = empService.selectEmp(id);
			return emp;
		}
	
	
	
	
	@RequestMapping(value="/updateEmp",method=RequestMethod.POST)
	public void updateEmp(Emps emp,HttpServletRequest request,HttpServletResponse response) throws Exception, IOException{
		
		System.out.println("==================666===========================");
		empService.changeEmp(emp);
		request.getRequestDispatcher("Home.htm").forward(request, response);
	}
	
	
	

}
