package com.example.demo.Controller;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.InstructorRepository;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    InstructorRepository instructorRepository;

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("/")

    public String index(Model model)
    {

        model.addAttribute("students",studentRepository.findAll());

        return "index";
    }


    @GetMapping("/addStudent")

    public String addStudentForm(Model model)
    {
        Student student= new Student();
        model.addAttribute("student", student);

        return "studentForm";
    }

    @PostMapping("/addStudent")
    public String addStudentProcess(@Valid @ModelAttribute("student") Student student, BindingResult result)
    {
        if( result.hasErrors())
        {
            return "studentForm";
        }

        studentRepository.save(student);


        return "redirect:/";
    }

}
