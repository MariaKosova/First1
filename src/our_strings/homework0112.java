package our_strings;

import java.util.Arrays;

public class homework0112 {

    //Написать метод, принимающий две строки и проверяющий является ли одна строка анграммой другой.Метод
    //возвращает boolean
    //abcd  - bcda acbd - анаграммы
    //abcd -    acb  abkc - не анаграммы

    //Вам могут пригодиться следующие методы:
    //toCharArray
    //Arrays.sort

    public static void main(String[] args) {
        System.out.println(controlAnagram("abcd", "akbd"));

    }

    public static boolean controlAnagram(String str1, String str2) {
        str1 = "abcd";
        str2 = "abkd";
        char[] strArray1 = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();
        boolean result = true;

        for (int i = 0; i < strArray1.length; i++)
            Arrays.sort(strArray1);
        for (int i = 0; i < strArray2.length; i++) {
            Arrays.sort(strArray2);
            if (strArray1 == strArray2) {
                //System.out.println("This is not anagram");
                return result;
            }
        }
        return result;
    }
}






