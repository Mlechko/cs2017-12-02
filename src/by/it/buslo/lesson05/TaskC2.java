package by.it.buslo.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int i, j, k;
        for (int t = 0; t < array.length; t++) {
            for (i = 0; i < array.length; i++) {
                k = i;
                for (j = i + 1; j < array.length; j++) {
                    if (array[k] < array[j]) {
                        int temp;
                        temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                    }
                }
            }

        }
        for (i = 0; i < 20; i++) {
            System.out.println(array[i]);
        }
    }
}  //public static void sort(int[] array) {
//Напишите тут ваш код





