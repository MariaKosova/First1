package arrays;

public class homework {
    //Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
//-Вывести созданный массив на экран используя цикл for.
           // -Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
//-Вывести измененный массив на экран используя цикл for.
 //   Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
    public static void main(String[] args) {
        String[] fruits = { "Orange", "Apple", "Banana", "Mango"};
        //String[] fruits = new String [4];
        fruits [0] = "Orange";
        for (int  i = 0; i < fruits.length; i++ ){
            System.out.println ("Fruits are [ " + i + "] " + fruits[i]);
        }
        fruits [1] = "Kiwi";
        System.out. println ( "New list of fruits is: ");
        for (int i = 0; i< fruits.length; i++){
            System.out.println (" [" + i + "]"+ fruits[i]);
        }
//Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
//Задание можно выполнить непосредственно в методе main либо создать отдельный метод.

        String[] fruits1 = { "Orange", "Apple", "Banana", "Mango"};
        fruits1 [0] = "Orange";
        for (int i=0; i < fruits1.length; i=i+2){

            System.out.println ("Even number of fruit is: " + fruits1 [i]);

        }

    }





}
