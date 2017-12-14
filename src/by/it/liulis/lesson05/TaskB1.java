package by.it.liulis.lesson05;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;
import java.util.List;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        initArray(list);
        System.out.println(list.size());
        showArray(list);
    }

    private static void initArray(List<String> list) {
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
    }

    private static void showArray(List<String> list) {
        for (String str : list) {
            System.out.printf("%s\n", str);
        }
    }

}
