package org.example;

public class Main {
    public static void main(String[] args) {

        // ABORDARE PROCEDURALA:
        Employee e1 = new Employee();
        e1.name = "John";
        e1.dob = "13/5/1984";
        e1.senior = true;

        Employee e2 = new Employee();
        e2.name = "Eva";
        e2.dob = "25/12/1992";
        e2.id = 1;


        // Valorile default pentru atributele obiectului:
        System.out.println("ID: " + e1.id); // pentru primtive avem default 0;
        System.out.println("Name: " + e1.name); // Valoarea deafault este null pentru ca Stringul este Object
        System.out.println("Date of birth: " + e1.dob); // Valoarea deafault este null pentru ca Stringul este Object
        System.out.println("Is senior: " + e1.senior); // default pentru boolean este false

        System.out.println("------------");

        System.out.println("ID: " + e2.id);
        System.out.println("Name: " + e2.name);
        System.out.println("Date of birth: " + e2.dob);
        System.out.println("Is senior: " + e2.senior);
    }
}