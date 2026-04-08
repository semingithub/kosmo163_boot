package com.semin.app.professor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfessorMapperTest {
	
	@Autowired
	private ProfessorMapper professorMapper;

	@Test
	void testList() throws Exception{
		List<ProfessorDTO> li = professorMapper.list();
		assertNotEquals(0, li.size());
		System.out.println(li.size());
	}

	@Test
	void testDetail() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P999");
		professorDTO = professorMapper.detail(professorDTO);
		assertNotNull(professorDTO);
		System.out.println(professorDTO);
	}

	//@Test
	void testCreate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P999");
		professorDTO.setProfessorName("고세민");
		professorDTO.setProfessorSsn("010216-1234567");
		professorDTO.setProfessorAddress("서울시 구로구");
		professorDTO.setDepartmentNo("037");
		
		int DTO = professorMapper.create(professorDTO);
		assertEquals(1, DTO);
		System.out.println(DTO);
	}

	//@Test
	void testDelete() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P999");
		int DTO = professorMapper.delete(professorDTO);
		assertEquals(1, DTO);
		System.out.println(DTO);
	}

	//@Test
	void testUpdate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorName("고수민");
		professorDTO.setProfessorSsn("990702-1234567");
		professorDTO.setProfessorAddress("서울시 용산구");
		professorDTO.setDepartmentNo("031");
		professorDTO.setProfessorNo("P999");
		
		int DTO = professorMapper.update(professorDTO);
		assertEquals(1, DTO);
		System.out.println(DTO);
	}

}
