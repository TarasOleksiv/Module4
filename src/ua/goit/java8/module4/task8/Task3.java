package ua.goit.java8.module4.task8;

import java.util.Scanner;

/**
 * Created by Taras on 17.07.2017.
 */
public class Task3 {
    public static void getTask(){
        System.out.println("Завдання №3.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Що малюєм? (1 - прямокутник; будь-який інший символ - квадрат). Введіть символ: ");
        String c = sc.nextLine().trim();
        if (c.equals("1")) {
            System.out.print("Введіть ширину прямокутника: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.print("Введіть висоту прямокутника: ");
            int m = sc.nextInt();
            sc.nextLine();
            drawRectangle(n, m);
        } else {
            System.out.print("Введіть розмір квадрата: ");
            int n = sc.nextInt();
            drawRectangle(n);
        }
    }

    public static void drawRectangle(int n, int m){
        for (int j = 1; j <= m; j++){
            if (j != 1) {System.out.println();}
            for (int i = 1; i <= n; i++){
                System.out.print("+ ");
            }
        }
    }

    public static void drawRectangle(int n){
        for (int j = 1; j <= n; j++){
            System.out.println();
            for (int i = 1; i <= n; i++){
                System.out.print("+ ");
            }
        }
    }

}
