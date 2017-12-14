package by.it.lyaleko.lesson05;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/



import java.util.Scanner;
import java.util.ArrayList;
public class TaskB1 {

    public static class Solution{

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);


            ArrayList<String> list = new ArrayList<String>();

            list.add("Поздравляем");
            list.add("Всех");
            list.add("С");
            list.add("Новым");
            list.add("Годом!");


            System.out.println(list.size());

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

            }
    }
}
