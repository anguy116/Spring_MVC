package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    //Ensures HTTP GET requests to '/greeting' are mapped to greeting() method
    //The @RequestParam binds the value of the query string parameter name to the name parameter in greeting()
    //If a query string is absent the default value will be "world"
    //The name will be added to the model object... ultimately making it accessable to the view template
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false,defaultValue="world") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
}