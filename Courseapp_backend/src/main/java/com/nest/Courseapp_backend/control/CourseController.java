package com.nest.Courseapp_backend.control;

import com.nest.Courseapp_backend.dao.CourseDao;
import com.nest.Courseapp_backend.model.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/",consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Courses c){
        System.out.println(c.getTitle().toString());
        System.out.println(c.getDescription().toString());
        System.out.println(c.getVenue().toString());
        System.out.println(c.getDuration().toString());
        System.out.println(c.getDate().toString());
        dao.save(c);
        return "course added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Courses> ViewAll(){
        return (List<Courses>) dao.findAll();
    }
}
