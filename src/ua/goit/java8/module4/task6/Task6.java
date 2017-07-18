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
        drawRectangle(n,m);
        // Спосіб №2.
        // Викликає рекурсивний метод з вкладеним всередину рекурсивним методом.
        //System.out.println(drawColumn(m,n));
    }

    public static int i = 0;    // лічильник руху по горизонталі

    public static void drawRectangle(int x, int y){     // х - по горизонталі, y - по вертикалі
        if ((x == 0) && (y == 1)) return;       //
        if (x != 0){    // рухаємось по рядку поки не добігаєм його кінця
            i++;    // збільшуєм лічильник пройдених символів у рядку (в кінці зрівнюється з шириною рядка)
            System.out.print("x ");
            drawRectangle(x-1, y);      // пересуваємось на 1 позицію в рядку
        } else {    // інакше (при досягненні кінця рядка) перескакуєм на наступний рядок
            System.out.println();   // перескакуєм на наступний рядок
            x = i;      // зберігаєм ширину рядка для майбутнього проходження
            i = 0;      // обнуляємо лічильник пройдених символів у рядку
            drawRectangle(x, y-1);      // зменшуєм кількість рядків на 1
        }
    }


    /**
     * Спосіб №2.
     * один рекурсивний метод викликає другий рекурсивний метод
     *
     *public static String drawLine(int x){
     *    if (x == 1) {
     *        return "x ";
     *    }
     *    return drawLine(x-1) + "x ";
     *}

     *public static String drawColumn(int x, int y){
     *    if (x == 1) {
     *        return drawLine(y) + "\n";
     *    }
     *    return drawColumn(x-1,y) + drawLine(y) + "\n";
     *}
     */

}
