package com.nest.Courseapp_backend.control;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {

    @PostMapping("/")
    public String addCourse(){
        return "course added successfully";
    }


}
