package generic.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumsTest<Integer, Integer> obj = (n, m) -> (n % m) == 0 || (m % n) == 0;
        System.out.println("Введите 2 числа через пробел для проверки кратности: ");
        if (obj.test(sc.nextInt(), sc.nextInt())) {
            System.out.println("Одно число кратно другому");
        } else {
            System.out.println("Числа не кратны");
        }
    }
}
