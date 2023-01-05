package geoTree_v2.gb;

public class NewFemale extends Human {
    /**
     * @param gender    1 всегда женщина
     * @param firstName
     * @param lastName
     * @param age
     * @param country
     * @param idPerson
     */
    public NewFemale(int gender, String firstName, String lastName, int age, String country, int idPerson) {
        super(1, firstName, lastName, age, country, idPerson);
    }
}

