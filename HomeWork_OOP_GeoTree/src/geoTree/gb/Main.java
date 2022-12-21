package geoTree.gb;

public class Main {
    public static void main(String[] args) {
        Male ivanov = new Male("Petr", "Ivanov", 1);
        ivanov.gender = "М";
        ivanov.age = 35;
        ivanov.printInfo();

        Female petrova = new Female("Masha", "Petrova", 2);
        petrova.gender = "Ж";
        petrova.printInfo();
        petrova.greetings("7 часов");

        Children denisov = new Children("Sasha", "Petrov", 3);
        denisov.ageChildren();
        denisov.gender = "М";
        denisov.printInfo();
    }
}
