package bubble_sort;

public class classwork {

    public static void main(String[] args) {
        int[] array = {6, 3, 0, 5, -2, 67, 89, 51};
        bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
        }




    }
        public static void bubbleSort(int[] array) {
            boolean sorted = false;
            int temp;
            while (!sorted){
                sorted = true;
                for (int i=0; i<array.length-1; i++){
                    if (array [i] > array [i+1]) { // проверка необходимости перестановки соседних элементов
                        temp = array[i];
                        array[i]= array[i+1];
                        array [i+1]= temp;
                        sorted = false;

                    }
                }

                }
            }


        }


