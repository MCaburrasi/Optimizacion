package ud1;

import java.util.Arrays;

public class Busqueda {

    public static int simpleSearch(int[] array, int search){
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search){
                position = i;
                break;
            }
        }
        return position;
    }

    public static int binarySearch(int[] array, int search){
        int position = -1;
        Arrays.sort(array);

        int i = 0;
        int j = array.length - 1;
        int m;
        while (i <= j) {
            m = (j - i) / 2 + i;
            if (array[m] == search){
                position = m;
                break;
            } else if (array[m] < search){
                i = m+1;
            } else {
                j = m-1;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8, 12, 15, 23, 26, 31, 35};

        System.out.println(simpleSearch(array, 35));
        System.out.println(binarySearch(array, 35));
    }
}
