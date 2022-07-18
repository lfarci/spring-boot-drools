package com.loganfarci.examples.drools;

public class Person {
    
    private String name;
    private int age;
    private int clearanceNumber;

    public Person() {
        this("Unknown", 18);
    }

    public Person(String name, int age) {
        this(name, age, 0);
    }
    
    public Person(String name, int age, int clearanceNumber) {
        this.name = name;
        this.age = age;
        this.clearanceNumber = clearanceNumber;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getClearanceNumber() {
        return this.clearanceNumber;
    }

    public void setClearanceNumber(int value) {
        this.clearanceNumber = value;
    }
}
