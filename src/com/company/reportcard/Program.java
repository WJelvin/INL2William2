package com.company.reportcard;

import java.util.ArrayList;

public class Program {

    private String name;
    private ArrayList<Student> studentsInProgram = new ArrayList<>();
    private ArrayList<Seminar> seminarsInProgram = new ArrayList<>();
    private Attendance attendance = new Attendance();

    public Program(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return studentsInProgram;
    }

    public void addStudentsToProgram(Student... students) {
        for (Student s : students) {
            studentsInProgram.add(s);
        }
    }

    public void addSeminarToProgram(Seminar seminar) {
        this.seminarsInProgram.add(seminar);
    }

    public ArrayList<Seminar> getSeminarsInProgram() {
        return seminarsInProgram;
    }

    public int numberOfEnrolledStudents() {
        return studentsInProgram.size();
    }

    public String getName() {
        return name;
    }
}