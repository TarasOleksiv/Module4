package ua.goit.java8.module4.task2;

import java.util.Scanner;

/**
 * Created by Taras on 15-07-2017.
 *
 * Задание 2

 Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'
 Аргументы функции: ширина прямугольника в символах,
 высота прямоугольника в символах Например 3 на 2 Вывод программы: + + + + + +

 */
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ширину прямокутника: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть висоту прямокутника: ");
        int m = sc.nextInt();
        sc.nextLine();
        drawRectangle(n,m);
    }

    public static void drawRectangle(int n, int m){
        int j = 1;
        while (j++ <= m){
            for (int i = 1; i <= n; i++){
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

}
