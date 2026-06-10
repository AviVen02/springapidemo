package com.example.sprintapi.frontcontroller;

import com.example.sprintapi.model.student;
import com.example.sprintapi.seviceclass.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontoller {

    @Autowired
    Studentservice s;

    @GetMapping("st1")
    public List<student> Studentget(){
       return s.Studentget();
    }

    @GetMapping("student/{roll}")
    public student singlestudent(@PathVariable("roll") int rollno ){
        return s.singlestu(rollno);

    }

    @PostMapping("student")
    public String fixingstudent(@RequestBody student stu){
        s.addstudent(stu);
        return "done";
    }

    @PutMapping("update")
    public String updatestudent(@RequestBody student st){
        s.updatestudent(st);
        return "Updated";

    }

}
