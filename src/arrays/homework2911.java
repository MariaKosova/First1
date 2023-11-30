package arrays;

public class homework2911 {

   // Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
    //Метод возвращает false если нет и true если да.
    //т.е. для массива 10, 15, 10, 1, 25, 10 -> true
    //для массива 10, 15, 10, 1, 25, 45 -> false
    //Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m
   public static void main(String[] args) {
       int[]numbers1 = {10,15,10,1,25,10};
       int[]numbers2 = {10,15,10,1,25,45};

       System.out.println (countSum(numbers1));
       System.out.println (countSum(numbers2));
   }
   public static boolean countSum (int[] numbers1) {
       int m=30;
       int n = 10;
       int sum = 0;
       int counter =0;

       for (int i = 0; i < numbers1.length; i++) {
           if (numbers1[i]==n) {
               counter ++;
               sum= sum + numbers1[i];
           }
            if (sum == m)
           return true;
       }
    return false;
   }
}

