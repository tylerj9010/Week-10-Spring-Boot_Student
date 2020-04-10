package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Student;
import dmacc.repository.StudentRepository;

@Controller
public class WebController {
	@Autowired
	StudentRepository repo;

	@GetMapping({ "/", "viewAll" })
	public String viewAllStudents(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewStudent(model);
		}
		model.addAttribute("students", repo.findAll());
		return "results";
	}

	@GetMapping("/inputStudent")
	public String addNewStudent(Model model) {
		Student s = new Student();
		model.addAttribute("newStudent", s);
		return "input";
	}

	@GetMapping("/edit/{id}")
	public String showUpdateStudent(@PathVariable("id") long id, Model model) {
		Student c = repo.findById(id).orElse(null);
		model.addAttribute("newStudent", c);
		return "input";
	}

	@PostMapping("/update/{id}")
	public String reviseStudent(Student c, Model model) {
		repo.save(c);
		return viewAllStudents(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
		Student c = repo.findById(id).orElse(null);
	    repo.delete(c);
	    return viewAllStudents(model);
	}
}