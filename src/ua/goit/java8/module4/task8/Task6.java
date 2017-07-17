package ua.goit.java8.module4.task8;

import java.util.Scanner;

/**
 * Created by Taras on 17.07.2017.
 */
public class Task6 {
    public static void getTask(){
        System.out.println("Завдання №6.");
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
