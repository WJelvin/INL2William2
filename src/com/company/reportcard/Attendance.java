package com.company.reportcard;

public class Attendance {

    private Student attendingStudent;
    private Seminar seminarAttended;
    private int attendanceLevel = attendingStudent.getSeminarsAttended().size() / seminarAttended.getProgram().getSeminarsInProgram().size();

    public Attendance() {
    }

    public void registerAttendance(Seminar seminar, Student student) {
        attendingStudent = student;
        seminarAttended = seminar;
        seminar.addAttendence(this);
        student.attendSeminar(this);
    }

    public void removeAttendance(Seminar seminar, Student student) {
        seminar.removeAttendence(this);
        student.removeSeminar(this);
    }

    public Student getAttendingStudent() {
        return attendingStudent;
    }
}
