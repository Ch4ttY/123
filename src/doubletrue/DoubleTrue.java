package doubletrue;

import java.util.Scanner;

public class DoubleTrue {

    private static int ni = 2;
    private static int nj = 4;

    public static void main(String[] args) {
        input();
    }

    public static void input() {

        Scanner input = new Scanner(System.in);
        boolean[][] arr = initial();

        System.out.println("Введите последовательность true/false: ");   //заполнение массива входными значениями
        for (int i = 0; i < nj; i++) {
            arr[0][i] = input.nextBoolean();
        }
        input.close();

        compare(arr);

    }


    public static boolean[][] initial() {                           //начальное заполнение второй строки значениями true
        boolean[][] arr = new boolean[ni][nj];

        for (int i = 0; i < nj; i++) {
            arr[1][i] = true;
        }

        return arr;
    }


    public static void compare(boolean[][] mass) {                  //сравнение первой строки массива со второй
        int k = 0;
        for (int i = 0; i < nj; i++) {
            if (mass[0][i] == mass[1][i])
                k++;
        }
        if (k == 2)
            System.out.println("True");
        else
            System.out.println("False");

    }
}