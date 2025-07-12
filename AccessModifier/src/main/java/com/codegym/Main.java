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

        Teacher teacher = new Teacher(1, "Linh");
        teacher.setName("Phú");
        System.out.println(teacher.getName());

        Teacher teacher1 = new Teacher(2, "Hải");
        System.out.println(teacher1.getName());

        System.out.println(Teacher.nameSchool);
        Teacher.goToWork();
    }
}