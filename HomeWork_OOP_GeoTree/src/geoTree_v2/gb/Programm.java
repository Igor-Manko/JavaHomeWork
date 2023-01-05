package geoTree_v2.gb;

public class Programm {
    public static void main(String[] args) {
        NewMale petrov = new NewMale(2, "kkk", "petrov", 80, "hhh", 1);
        //System.out.println(petrov);
        petrov.printInfoUserGeoTree();

        NewFemale kovaleva = new NewFemale(0, "ooo", "kovaleva", 15, "ppp", 2);
        kovaleva.printInfoUserGeoTree();

        kovaleva.setFirstName("AAAAAA");
        kovaleva.printInfoUserGeoTree();

        System.out.println(kovaleva.genderStatus());
        kovaleva.printInfoUserGeoTree();




    }
}
