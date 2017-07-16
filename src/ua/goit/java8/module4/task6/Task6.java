package ua.goit.java8.module4.task6;

import java.util.Scanner;

/**
 * Created by Taras on 16.07.2017.
 *
 * Задание 6
 Решить задачу 2, без использования циклов. Использовав рекурсию.

 Задание 2
 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах
 Например 3 на 2 Вывод программы: + + + + + +
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ширину прямокутника: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть висоту прямокутника: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.println(drawColumn(m,n));
    }


    public static String drawLine(int x){
        if (x == 1) {
            return "x ";
        }
        return drawLine(x-1) + "x ";
    }

    public static String drawColumn(int x, int y){
        if (x == 1) {
            return drawLine(y) + "\n";
        }
        return drawColumn(x-1,y) + drawLine(y) + "\n";
    }

}
