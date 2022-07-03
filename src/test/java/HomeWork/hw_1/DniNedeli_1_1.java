package HomeWork.hw_1;

public class DniNedeli_1_1 {

//if-else конструкція
//1. Написати метод який буде виводити назву тижня в залежності від введеного числа.
//Відповідно 1 - Понеділок, 2 - Вівторок, 3 - Середа, 4 - Четвер, 5 - П'ятниця,
//6,7 - Вихідний. і опрацювати варіант, коли число не відповідає дню неділі.

    public static void main(String[] args) {
        if ("1".equals(args[0])) {
            System.out.println("Monday");
        } else if ("2".equals(args[0])) {
            System.out.println("Tuesday");
        } else if ("3".equals(args[0])) {
            System.out.println("Saturday");
        } else if ("4".equals(args[0])) {
            System.out.println("Wednesday");
        } else if ("5".equals(args[0])) {
            System.out.println("Friday");
        } else if ("6".equals(args[0]) || ("7".equals(args[0]))) {
            System.out.println("Weekend");
        } else {
            System.out.println("Error");
        }
    }

}
