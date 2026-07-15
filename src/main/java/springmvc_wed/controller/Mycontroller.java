package springmvc_wed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
	@RequestMapping("/insert")
	public void insertData() {
		System.out.println("data inserted successfully");
	}
		@RequestMapping("/delete")
		public void deleteData() {
			System.out.println("data deleted successfully");
		}
	}


