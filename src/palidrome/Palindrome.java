package palidrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String str = inputStr();

        if (comparing(str))
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");

    }

    public static boolean comparing(String str) {
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length();

        for (int i = 0; i < length / 2; i++) {
            if (lowerCase.charAt(i) != lowerCase.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static String inputStr() {
        Scanner in = new Scanner(System.in, "UTF-8");
        System.out.println("Введите текст: ");
        String str = in.nextLine();

        str = str.replaceAll("[^a-zA-Z_0-9а-яА-ЯёЁ]", "");

        in.close();
        return str;
    }
}
