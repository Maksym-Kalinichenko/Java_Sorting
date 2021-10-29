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
public class Merge_Sort {

    void merge(int arr[], int low, int middle, int high) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - low + 1;
        int n2 = high - middle;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void Merge_Sort(int list[], int low, int high) {
        if (low < high) {
            // Find the middle point
            int middle = low + (high - low) / 2;

            //Firts Part
            Merge_Sort(list, low, middle);
            //Second Part
            Merge_Sort(list, middle + 1, high);

            // Merge the sorted halves
            merge(list, low, middle, high);
        }
    }
}
