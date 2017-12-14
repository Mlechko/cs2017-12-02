package by.it.hotenko.lesson05;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> slist = new ArrayList<>();
        slist.add(" a");
        slist.add(" b");
        slist.add(" c");
        slist.add(" d");
        slist.add(" e");
        System.out.println(slist.size());
        for (int i=0; i<slist.size();i++){
            System.out.println(slist.get(i));
        }
    }
}
