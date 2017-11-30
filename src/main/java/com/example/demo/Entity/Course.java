package com.example.demo.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String courseNumber;

    private String description;

    @ManyToMany
    private Set<Student> students;

    @ManyToMany(mappedBy = "courses")
    private Set<Instructor> instructors;

    public Course() {
    }

    public Course(String title, String courseNumber, String description, Set<Student> students, Set<Instructor> instructors) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.students = students;
        this.instructors = instructors;
    }

    public Set<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(Set<Instructor> instructors) {
        this.instructors = instructors;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }
}
