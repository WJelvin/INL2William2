package com.company.reportcard;

public class Subject {

    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String viewSubjectInfo() {
        return "En kurs i " + name;
    }

    public String getName() {
        return name;
    }
}


