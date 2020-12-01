package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StudentDao {
	
	Student getStu( String Sno);
	
	int updatesnickname(String Sno,String Snickname);
	
	int updatespw(String Sno,String Spw);
	
	int saveStu(Student studentVo);
	
	int deleteStu(String Sno);
	
}