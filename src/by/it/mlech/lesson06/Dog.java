/*
Геттеры и сеттеры для класса Dog

Создайте class Dog.
У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.

        Требования:
        1. Программа не должна считывать данные с клавиатуры.
        2. У класса Dog должна быть переменная name с типом String.
        3. У класса Dog должна быть переменная age с типом int.
        4. У класса должен сеттер для переменной name.
        5. У класса должен геттер для переменной name.
        6. У класса должен сеттер для переменной age.
        7. У класса должен геттер для переменной age.
        8. Создайте внутри метода main (класса TaskA1) две разных собаки (т.е. два объекта типа Dog)
        9. Заполните поля собак используя сеттеры.
            Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
        10. Напечатайте этих двух собак, выводите собак в формате
            Кличка Возраст
            через пробел. При выводе обяхательно иcпользуйте геттеры.

Ожидается вывод:
Шарик 5
Тузик 3
*/
/*
    toString() для класса Dog

    Доработайте class Dog из задания A1. Создайте в классе Dog метод
    public String toString(){
        //метод должен вернуть строку экземляра класса в виде форматированной строки
        //Пример:
        Кличка: Шарик. Возраст: 5
    }

    Требования:
    1. Программа не должна считывать данные с клавиатуры.
    2. Создайте внутри метода main (класса TaskA2) две разных собаки (т.е. два объекта типа Dog)
    3. Заполните поля собак используя сеттеры.
    4. Первая - Шарик, 5 лет. Вторая - Тузик, 3 года.
    5. Напечатайте этих двух собак, выводите собак как объект без геттеров.

Обратите внимание на точки и пробелы.
Ожидается вывод:
Кличка: Шарик. Возраст: 5
Кличка: Тузик. Возраст: 3


*/

/*
Доработайте класс Dog.

1) Добавьте два новых поля с геттерами и сеттерми (!!!!)
private int weight; //вес собаки
private double power; //сила укуса собаки

2) Напишите экземплярный метод в классе Dog
boolean win(Dog otherDog)
    {... тело метода...}
который рассчитывает, кто из двух собак победит эта (this) или та (otherDog).

Расчет должен быть таким.
    Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.

Побеждает та собака, у которой больше шансов на победу.
Если победила эта (this), то метод win возвращает true, иначе false

3) Проверка.
В классе TaskC1 с клавиатуры через Scanner водятся две собаки в формате
кличка возраст вес сила
кличка возраст вес сила
(всего получается 8 чтений разных данных)

Создайте этих собак, определите победителя с помощью созданного
в классе Dog метода boolean win(Dog dog).
Напечатайте кличку победителя.
*/
package by.it.mlech.lesson06;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return String.format("Кличка: %s. Возраст: %d", name, age);
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    private int weight;
    private double power;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public double getPower() {
        return power;
    }
    public boolean win(Dog otherDog){
        double shans_this = 0.2 * age + 0.3 * weight + 0.5 * power;
        double shans_other = 0.2 * otherDog.age + 0.3 * otherDog.weight + 0.5 * otherDog.power;
        return shans_this>shans_other;
    }

    public Dog(String name, int age, int weight, double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }
}
