package com.lab12.app;

import java.util.Scanner;

public class Tester {
    public String name;
    public String surname;
    public int experienceInYear;
    public String englishLevel;
    public float salary;
    public Tester (String name, String surname, int exp, String eng, float sal){
        this.name = name;
        this.surname = surname;
        this.experienceInYear = exp;
        this.englishLevel = eng;
        this.salary = sal;
    }
    public Tester (String name, String surname, int exp, String eng){
        this(name, surname, exp, eng, 14.0F);
    }
    public Tester (String name, String surname, int exp){
        this(name, surname, exp, "Int");
    }
    public void checkSalary(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full hours of work");
        String fullHours = scan.next();
        String[] constnt = setFullWorkingHours(fullHours);
        int hours = Integer.parseInt(constnt[1]);
        System.out.println(String.format("Worker %s has salary %f", constnt[0], hours * this.salary));
    }
    public static String setName(String name, String surname){
        String fullName = name + " " + surname;
        return fullName;
    }
    public String[] setFullWorkingHours(String fullHours){
        String name = setName(this.name, this.surname);
        String[] info = new String[]{name, fullHours};
        return info;
    }
    public void printOnlyName(String name){
        System.out.println("Name: " + name);
    }

    public void printOnlyName(String name, String surname){
        System.out.println("Name: " + name + surname);
    }

    public void printOnlyName(String name, String surname, float salary)
    {
        System.out.println("Name: " + name + " " + surname + " " + salary);
    }
    public void printOnlyName(int name){

    }
}
