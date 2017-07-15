package ua.goit.java8.module4.task1;

import java.util.Scanner;

/**
 * Created by Taras on 15-07-2017.
 */

/**
 * Задание 1

 Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод программы: 1 2 3 4 5
 */
public class Task1 {

    public static void main(String[] args) {
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
