package our_strings;

public class Main1 {
    public static void main(String[] args) {
       // Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
        //Пример: abcd -> bcda
       // System.out.println (firstToEnd ("abcd") );
        //Пример: abcd -> dabc
        System.out.println(endToFirst("abcd"));
    }

   // public static String firstToEnd (String str) {
     //   String str1 = str.substring(1);
       // String str2 = str.substring(0, 1);
        //return str1 + str2;
    //}

    public static String endToFirst (String str) {
        String str1=str.substring(0,3);
        String str2=str.substring (3);
        return str2+str1;
    }

}
