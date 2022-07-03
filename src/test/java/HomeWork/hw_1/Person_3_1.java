package HomeWork.hw_1;

// Клас Person
// a) поля fullName, age.
// б) методи move() і talk(), у яких просто виводить в консоль повідомлення -"Person рухається" i "Person говорить".
// в) Додайте два конструктори - Person() та Person(fullName, age).
// Створіть два об'єкти цього класу. Один об'єкт ініціалізується конструктором Person(), інший – Person (fullName, age).

public class Person_3_1 {
    String name = "Vitalino";
    int age = 33;

    public void move() {
        System.out.println("Person move");
    }

    public void talk(){
        System.out.println("Person talk");
    }

    public Person_3_1() {
    }

    public Person_3_1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person_3_1 person1 = new Person_3_1();
        Person_3_1 person2 = new Person_3_1("Vitalino", 38);
        person1.move();
        person2.talk();
    }

}
