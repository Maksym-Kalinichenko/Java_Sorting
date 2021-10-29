/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

/**
 *
 * @author maksymkalinichenko
 */
public class Quick_Sort {

    public static void Quick_Sort(int[] list) {
        Quick_Sort(list, 0, list.length - 1);
    }

    //list -array, low = 0, high - lenght
    private static void Quick_Sort(int[] list, int low, int high) {
        if (high > low) {
            int index = partition(list, low, high);
            Quick_Sort(list, low, index - 1);
            Quick_Sort(list, index + 1, high);
        }
    }

    //list -array, low = 0, high - lenght
    static int partition(int[] list, int low, int high) {

        int pivot = list[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (list[j] < pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
