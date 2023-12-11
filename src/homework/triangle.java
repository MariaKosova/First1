package homework;


public class triangle {
    public static void main(String[] args) {
        printTriangle(5);

    }

    static void printTriangle(int n) {
        int i = 1;
        int j= 1;
        //System.out.println (i);

        //while (i<=n) {


        //  int j=1;
        //while (j <=i) {
        //  System.out.print (j);
        //j++;
        //}
        //i++;
        //System.out.println ();
        //}
        for (i = 1; i <= n; i++) {
            for (j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
           // int j = 1;
    }

}



