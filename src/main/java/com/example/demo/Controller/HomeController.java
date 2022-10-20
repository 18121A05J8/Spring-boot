package com.example.demo.Controller;


import com.example.demo.Service.ValidateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    ValidateService validateService=new ValidateService();
    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String hello(Model model){
        return "index";
    }
    @RequestMapping(value="/index", method = RequestMethod.POST)
    public String llo(@RequestParam String userid, @RequestParam("password") String password, Model model){
        if(validateService.isValidUser(userid, password))
            return "redirect:/address";
        model.addAttribute("msg", "Invalid credentials");
        return "index";
    }
}
