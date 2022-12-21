package geoTree.gb;

public class Female extends Human {

    public Female(String firstName, String lastName, Integer idPerson) {
        super(firstName, lastName, idPerson);
    }

    @Override
    public void greetings(String msg) {
        if (msg.equals("7 часов")) {
            System.out.println("Пора на работу");
        }
    }
}
