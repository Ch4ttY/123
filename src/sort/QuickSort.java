package sort;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        initial();
   }

    public static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i<=j) {
            while (arr[i] > pivot)
                i++;
            while (arr[j] < pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
           }
        }
        return i;
    }

   public static void quickSort(int arr[], int left, int right) {
       int index = partition(arr, left, right);

      if (left < index - 1)
           quickSort(arr, left, index - 1);
       if (index < right)
           quickSort(arr, index , right);

    }

   public static void initial() {
       Scanner input  = new Scanner(System.in);
       System.out.println("Введите размер массива: ");

       int size = input.nextInt();
       int arr[] = new int[size];


       System.out.println("Введите последовательность чисел: ");
       for (int i = 0; i < arr.length; i++) {
           arr[i] = input.nextInt();
       }

       input.close();

       printLn(arr);

       }

       public static void printLn(int[] sortedMass) {

        quickSort(sortedMass, 0, sortedMass.length - 1);
        System.out.println("Отсортированная последовательность: ");

        for (int i = 0; i < sortedMass.length; i++) {
               System.out.print((sortedMass[i]) + " ");
        }

    }


}
