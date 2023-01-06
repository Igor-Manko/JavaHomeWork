package generic.task_1;

import java.util.Scanner;

public class Nums<T, E> {
    T objOne;
    E objTwo;

    Nums(T objOne, E objTwo) {
        this.objOne = objOne;
        this.objTwo = objTwo;
    }

    void check() {
        if (!(objOne instanceof String) && (!(objTwo instanceof String))) {
            System.out.println("Вы ввели числа");
        } else {
            System.out.println("Тут что-то не число");
        }
    }
}
