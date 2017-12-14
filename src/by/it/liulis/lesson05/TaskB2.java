package by.it.liulis.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static int[] array = new int[20];
    public static int[] a = new int[10];
    public static int[] b = new int[10];

    public static void main(String[] args) {
        initArray();
        copy();
        System.out.println("a=" + Arrays.toString(a));
        System.out.println("b=" + Arrays.toString(b));

    }

    private static void initArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private static void copy() {
        for (int i = 0; i < array.length; i++) {
            if (i < 10) {
                a[i] = array[i];
            } else {
                b[i - 10] = array[i];
            }
        }
    }
}
