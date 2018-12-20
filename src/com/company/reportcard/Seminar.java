package com.company.reportcard;

import java.util.ArrayList;

public class Seminar {


    private String name;
    private Teacher teacher;
    private Program program;
    private ArrayList<Subject> subjectsInSeminar = new ArrayList<>();
    private ArrayList<Attendance> totalAttendence = new ArrayList<>();

    public Seminar(Teacher teacher, String name, Program program) {
        this.teacher = teacher;
        this.name = name;
        this.program = program;

        for (int i = 0; i < program.getStudents().size(); i++) {
            totalAttendence.add(new Attendance());
        }

    }

    public int getTotalAttendance() {
        int attending = 0;
        for (Attendance a : totalAttendence) {
            if ((a.getAttendingStudent()) != null){
                attending++;
            }
        }
        return attending;
    }

    public void addAttendence(Attendance attendance) {
        totalAttendence.add(attendance);
    }

    public void removeAttendence(Attendance attendance) {
        totalAttendence.remove(attendance);
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
}
