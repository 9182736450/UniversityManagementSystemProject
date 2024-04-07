
package com.exam.spring.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.exam.spring.Department;
import com.exam.spring.DepartmentService;

@Controller
public class StudentController {

    @Autowired
    private Studentservice ss;

    @Autowired
    private DepartmentService ds;
    

    @GetMapping("/studentform")
    public String studentform() {
        return "student";
    }

    @GetMapping("/addstudentform")
    public String addstudentform(Model m) {
        List<Department> d = ds.showalldeparntment();
        m.addAttribute("de", d);
        return "addstudent";
    }

    @PostMapping("/addstudent")
    public String addstudent(@ModelAttribute Student student) {
        ss.addstudent(student);
        return "addstudent";
    }

    @GetMapping("/showstudent")
    public String showstudent(Model m) {
        List<Student> st = ss.showallstudent();
        m.addAttribute("st", st);
        return "showstudent";
    }

    @GetMapping("/studentformgetvalue/{id}")
    public String datagetupdateform(@PathVariable("id") int id, Model m) {
        Student s = ss.showbyid(id);
        m.addAttribute("s", s);
        return "studentupdate";
    }

    @PostMapping("/studentupdate")
    public String studentupdate(@ModelAttribute Student student, Model m) {
        ss.updatestudent(student);
        m.addAttribute("st", ss.showallstudent());
        return "showstudent";
    }

    @GetMapping("/deletestudent/{id}")
    public String deletestudent(@PathVariable("id") int id, Model m) {
        Student s = ss.showbyid(id);
        ss.deletestudent(s);
        m.addAttribute("st", ss.showallstudent());
        return "showstudent";
    }

    @PostMapping("/searchstudent")
    public String showById(@ModelAttribute Student student, Model m) {
        List<Student> st = new ArrayList<>();
        Student s = ss.showbyid(student.getId());
        st.add(s);
        m.addAttribute("st", st);
        return "showstudent";
    }
//search by name
	
//	@GetMapping("/searchstudent")
//	public String showByName(@RequestParam String name, Model m) {
//		m.addAttribute("st", sr.findByName(name));
//		return "showstudent";
//	}
}
