package com.company.del2;

import java.util.ArrayList;

public class Program {

    private String name;
    private ArrayList<Student> studentsInProgram = new ArrayList<>();

    public ArrayList getStudents() {
        return studentsInProgram;
    }

    public void addStudentToProgram(Student student) {
        studentsInProgram.add(student);
    }

    public int numberOfEnrolledStudents() {
        return studentsInProgram.size();
    }
}
