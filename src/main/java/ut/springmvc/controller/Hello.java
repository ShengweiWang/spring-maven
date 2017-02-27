package ut.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

    @RequestMapping("/hello")
    public String HelloWorld(Model model) {
    	System.out.println("111");
        model.addAttribute("message" , "Hello World!!");
        return "HelloWorld";
    }
}
