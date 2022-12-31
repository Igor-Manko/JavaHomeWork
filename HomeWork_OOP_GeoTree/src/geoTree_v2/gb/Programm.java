package geoTree_v2.gb;

public class Programm {
    public static void main(String[] args) {
        Human petrov = new Human(0, "kkk", "iii", 80, "hhh", 1);
        //System.out.println(petrov);
        petrov.printUserGeoTree();

        Human kovaleva = new Human(1, "ooo", "lll", 15, "ppp", 2);
        kovaleva.printUserGeoTree();
        System.out.println(kovaleva.genderStatus());

    }
}
