package com.semin.app.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// 전체 목록
	@GetMapping("list")
	public void list() throws Exception {
		System.out.println("Controller list");
		List<DepartmentDTO> arrayList = this.departmentService.list();
		// (1)for(초기식;조건식;증감식){}
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.println(arrayList.get(i));
//		}
		// (2)for(데이터타입 변수명: collection){}
		for(DepartmentDTO departmentDTO: arrayList) {
			System.out.println(departmentDTO);
		}
	}
}
