package com.company.reportcard;

public class Attendance {

    private AttendanceLevel attendanceLevel;
    private Student student;
    private Seminar seminar;

    public Attendance() {

    }

    public void registerAttendance(Seminar seminar, Student student) {
        this.seminar = seminar;
        this.student = student;
    }

    public void removeAttendance(Seminar seminar, Student student) {

    }

    public void setAttendanceLevel(AttendanceLevel level) {
        attendanceLevel = level;
    }

    public Student getStudent() {
        return student;
    }

    public Seminar getSeminar() {
        return seminar;
    }
}
