package app;

import model.Student;
import model.University;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Али", 18, "Информатика");
        Student s2 = new Student("Азамат", 19, "Математика");
        Student s3 = new Student();
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s3.changeMajor("Физика");
        s3.printInfo();
        University uni = new University("АТУ");
        uni.enrollStudent(s1);
        uni.enrollStudent(s2);
        System.out.println("Программа аякталды");
    }
}
