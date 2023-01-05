package geoTree_v2.gb;

public class NewMale extends Human {

    /**
     * @param gender    0 всегда мужчина
     * @param firstName
     * @param lastName
     * @param age
     * @param country
     * @param idPerson
     */
    public NewMale(int gender, String firstName, String lastName, int age, String country, int idPerson) {
        super(0, firstName, lastName, age, country, idPerson);
    }


}
