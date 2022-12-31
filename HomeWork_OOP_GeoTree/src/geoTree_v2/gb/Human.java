package geoTree_v2.gb;

public class Human implements GeoTree {

    String firstName;
    String lastName;
    int age;
    String country;
    int gender;
    int idPerson;

    /**
     * @param gender    0 - мужчина, 1 - женщина
     * @param firstName
     * @param lastName
     * @param age
     * @param country
     * @param idPerson
     */

    public Human(int gender, String firstName, String lastName, int age, String country, int idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.gender = gender;
       this.idPerson = idPerson;

    }


    public String MyPrint() {

        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender=" + genderStatus() +
                ", idPerson=" + idPerson +
                '}';
    }

    @Override
    public void printUserGeoTree() {
        System.out.println(MyPrint());
    }

    @Override
    public String genderStatus() {
        if (this.gender == 0) {
            return "Мужчина";
        } else if (this.gender == 1) {
            return "Женщина";
        }
        return "Ошибка";
    }

}
