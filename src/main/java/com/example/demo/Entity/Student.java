package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String fname;

    private String lname;

    private String contact;

    private String email;

    @ManyToMany(mappedBy = "students")
    Set<Course> courses;

    public Student() {
    }

    public Student(String fname, String lname, String contact, String email, Set<Course> courses) {
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.email = email;
        this.courses = courses;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void addcourse(Course course)
    {
        courses.add(course);
    }
}
