package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ConvertController {
    @GetMapping("/convert")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("convert");
        return modelAndView;
    }
    @PostMapping("/convert")
    public ModelAndView convertMoney(@RequestParam double usd){
        ModelAndView modelAndView = new ModelAndView("convert");
        double vnd = usd * 23000;
        modelAndView.addObject("usd", usd);
        modelAndView.addObject("vnd", vnd);
        return modelAndView;
    }
}
