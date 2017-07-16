package ua.goit.java8.module4.task4;

import java.util.Scanner;

/**
 * Created by Taras on 15-07-2017.
 * Задание 4
 Написать функцию getMax которая принимает на вход два аргумента в виде чисел.
 А возврыщает максимальное из этих двух.
 Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
 *
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше ціле число: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть друге ціле число: ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.println("Більшим із введених чисел " + n + " та " + m + " є число " + getMax(n,m));

        System.out.print("Введіть перше довільне число: ");
        float n1 = sc.nextFloat();
        sc.nextLine();
        System.out.print("Введіть друге довільне число: ");
        float m1 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Більшим із введених чисел " + n1 + " та " + m1 + " є число " + getMax(n1,m1));

    }

    public static int getMax(int n, int m){
        if (n >= m){
            return n;
        } else {
            return m;
        }
    }

    public static float getMax(float n, float m){
        if (n >= m){
            return n;
        } else {
            return m;
        }
    }
}
