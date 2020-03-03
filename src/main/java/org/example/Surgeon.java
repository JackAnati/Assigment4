package org.example;

public class Surgeon extends Doctor implements Radiologists {

    public Surgeon(String Lname, String Fname, int age) {
        super(Lname, Fname, age);
    }

    public void xRay(){
        System.out.println("SuccessFul");
    }

}
