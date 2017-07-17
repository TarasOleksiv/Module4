package ua.goit.java8.module4.task8;

import java.util.Scanner;

/**
 * Created by Taras on 17.07.2017.
 */
public class Task5 {
    public static void getTask(){
        System.out.println("Завдання №5.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println(printNumbersRecursion(x));
    }

    public static String printNumbersRecursion(int x){
        if (x == 1) {
            return "1";
        }
        return printNumbersRecursion(x-1) + " " + x;
    }
}
