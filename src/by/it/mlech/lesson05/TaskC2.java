package by.it.mlech.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<20;i++){
            mass[i] = sc.nextInt();
        }
        sort(mass);
   }
    public static void sort(int[] array) {
        for (int i=0; i<array.length;i++){
            int j = array.length-1-i;
            for (int k=0;k<j;k++){
                if (array[k]<=array[k+1]){
                    int t = array[k];
                    array[k] = array[k+1];
                    array[k+1] = t;
                }
            }
        }
        for (int i:array) {
            System.out.println(i);
        }
    }
}
