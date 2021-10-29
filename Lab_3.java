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
import java.util.ArrayList;
import static lab_3.Quick_Sort.Quick_Sort;
import static lab_3.Selection_Sort.Selection_Sort;
import static lab_3.Bubble_Sort.Bubble_Sort;

public class Lab_3 {

    public static void main(String[] args) {
        System.out.println("Array\t\tSelection\tBubble\t\tMerge\t\tQuick");
        System.out.print("Size\t\t  Sort\t\t Sort\t\t Sort\t\t Sort\n");
        for (int i = 50000; i <= 300000; i += 50000) {
            Print(i);
        }
        
        System.out.println("\n\nArray\t\tSelection\tBubble");
        System.out.print("Size\t\t  Sort\t\t Sort\n");
        for (int i = 2000000; i <= 5000000; i += 1000000) {
            Print2(i);
        }
        System.out.println("\n");
    }

    public static void Print(int ArraySize) {

        Merge_Sort ob = new Merge_Sort();

        int[] list = new int[ArraySize];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000000);
        }

        System.out.printf("\n" + ArraySize);

        //Selection Sort
        int[] list1 = new int[ArraySize];
        System.arraycopy(list, 0, list1, 0, list.length);
        long startTime = System.currentTimeMillis(); //start
        Selection_Sort(list1); //sort
        long endTime = System.currentTimeMillis(); //end

        System.out.printf("\t\t" + (endTime - startTime)); //time

        //Bubble Sort
        list1 = new int[ArraySize];
        System.arraycopy(list, 0, list1, 0, list.length);
        startTime = System.currentTimeMillis(); //start
        Bubble_Sort(list1); //sort
        endTime = System.currentTimeMillis(); //end

        System.out.printf("\t\t" + (endTime - startTime)); //time

        //Merge Sort
        list1 = new int[ArraySize];
        System.arraycopy(list, 0, list1, 0, list.length);
        startTime = System.currentTimeMillis(); //start

        ob.Merge_Sort(list1, 0, (list.length - 1)); //sort
        endTime = System.currentTimeMillis(); //end

        System.out.printf("\t\t" + (endTime - startTime)); //time

        //Quick Sort
        list1 = new int[ArraySize];
        System.arraycopy(list, 0, list1, 0, list.length);
        startTime = System.currentTimeMillis(); //start
        Quick_Sort(list1); //sort
        endTime = System.currentTimeMillis(); //end

        System.out.printf("\t\t" + (endTime - startTime)); //time
    }
    public static void Print2(int ArraySize) {

        Merge_Sort ob = new Merge_Sort();

        int[] list = new int[ArraySize];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 1000000);
        }

        System.out.printf("\n" + ArraySize);

        //Selection Sort
        int[] list2 = new int[ArraySize];
        System.arraycopy(list, 0, list2, 0, list.length);
        long startTime = System.currentTimeMillis(); //start
        Selection_Sort(list2); //sort
        long endTime = System.currentTimeMillis(); //end

        System.out.printf("\t\t" + (endTime - startTime)); //time

        //Bubble Sort
        list2 = new int[ArraySize];
        System.arraycopy(list, 0, list2, 0, list.length);
        startTime = System.currentTimeMillis(); //start
        Bubble_Sort(list2); //sort
        endTime = System.currentTimeMillis(); //end

        System.out.printf("\t\t" + (endTime - startTime)); //time
    }

}
