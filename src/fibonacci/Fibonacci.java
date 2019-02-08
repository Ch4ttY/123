package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int n = input();

        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        in.close();

        return n;
    }

    public static int fib(int i) {
        if (i<= 0)
            return 0;
        else
            if (i == 1 || i == 2)
                return 1;
            else
                return fib(i - 1) + fib(i - 2);
        }
    }


