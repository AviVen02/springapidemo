package com.example.sprintapi.seviceclass;

import com.example.sprintapi.model.student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Studentservice {

    List<student> student =new ArrayList<>(Arrays.asList(
            new student(1,"Avi","java"),
            new student(2,"Ven","c++"),
            new student(3,"Ven","c++"),
    new student(4,"Ven","c++")
    ));

    public List<student> Studentget() {

        return student;
    }


    public student singlestu(int rollno) {
        int index=0;
        for(int i = 0; i<student.size(); i++){
            if(student.get(i).getRollno()==rollno){
                index=i;
            }

        }
        return student.get(index);
    }

    public void addstudent(student stu) {
        student.add(stu);
    }

    public void updatestudent(student st) {
        int index =0;
        for(int i=0;1< student.size();i++){
        if(student.get(i).getRollno()==st.getRollno()){
            index=i;
            break;
        }
        }
        student.set(index,st);
    }
}
