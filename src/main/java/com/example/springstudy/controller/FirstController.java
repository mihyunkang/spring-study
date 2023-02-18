package com.example.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "미현");
        return "greetings"; // templates/greetings.mustache -> send to browser
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "미현");
        return "goodbye";
    }
}
