package com.company.reportcard;

import java.util.HashSet;


public class ProgramCoordinator {

    private String name;
    private Program programCoordinated;
    private HashSet<Teacher> teachersInProgram = new HashSet<>();

    public ProgramCoordinator(String name, Program programCoordinated) {
        this.name = name;
        this.programCoordinated = programCoordinated;
    }

    public void addTeacher(Teacher teacher) {
        teachersInProgram.add(teacher);
    }

    public Teacher findTeacher(String name) {
        for (Teacher t : teachersInProgram) {
            if ((t.getName()).equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }

    public Program getProgramCoordinated() {
        return programCoordinated;
    }

    public void setProgramCoordinated(Program programCoordinated) {
        this.programCoordinated = programCoordinated;
    }
}
