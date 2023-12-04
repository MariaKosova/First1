package oop;

public class homework0412 {

    //Создать класс Student c полями (переменными) имя и возраст.
   // Создать несколько обьектов этого класса. Вывести их на печать
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Peter";
        student1.surname = "Smith";
        student1.age =20;
        System.out.println ("Student 1 is: " );
        System.out.println ("Name: " + student1.name);
        System.out.println ("Surname: " + student1.surname);
        System.out.println ("Age: " + student1.age);


        System.out.println ("Student 2 is: " );
        Student student2 = new Student( "Jack", "Brown", 22);
        student2.studentName();
        student2.studentSurname();
        student2.age();

        System.out.println ("Student 3 is: " );
        Student student3 = new Student ( "Antony", "Green", 21, 2003);
        student3.studentName();
        student3.studentSurname();
        student3.age();
        student3.birthYear();

    }
}
