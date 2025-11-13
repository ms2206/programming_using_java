/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.HashMap;

import javax.swing.JOptionPane;

/**
 *
 * @author mspriggs
 */
public class StudentDatabase {

    // HashMap to store students
    private static HashMap<String, model.Student> studentMap = new HashMap<>();

    // Add student to database
    public static void addStudent(model.Student student) {
        // put student in studentMap with full name as key
        studentMap.put(student.getFullName(), student);
        System.out.println("Student " + student.getFullName() + " added to the database.");
    }

    public static model.Student getStudent(String fullName) {
        /*
         * Return the Student object associated with the given full name.
         * If the student does not exist, return null.
         */
        if (checkStudentExists(fullName)) {
            return studentMap.get(fullName);
        } else {
            return null;
        }
    }

    public static void removeStudent(String fullName) {
        /*
         * Remove student from the database if they exist.
         * Else, print a message indicating the student does not exist.
         */
        if (checkStudentExists(fullName)) {
            studentMap.remove(fullName);
            System.out.println("Student " + fullName + " removed from the database.");
        } else {
            System.out.println("Student " + fullName + " does not exist in the database.");
        }

    }

    private static boolean checkStudentExists(String fullName) {
        // return true if student exists in studentMap
        return studentMap.containsKey(fullName);
    }

}
