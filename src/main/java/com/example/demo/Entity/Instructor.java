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
    @JoinTable(name="instructor_course",joinColumns = @JoinColumn(name="instructor_id",referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name="COURSE_ID",referencedColumnName = "ID"))
    private Set<Course> courses;

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

    public void addCourse(Course course)
    {
        courses.add(course);
    }
}
