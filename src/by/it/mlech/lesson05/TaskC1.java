package by.it.mlech.lesson05;
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
        ArrayList<Integer> sp_all = new ArrayList<Integer>();
        ArrayList<Integer> sp_3 = new ArrayList<Integer>();
        ArrayList<Integer> sp_2 = new ArrayList<Integer>();
        ArrayList<Integer> sp_other = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        for (int i=1; i<=20;i++){
            sp_all.add(scn.nextInt());
        }
        for (int i:sp_all){
            if (i%3 == 0) sp_3.add(i);
            if (i%2 == 0) sp_2.add(i);
            if (i%2!=0 && i%3!=0) sp_other.add(i);
        }
        printList(sp_3);
        printList(sp_2);
        printList(sp_other);





    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
