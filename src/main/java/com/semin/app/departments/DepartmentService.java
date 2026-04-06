package com.semin.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

		@Autowired
		private DepartmentDAO departmentDAO;
		
		// 전체 목록 List
		public List<DepartmentDTO> list() throws Exception {
			System.out.println("Service List");
			List<DepartmentDTO> arrayList = this.departmentDAO.list();
			
			return arrayList;
		}
}
