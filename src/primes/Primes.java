package primes;

import java.util.Scanner;
import java.util.Arrays;

public class Primes {

    public static void main(String[] args) {

        int size = InputNumber();
        boolean[] prime = new boolean[size+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i < prime.length; i++) {
            if (prime[i])
                for (int j = 2; i*j< prime.length; j++) {
                    prime[i*j] = false;
                }

            if (prime[i])
                System.out.print(i + " ");
        }
    }


    public static int InputNumber() {

        Scanner in  = new Scanner(System.in);
        System.out.println("Введите число: ");
        int nmbr = in.nextInt();
        in.close();
        return nmbr;

    }
}
