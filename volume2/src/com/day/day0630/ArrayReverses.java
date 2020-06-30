package com.day.day0630;

import java.util.Arrays;

public class ArrayReverses {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
