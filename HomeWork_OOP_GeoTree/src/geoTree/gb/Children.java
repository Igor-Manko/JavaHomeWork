package geoTree.gb;

import java.util.Scanner;

public class Children extends Human {
    //Integer age;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Children() {
    }

    public Children(String firstName, String lastName, Integer idPerson) {
        super(firstName, lastName, idPerson);
    }

    public void ageChildren() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите возраст ребенка: ");
        int num = sc.nextInt();
        sc.close();
        this.age = num;
        if (this.age <= 3) {
            System.out.println("Готовимся к саду, кушаем дома");
        } else if (this.age <= 6) {
            System.out.println("Готовимся к школе, ходим в сад");
        } else {
            System.out.println("Учим уроки в школе, получаем знания");
        }
    }


}
