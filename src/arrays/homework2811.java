package arrays;

public class homework2811 {

    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8};
        int[] array2 = {2, 4, 5, 9};
        System.out.println("Are array1 and array2 equal? " + (areEqual(array1, array2)));
    }

    public static boolean areEqual(int[] array1, int[] array2) {

        if (array1.length != array2.length)
            return false;
        //if (int[]array1 == int[]array2)
        //  System.out.println(array1.length == array2.length);
        //}

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}








