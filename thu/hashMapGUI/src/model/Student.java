/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.StudentDatabase;

/**
 *
 * @author mspriggs
 */
public class Student {

    private String firstName;
    private String lastName;
    private String fullName;
    private String grade;
    private static int totalStudents = 0;

    // init
    public Student(String firstName, String lastName, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = getFullName();
        this.grade = "No Grade Entered";
        updateDatabase(this);
        incrementTotalStudents();

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        String fullName = this.firstName + ' ' + this.lastName;
        this.fullName = fullName;
        return fullName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    private void updateDatabase(Student student) {
        StudentDatabase.addStudent(student);
    }

    private void incrementTotalStudents() {
        totalStudents++;
    }

    public String toString() {
        return "Student Name: " + getFullName() + ", Grade: " + getGrade();
    }

}
