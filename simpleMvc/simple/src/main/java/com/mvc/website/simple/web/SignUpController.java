package com.mvc.website.simple.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
    @RequestMapping("/signup") // this is the route (requested)
    String getSignUpPage() {
        return "signup"; // .jsp file
    }
}
