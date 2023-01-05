package geoTree_v2.gb;

public class Human implements GeoTree {

    String firstName;
    String lastName;
    int age;
    String country;
    private int gender;
    int idPerson;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.print("Раньше firstName было: " + getFirstName() +" -->> ");
        this.firstName = firstName;
        System.out.println("Заменили на: " + firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private int getGender() {
        return gender;
    }

    private void setGender(int gender) {
        this.gender = gender;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

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
    public void printInfoUserGeoTree() {
        System.out.println(MyPrint());
    }

    public String genderStatus() {
        if (this.gender == 0) {
            return "Мужчина";
        } else if (this.gender == 1) {
            return "Женщина";
        }
        return "Ошибка";
    }
}
