package com.example.sprintapi.model;

import org.springframework.stereotype.Component;

public class student {

    private int rollno;
    private String Name;
    private  String groups;

    public student(int rollno, String Name, String groups) {
        this.groups=groups;
        this.rollno=rollno;
        this.Name=Name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", Name='" + Name + '\'' +
                ", groups='" + groups + '\'' +
                '}';
    }
}
