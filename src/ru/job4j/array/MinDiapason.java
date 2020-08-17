package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int max) {
        int min = array[start];
        for (int i = start; i <= max; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
