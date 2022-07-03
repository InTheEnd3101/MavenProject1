package HomeWork.hw_1;

// а) Створіть клас Phone, який містить змінні number, model та weight. вони мають бути приватними та доступ до них організований через геттери і сеттери
// б) Створіть три екземпляри цього класу.
// в) Виведіть в консоль значення їх змінних.
// г) Додати в клас Phone методи: receiveCall, має один параметр - ім'я того, хто дзвонить. Виводить в консоль повідомлення “Телефонує {name}”. getNumber – повертає номер телефону. Викликати ці методи кожного з об'єктів.
// д) Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу – number, model та weight.
// е) Додати конструктор, який приймає на вхід два параметри для ініціалізації змінних класів – number, model.
// ж) Додати конструктор без параметрів.

public class TestPhone_3_2 {
    public static void main(String[] args) {
        Phone_3_2 p1 = new Phone_3_2(932837261, "Sumsung", 101.5);
        Phone_3_2 p2 = new Phone_3_2(931746148, "Redmi", 102.5);
        Phone_3_2 p3 = new Phone_3_2(345656565, "LG", 103.5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.receiveCall("Petja");
        p1.getNumber(72487606);
        p2.receiveCall("Grisha");
        p2.getNumber(15677750);
        p3.receiveCall("Dashka");
        p3.getNumber(37462850);
    }
}
