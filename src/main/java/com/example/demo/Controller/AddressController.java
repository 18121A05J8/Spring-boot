package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddressController {

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    private String addressControl(){
        return "address";
    }

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    private String con(@RequestParam  String location, Model model){
        model.addAttribute("add",location);
        return "address";
    }
}
