package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired 
	CustomerRepository repository ; 
	
	@GetMapping("/customer")
	public String customer(Model model, @RequestParam(value = "name", defaultValue = "World") String name) {
		var tasks = java.util.Arrays.asList("a", "b", "c", "d", "e", "f", "g");
		
		model.addAttribute("myData", "Good Morning!");
		model.addAttribute("name", name);		
		model.addAttribute("tasks", tasks);
		
		return "NewFile.html"; 
	}
}
