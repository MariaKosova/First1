package static_keyWord;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Plattforms {

    /*
    написать метод, находящий минимальное количество платформ, неоходимых для приема поездов на станции в каждый момент
    времени. Известно время прибытия и отправления поездов ( расписание)

    arrival[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00)
    departure [] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00)
    time      arr/dep            plattforms
    1:00        Arr                  1
    1:10        Dep                  0
    1:40        Arr                  1
    1:50        Arr                  2
    2:00        Arr                  3
    2:15        Arr                  4
    2:20        Dep                  3
    2:30        Dep                  2
    3:00        Dep                  1
    3:15        Dep                  0
    4:00       Arr                   1
    6:00       Dep                   0

    */

public int findNumberPlatfroms (int arr[], int dep[]);
Arrays.sort(arr);
Arrays.sort (dep);
//int arr[] = {100, 140,150,200,215,400};
//int dep[] = {110,300,220,230,315,600};
int platformsCurrent = 0;
int platformsMax = 0;

int i =0, j= 0;

while (i<arr.lenth &&  j<dep.length) {


    }

public static int minArr (int arr[]) {
    int min = arr [0];
}





}
