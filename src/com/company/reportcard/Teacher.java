package com.company.reportcard;

import java.util.ArrayList;

public class Teacher {

    private String name;
    private Seminar currentSeminar;
    private ArrayList<Seminar> seminarHistory = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public ArrayList<Seminar> getSeminarHistory() {
        return seminarHistory;
    }

    public Seminar getCurrentSeminar() {
        return currentSeminar;
    }

    public void setCurrentSeminar(Seminar currentSeminar) {
        if (currentSeminar != null)
            seminarHistory.add(currentSeminar);
        this.currentSeminar = currentSeminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
