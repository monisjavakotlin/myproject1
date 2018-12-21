package com.monis;

public class Person {
    String name;
    float weight;
    float height;

    public Person() {
    }

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
//        this.weight = weight;
//        this.height = height;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Hello Java");
    }
}
