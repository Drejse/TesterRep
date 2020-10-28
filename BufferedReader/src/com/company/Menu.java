package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pizza {


    private String name;
    private String lastName;
    private String age;
    private ArrayList<Pizza> pizza = new ArrayList<>();

    public Pizza(String name, String lastName, String age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }






    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }
}
