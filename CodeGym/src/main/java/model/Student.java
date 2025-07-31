package model;

public class Student {
    private int id;
    private String name;
    private int age;
    private double score;
    private static int count = 1000;

    public Student(String name, int age, double score) {
        this.id = count++; // 1001
        // gán và tăng giá trị
        // gán trước và tăng sau;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student Id: " + this.id + ", Name: " + this.name;
    }
}
