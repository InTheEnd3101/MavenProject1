package HomeWork.hw_1;

// Робота зі строками
// 1. вивести строку без голосних
// 2. Вивести строку без приголосних
// 3. Вивести речення без пробілів

public class WorkWithStr_2_0 {

    public static void main(String[] args) {
        String test = "Facking World";
        System.out.println(test.replaceAll("[aio]",""));
        System.out.println(test.replaceAll("[FckngWrld]",""));
        System.out.println(test.replaceAll("[ ]",""));
    }
}
