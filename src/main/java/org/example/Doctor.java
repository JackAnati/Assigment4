package org.example;

public class Doctor {

    private String Fname;
    private String Lname;
    private int age;

    public Doctor(String Lname, String Fname, int age){

        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public int getAge() {
        return age;
    }

    public void xRay(){
        System.out.println("Show the results....");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", age=" + age +
                '}';
    }
}
