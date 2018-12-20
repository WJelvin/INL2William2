package com.company.reportcard;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Attendance> seminarsAttended;

    public Student(String name) {
        this.name = name;
    }

    public ArrayList getSeminarsAttended() {
        return seminarsAttended;
    }

    public void attendSeminar(Attendance attendance) {
        seminarsAttended.add(attendance);
    }

    public void removeSeminar(Attendance attendance) {
        seminarsAttended.remove(attendance);
    }
}
