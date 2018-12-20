package com.company.reportcard;

import java.util.ArrayList;

public class Seminar {


    private String name;
    private Teacher teacher;
    private Program program;
    private ArrayList<Subject> subjectsInSeminar = new ArrayList<>();
    private ArrayList<Attendance> attendances = new ArrayList<>();

    public Seminar(Teacher teacher, String name, Program program) {
        this.teacher = teacher;
        this.name = name;
        this.program = program;
        for (int i = 0; i < program.getStudents().size(); i++) {
            attendances.add(new Attendance());
        }
    }

    public double getTotalAttendance() {
        double attendees = 0;
        for (Attendance a : attendances) {
            if ((a.getStudent()) != null) {
                attendees++;
            }
        }
        return attendees / attendances.size() * 100;
    }

    public Attendance getAttendence(Seminar seminar, Student student) {
        for (Attendance a : attendances) {
            if (a.getStudent() == null) {
                a.registerAttendance(seminar, student);
                return a;
            }
        }
        return null;
    }

    public void addSubjectToSeminar(Subject subject) {
        subjectsInSeminar.add(subject);
    }

    public ArrayList<Subject> getSubjectsInSeminar() {
        return subjectsInSeminar;
    }

    public Program getProgram() {
        return program;
    }

    public String getName() {
        return name;
    }
}
