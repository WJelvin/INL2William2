package com.company.reportcard;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");
        Student student3 = new Student("Student 3");

        Teacher teacher1 = new Teacher("Teacher1");
        Teacher teacher2 = new Teacher("Teacher2");

        Subject subject = new Subject("Subject");

        Program program = new Program("Program1");
        program.addStudentsToProgram(student1, student2, student3);

        Seminar seminar1 = new Seminar(teacher1, "Seminar1", program);
        Seminar seminar2 = new Seminar(teacher2, "Seminar2", program);

        seminar1.addSubjectToSeminar(subject);
        seminar2.addSubjectToSeminar(subject);

        ProgramCoordinator programCoordinator = new ProgramCoordinator("ProgramCoordinator", program);

        programCoordinator.addTeacher(teacher1);
        programCoordinator.addTeacher(teacher2);

        teacher1.setCurrentSeminar(seminar1);
        teacher2.setCurrentSeminar(seminar2);

        seminar1.


    }
}