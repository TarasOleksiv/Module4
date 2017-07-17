package ua.goit.java8.module4.task7;

import java.util.Scanner;

/**
 * Created by t.oleksiv on 17/07/2017.
 *
 * Задание 7 (дополнительно)

 Написать программу, в которой выполнены все шесть предыдущих заданий.
 Каждое задание выполняется в отдельной функции.
 В пределах этой же функции происходит ввод с консоли необходимых данных.
 Программа спрашивает пользователя какую задачу он хочет решить (от 1 до 6).
 Затем программа вызывает соответствующую функцию для решения этой задачи.
 По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи.
 Если да - опять спрашивает какую задачу.
 *
 */
public class Task7 {
    public static void main(String[] args) {
        getChoice();

    }

    // Метод для вибору номеру завдання
    public static void getChoice(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Яке завдання ви б хотіли розв'язати? Введіть номер завдання (від 1 до 6): ");
            String n = sc.nextLine().trim();
            switch (n) {
                case "1":
                    getTask1();
                    break;
                case "2":
                    getTask2();
                    break;
                case "3":
                    getTask3();
                    break;
                case "4":
                    getTask4();
                    break;
                case "5":
                    getTask5();
                    break;
                case "6":
                    getTask6();
                    break;
                default:
                    System.out.println("Ви не обрали жодне з доступних завдань 1-6.");
                    break;
            }
        } while (tobeContinued());

    }

    // Метод для перевірки чи продовжуєм виконання завдання
    public static boolean tobeContinued(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Чи хотіли б ви продовжити виконувати завдання? (1 - так, будь-який інший символ - ні): ");
        String n = sc.nextLine().trim();
        boolean result = (n.equals("1")) ? true : false;
        if (!result) {
            System.out.println("Ви завершили виконання завдання №7");
        }
        return result;
    }


    // Блок №1.
    // Для 6-и завдань.
    // Кожний метод запускає виконання конкретного завдання і пропонує користувачу ввести дані

    public static void getTask1(){
        System.out.println("Завдання №1.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        int x = sc.nextInt();
        sc.nextLine();
        printNumbers(x);
    }

    public static void getTask2(){
        System.out.println("Завдання №2.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ширину прямокутника: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Введіть висоту прямокутника: ");
        int m = sc.nextInt();
        sc.nextLine();
        drawRectangle(n,m);
    }

    public static void getTask3(){
        System.out.println("Завдання №3.");
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

    public static void getTask4(){
        System.out.println("Завдання №4.");
        Scanner sc = new Scanner(System.in);

        System.out.print("З якими числами працюєм? (1 - цілі числа; будь-який інший символ - дробові). Введіть символ: ");
        String c = sc.nextLine().trim();

        if (c.equals("1")) {
            System.out.print("Введіть перше ціле число: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.print("Введіть друге ціле число: ");
            int m = sc.nextInt();
            sc.nextLine();
            System.out.println("Більшим із введених чисел " + n + " та " + m + " є число " + getMax(n,m));
        } else {
            System.out.print("Введіть перше дробове число: ");
            float n1 = sc.nextFloat();
            sc.nextLine();
            System.out.print("Введіть друге дробове число: ");
            float m1 = sc.nextFloat();
            sc.nextLine();
            System.out.println("Більшим із введених чисел " + n1 + " та " + m1 + " є число " + getMax(n1,m1));
        }
    }

    public static void getTask5(){
        System.out.println("Завдання №5.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле додатнє число: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println(printNumbersRecursion(x));
    }

    public static void getTask6(){
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

    // Кінець Блоку №1.


    // Блок №2.
    // Містиь допоміжні функції, які викликаються методами з блоку №1.

    public static void printNumbers(int x){
        for (int i = 1; i<=x; i++){
            System.out.print(i + " ");
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

    public static int getMax(int n, int m){
        return (n <= m) ? m : n;
    }

    public static float getMax(float n, float m){
        return (n <= m) ? m : n;
    }

    public static String printNumbersRecursion(int x){
        if (x == 1) {
            return "1";
        }
        return printNumbersRecursion(x-1) + " " + x;
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

    // Кінець блоку №2.
}
