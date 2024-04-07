package com.exam.spring.contactus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactusController {

    @Autowired
    private ContactusRepo repo;

    @GetMapping("/sbwebpage")
    public String showUniversityWebPage() {
        return "sharnbasva"; // Assuming "sharnbasva" is the name of your university web page
    }

    @PostMapping("/thankyou")
    public String addContactRequest(@ModelAttribute Contactus user) {
        repo.save(user);
        return "thankyou"; // Assuming "thankyou" is the name of your thank you page
    }
}
