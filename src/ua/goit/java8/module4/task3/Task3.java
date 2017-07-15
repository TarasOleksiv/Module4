package ua.goit.java8.module4.task3;

import java.util.Scanner;

/**
 * Created by Taras on 15-07-2017.
 *
 * Задание 3

 Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать на вход только 1 параметр
 (ширина квадрата) и рисовать квадрат с равными сторонами
 Например 2 Вывод программы: + + + + Например 3 Вывод программы: + + + + + + + + +
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ширину прямокутника: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть висоту прямокутника: ");
        int m = sc.nextInt();
        sc.nextLine();
        if (n == m) {
            drawRectangle(n);
        } else {
            drawRectangle(n, m);
        }
    }

    public static void drawRectangle(int n, int m){
        for (int j = 1; j <= m; j++){
            System.out.println();
            for (int i = 1; i <= n; i++){
                System.out.print("+");
            }
        }
    }

    public static void drawRectangle(int n){
        for (int j = 1; j <= n; j++){
            System.out.println();
            for (int i = 1; i <= n; i++){
                System.out.print("+");
            }
        }
    }

}
