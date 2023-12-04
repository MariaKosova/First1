package oop;

public class Student {

    String name;
    String surname;
    int age;
    int birthYear;

    public Student() {

    }

    public void studentName() {
        System.out.println("Name:" + name);
    }

    public void studentSurname() {

        System.out.println("Surname: " + surname);

    }

    public void age() {
        System.out.println("Age: " + age);
    }

    public void birthYear() {
        System.out.println("Birth year " + birthYear);
    }


    public Student(String studentName, String studentSurname, int studentAge) {
        name = studentName;
        surname = studentSurname;
        age = studentAge;

    }

    public Student(String studentName, String studentSurname, int studentAge, int studentBirthYear) {
        name = studentName;
        surname = studentSurname;
        age = studentAge;
        birthYear = studentBirthYear;
    }
}