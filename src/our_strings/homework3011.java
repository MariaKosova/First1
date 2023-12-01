package our_strings;

public class homework3011 {
//Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
//Пример: Hello -> 10
    public static void main(String[] args) {

        String str1= "Hello";
        System.out.println ( "The double length of string is " + (2*(str1.length())));

        //Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе, но без первых букв и в верхнем регистре.
        //        Пример: "Hello", "There" -> ELLOHERE

        String str2 = "here";
        str1 = ("Hello".substring(1,4).toUpperCase());
        str2 ="here".toUpperCase();
        System.out.print (str1+str2);

    }
}
