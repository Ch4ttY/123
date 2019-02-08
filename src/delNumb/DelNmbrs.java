package delNumb;

import java.util.Scanner;

public class DelNmbrs {
    public static void main(String[] args) {
    initial();
    }

    public static void initial() {
        Scanner input  = new Scanner(System.in, "UTF-8");
        System.out.println("Введите строку: ");
        String str = input.nextLine();

        String newStr = str.replaceAll( "\\d","");

        input.close();

        System.out.println("Строка без чисел: ");
        System.out.println(newStr);
    }


}
