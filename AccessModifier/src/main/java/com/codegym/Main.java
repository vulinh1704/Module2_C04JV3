package com.codegym;

import bai_hoc.Student;
import bai_hoc.Teacher;
import com.service.Person;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Date date = new Date();
//        Person person = new Person();
//        com.data.Person p1 = new com.data.Person();
//        model.Person p2 = new model.Person();

//        Student student = new Student("Ning", 21);
//        String s3 = new Student("Lộc"); // error
//        System.out.println(student.name);
//        System.out.println(student.age);
//        student.go();
//
//        Teacher teacher = new Teacher(1, "Linh");
//        teacher.setName("Phú");
//        System.out.println(teacher.getName());
//
//        Teacher teacher1 = new Teacher(2, "Hải");
//        System.out.println(teacher1.getName());
//
//        System.out.println(Teacher.nameSchool);
//        Teacher.goToWork();


        // Chữa bài
        Circle circle = new Circle(4.1);
        System.out.println("Id circle 1: " + circle.getId());
        System.out.println("C1 = " + circle.getC());
        System.out.println("S1 = " + circle.getS());
        System.out.println("Max radius " + Circle.maxRadius);

        Circle circle02 = new Circle(4.2);
        System.out.println("Id circle 2: " + circle02.getId());
        Circle circle03 = new Circle(3.3);
        System.out.println("Id circle 3: " + circle03.getId());
        System.out.println("Max radius " + Circle.maxRadius);
        System.out.println("Total S = " + Circle.totalS);





    }
}