package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private String fname;

    private String lname;

    private String contactNumber;

    private String email;

    @ManyToMany
   private Set<Course> courses;

    public Instructor() {
    }

    public Instructor(String fname, String lname, String contactNumber, String email, Set<Course> courses) {
        this.fname = fname;
        this.lname = lname;
        this.contactNumber = contactNumber;
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

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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

    public void addCourse(Course course)
    {
        courses.add(course);
    }
}
