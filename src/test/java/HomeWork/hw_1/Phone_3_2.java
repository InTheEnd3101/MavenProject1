package HomeWork.hw_1;

// а) Створіть клас Phone, який містить змінні number, model та weight. вони мають бути приватними та доступ до них організований через геттери і сеттери
// б) Створіть три екземпляри цього класу.
// в) Виведіть в консоль значення їх змінних.
// г) Додати в клас Phone методи: receiveCall, має один параметр - ім'я того, хто дзвонить. Виводить в консоль повідомлення “Телефонує {name}”. getNumber – повертає номер телефону. Викликати ці методи кожного з об'єктів.
// д) Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу – number, model та weight.
// е) Додати конструктор, який приймає на вхід два параметри для ініціалізації змінних класів – number, model.
// ж) Додати конструктор без параметрів.

public class Phone_3_2 {

    private int number;
    private String model;
    private double weight;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public Phone_3_2(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }
    public void getNumber(int number){
        System.out.println("Number " + number);
    }

    public Phone_3_2(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone_3_2() {
    }

}
