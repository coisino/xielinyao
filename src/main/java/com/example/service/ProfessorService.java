package com.example.service;

import java.util.List;

import com.example.pojo.Professor;
import com.example.pojo.Student;

public interface ProfessorService {
	
	List<Professor> queryall();
	
	Professor getPrf( String Pno);
	
	int savePrf(Professor professorVo);
	 
	int deletePrf(String Pno);
	
	String getPno(String Pname);
	
	int updatepdept(String Pno,String Pdept);
	
	int updateppos(String Pno,String Ppos);
	
}