package model;

public class Student {
    String name;
    int age;
    String major;
    public Student() {
        name = "белгісіз";
        age = 0;
        major = "енгізілмеген";
        System.out.println("студент по умолчанию құрылды");
    }
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        System.out.println("студент: " + name);
    }
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }
    public void printInfo() {
        System.out.println("Есімі: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандык: " + major);
        System.out.println("----------------------");
    }
}
