package com.company.del2;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Attendance> seminarsAttended;

    public ArrayList getSeminarsAttended() {
        return seminarsAttended;
    }

    public void attendSeminar(Attendance attendance) {
        seminarsAttended.add(attendance);
    }
}
