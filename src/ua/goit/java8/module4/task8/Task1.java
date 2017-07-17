package ua.goit.java8.module4.task8;

import java.util.Scanner;

/**
 * Created by Taras on 17.07.2017.
 */
public class Task1 {
    public static void getTask(){
        System.out.println("Завдання №1.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        int x = sc.nextInt();
        sc.nextLine();
        printNumbers(x);
    }

    public static void printNumbers(int x){
        for (int i = 1; i<=x; i++){
            System.out.print(i + " ");
        }
    }
}
