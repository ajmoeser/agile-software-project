package com.scrdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrdl.Course;

@Controller
public class HomeController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    String index(Course course){
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewCourse(Course course, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        model.addAttribute("name", course.getName());
        model.addAttribute("code", course.getCode());
        model.addAttribute("taughtBy", course.getTaughtBy());

        return "viewcourses";
    }
}
