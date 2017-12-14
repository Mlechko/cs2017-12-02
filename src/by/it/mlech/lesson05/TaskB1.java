package by.it.mlech.lesson05;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> spisok = new ArrayList<>();
        Collections.addAll(spisok, "a", "b", "c", "d", "e");
        System.out.println(spisok.size());
        for (String el:spisok){
            System.out.println(el);
        }
    }
}
