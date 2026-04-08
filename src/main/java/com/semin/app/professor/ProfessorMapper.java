package com.semin.app.professor;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfessorMapper {
	
	public List<ProfessorDTO> list() throws Exception;
	
	public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception;
	
	public int create(ProfessorDTO professorDTO) throws Exception;
	
	public int delete(ProfessorDTO professorDTO) throws Exception;
	
	public int update(ProfessorDTO professorDTO) throws Exception;
}
