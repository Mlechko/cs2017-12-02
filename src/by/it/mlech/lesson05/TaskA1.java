package by.it.mlech.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0
9
8
7
6
5
4
3
2
1

*/


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Scanner scn = new Scanner(System.in);
        for (int i = mass.length-1; i>=0; i--){
            mass[i] = scn.nextInt();
        }
        int i = mass.length-1;
        while (i>=0){
            System.out.println(mass[mass.length-1-i--]);
        }
        //System.out.println(Arrays.toString(mass));

    }

}
