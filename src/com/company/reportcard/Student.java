package com.company.reportcard;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Seminar> seminarsAttended = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void attendSeminar(Attendance attendance) {
        seminarsAttended.add(attendance.getSeminar());
    }

    public ArrayList<Seminar> getSeminarsAttended() {
        return seminarsAttended;
    }
}