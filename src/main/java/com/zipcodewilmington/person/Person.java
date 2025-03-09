package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    // variables initialized
    private String name = "";
    private int age = Integer.MAX_VALUE;

    //Constructor Person name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Constructor Person with just age
    public Person(int age) {
        this.age = age;
    }

    //Constructor Person with just name
    public Person(String name) {
        this.name = name;
    }

    //default constructor
    public Person() {

    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    //Getter for name
    public String getName() {
        return name;
    }

    //Getter for age
    public Integer getAge() {
        return age;
    }
}
