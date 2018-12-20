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


        Seminar oldSeminar1 = new Seminar(teacher1, "OOPold", javaprogrammet);
        Seminar oldSeminar2 = new Seminar(teacher1, "OOPolder", javaprogrammet);
        Seminar seminar1 = new Seminar(teacher1, "OOP", javaprogrammet);
        Seminar seminar2 = new Seminar(teacher2, "Patterns", javaprogrammet);

        seminar1.addSubjectToSeminar(subject);
        seminar2.addSubjectToSeminar(subject);

        javaprogrammet.addSeminarToProgram(seminar1);
        javaprogrammet.addSeminarToProgram(seminar2);

        ProgramCoordinator programCoordinator = new ProgramCoordinator("Sara", javaprogrammet);

        programCoordinator.addTeacher(teacher1);
        programCoordinator.addTeacher(teacher2);

        teacher1.setCurrentSeminar(oldSeminar1);
        teacher1.setCurrentSeminar(oldSeminar2);
        teacher1.setCurrentSeminar(seminar1);
        teacher2.setCurrentSeminar(seminar2);

        ola.attendSeminar(seminar1.getAttendence(seminar1, ola));
        meral.attendSeminar(seminar1.getAttendence(seminar1, meral));
        anna.attendSeminar(seminar1.getAttendence(seminar1, anna));

        ola.attendSeminar(seminar2.getAttendence(seminar2, ola));
        meral.attendSeminar(seminar2.getAttendence(seminar2, meral));

        //Vilket program en koordinator ansvarar för.
        System.out.println("Sara är koordinator för: " + programCoordinator.getProgramCoordinated().getName());
        System.out.println();

        //Hur många studenter som finns i ett program
        System.out.println("I programmet " + javaprogrammet.getName() + " finns det " + javaprogrammet.getStudents().size() + " studenter.");
        System.out.println();

        //Hur man lägger till en ny student i programmet
        System.out.println("Man lägger till en ny student med: javaprogrammet.addStudentsToProgram(new Student(\"William\"));");
        System.out.println();

        //Närvaron för en student
        System.out.println("Anna har deltagit i " + anna.getSeminarsAttended().size() + " av " + javaprogrammet.getSeminarsInProgram().size() + " seminarier.");
        System.out.println();

        //Vilka seminarier en lärare undervisat i
        System.out.println(teacher1.getName() + " har undervisat i: ");
        for (Seminar s : teacher1.getSeminarHistory()) {
            System.out.println(s.getName());
        }
        System.out.println();

        //Vilka ämnen som undervisas i ett seminar
        System.out.println("Följande undervisas i seminar1:");
        for (Subject s : seminar1.getSubjectsInSeminar()) {
            System.out.println(s.getName());
        }
        System.out.println();

        //Närvaron för ett seminar
        System.out.println("Närvaron i seminar2 är:");
        System.out.println(seminar2.getTotalAttendance() + "%");
        System.out.println();

        System.out.println("Nya (tomma) attendances skapas i konstruktorn till Seminar.\n" +
                "En attendance skapas per student i programmet.\n" +
                "När studenten närvarar registreras närvaron i en av dessa.");
    }
}