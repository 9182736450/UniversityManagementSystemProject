package com.exam.spring.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminRegistrationController {

	
	

    @Autowired
    private AdminService ss;


    

    @GetMapping("/registeradmin1")
    public String adminform() {
        return "adminlogin";
    }

//    @GetMapping("/postandlogin")
//    @ResponseBody
//    public String addstudent(@ModelAttribute AdminRegistrationForm admin,@RequestBody String requestBody) {
//        ss.addadmin(admin);
//        return "adminlogin";
//        
//        
//}
//		
//	}
//    @PostMapping("/postandlogin")
//    @ResponseBody
//    public String handlePostLogin(@RequestBody String requestBody) {
//        // Process the POST request and return a response
//        return "Post request handled successfully";

}