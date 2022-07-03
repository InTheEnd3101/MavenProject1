package HomeWork.hw_1;

// 3.  Написати метод, що буде виводити в консоль, числа (в проміжу від 1 до 100) кратні


import org.testng.annotations.Test;

public class Metod_1_3 {

@Test
    public void cyclesInt() {
        for (int i = 1; i++ < 100; i++) {
            System.out.println(i);
        }
    }
}

