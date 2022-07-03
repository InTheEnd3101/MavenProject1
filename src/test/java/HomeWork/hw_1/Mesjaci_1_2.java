package HomeWork.hw_1;

// 2. Написати метод визначення кількості днів у місяці, якщо він заданий номером від 1 до 12.
// Приклад: якщо передаємо в метод число 3 (це березень. в цьому місяці 31 день),
// то виводимо в консоль "В цьому місяці 31 день"  (if, else if, else) цикл for

public class Mesjaci_1_2 {
    public static void main(String[] args) {
        if ("1".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("January");
        } else if ("2".equals(args[0]) || ("28".equals(args[0]))) {
            System.out.println("February");
        } else if ("3".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("March");
        } else if ("4".equals(args[0]) || ("30".equals(args[0]))) {
            System.out.println("April");
        } else if ("5".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("May");
        } else if ("6".equals(args[0]) || ("30".equals(args[0]))) {
            System.out.println("June");
        } else if ("7".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("July");
        } else if ("8".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("August");
        } else if ("9".equals(args[0]) || ("30".equals(args[0]))) {
            System.out.println("September");
        } else if ("10".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("October");
        } else if ("11".equals(args[0]) || ("30".equals(args[0]))) {
            System.out.println("November");
        } else if ("12".equals(args[0]) || ("31".equals(args[0]))) {
            System.out.println("December");
        } else {
            System.out.println("Error");
        }
    }

}
