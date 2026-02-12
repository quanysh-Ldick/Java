package model;

public class University {

    String universityName;

    public University(String universityName) {
        this.universityName = universityName;
    }
    public void enrollStudent(Student student) {
        System.out.println("Студент " + student.name +
                " осы универге түсті: " + universityName);
    }
}
