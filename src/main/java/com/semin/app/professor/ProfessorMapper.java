package com.semin.app.professor;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.semin.app.page.Pager;

@Mapper
public interface ProfessorMapper {
	
	public List<ProfessorDTO> list(Pager pager) throws Exception;
	
	public Long getCount(Pager pager) throws Exception;
	
	public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception;
	
	public int create(ProfessorDTO professorDTO) throws Exception;
	
	public int delete(ProfessorDTO professorDTO) throws Exception;
	
	public int update(ProfessorDTO professorDTO) throws Exception;
}
