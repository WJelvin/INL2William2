package com.company.reportcard;

public class Main {

    public static void main(String[] args) {

        Student ola = new Student("Ola");
        Student meral = new Student("Meral");
        Student anna = new Student("Anna");

        Teacher teacher1 = new Teacher("Christian");
        Teacher teacher2 = new Teacher("Erik");

        Subject subject = new Subject("Programmering");

        Program javaprogrammet = new Program("Javautvecklare");
        javaprogrammet.addStudentsToProgram(ola, meral, anna);

        Seminar seminar1 = new Seminar(teacher1, "OOP", javaprogrammet);
        Seminar seminar2 = new Seminar(teacher2, "Patterns", javaprogrammet);

        seminar1.addSubjectToSeminar(subject);
        seminar2.addSubjectToSeminar(subject);

        ProgramCoordinator programCoordinator = new ProgramCoordinator("Sara", javaprogrammet);

        programCoordinator.addTeacher(teacher1);
        programCoordinator.addTeacher(teacher2);

        teacher1.setCurrentSeminar(seminar1);
        teacher2.setCurrentSeminar(seminar2);

        ola.attendSeminar(new Attendance(ola, seminar1));
        meral.attendSeminar(new Attendance(meral, seminar1));
        anna.attendSeminar(new Attendance(anna, seminar1));

        ola.attendSeminar(new Attendance(ola, seminar2));
        meral.attendSeminar(new Attendance(meral, seminar2));


        //Vilket program en koordinator ansvarar för.
        System.out.println(programCoordinator.getProgramCoordinated().getName());


    }
}