package geoTree.gb;

import javax.swing.*;
import java.util.Scanner;

public abstract class Human {
    String firstName;
    String lastName;
    int age;
    String country;
    String gender;

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    Integer parent;
    Integer idPerson;
    String appeal;

    public Human() {
    }

    public Human(String firstName, String lastName, Integer idPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.country = "";
        this.gender = "";
        this.parent = null;
        this.idPerson = idPerson;
    }


    private String printString() {
        return appeal(gender) + " Person " + idPerson + " {" +
                "firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", age=" + age +
                        ", country='" + country + '\'' +
                        ", gender='" + gender + '\'' +
                        ", parent=" + parent +
                        ", idPerson=" + idPerson +
                        '}';
    }

        public void greetings (String msg){
            System.out.println(msg);
        }

        public void printInfo () {
            System.out.println(printString());
        }

        public String appeal (String gender){
            this.gender = gender;
            if (gender.equals("Ж")) {
                return "Она";
            } else if (gender.equals("М")) {
                return "Он";
            }
            return null;
        }
    }
