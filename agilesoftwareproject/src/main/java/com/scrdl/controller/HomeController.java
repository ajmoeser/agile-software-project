package com.scrdl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scrdl.Course;
import com.scrdl.CourseRepository;

@Controller
public class HomeController {

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping(value="/", method=RequestMethod.GET)
    String index(Course course){
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewCourse(Course course, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        courseRepository.save(new Course(course.getName(), course.getCode(), course.getTaughtBy(), course.getWorkload()));
        model.addAttribute("courses", courseRepository.findAll());
        return "redirect:viewcourses";
    }

    @RequestMapping(value = "/viewcourses", method = RequestMethod.GET)
    public String showAllCourses(Model model) {
        model.addAttribute("courses", courseRepository.findAll());
        return "viewcourses";

    }
}
