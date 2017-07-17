package ua.goit.java8.module4.task8;

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
public class Main {
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
                    Task1 task1 = new Task1();
                    task1.getTask();
                    break;
                case "2":
                    Task2 task2 = new Task2();
                    task2.getTask();
                    break;
                case "3":
                    Task3 task3 = new Task3();
                    task3.getTask();
                    break;
                case "4":
                    Task4 task4 = new Task4();
                    task4.getTask();
                    break;
                case "5":
                    Task5 task5 = new Task5();
                    task5.getTask();
                    break;
                case "6":
                    Task6 task6 = new Task6();
                    task6.getTask();
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

}
