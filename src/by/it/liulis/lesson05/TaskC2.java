package by.it.liulis.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int[] x = new int[20];
        initialArray(x);
        sort(x);
        showArray(x);
    }

    private static int[] initialArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\n", array[i]);
        }
    }

    public static void sort(int[] arr) {
        //Напишите тут ваш код
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1] < arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
