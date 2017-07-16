package ua.goit.java8.module4.task5;

import java.util.Scanner;

/**
 * Created by Taras on 16.07.2017.
 *
 * Задание 5
 Решить задачу 1, без использования циклов. Использовав рекурсию.

 * Задание 1
 Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод программы: 1 2 3 4 5
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println(printNumbers(x));
    }

    public static String printNumbers(int x){
        if (x == 1) {
            return "1";
        }
        return printNumbers(x-1) + " " + x;
    }
}
