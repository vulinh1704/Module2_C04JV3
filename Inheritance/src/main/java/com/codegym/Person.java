package com.codegym;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sing(String songName) {
        System.out.println("Người hát " + songName);
    }
}
