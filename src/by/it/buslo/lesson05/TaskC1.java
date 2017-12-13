package by.it.buslo.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception
    {
            Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list_3 = new ArrayList<Integer>();
        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        ArrayList<Integer> list_All = new ArrayList<Integer>();
        for(int i=0; i<20; i++){
            list.add(sc.nextInt());
        }
        for (Integer aList : list) {
            int a = aList;

            if (a % 3 == 0 && a % 2 == 0) {
                list_3.add(a);
                list_2.add(a);
            } else if (a % 3 == 0) {
                list_3.add(a);
            } else if (a % 2 == 0) {
                list_2.add(a);
            } else {
                list_All.add(a);
            }
        }
        printList(list_3);
        printList(list_2);
        printList(list_All);
    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
