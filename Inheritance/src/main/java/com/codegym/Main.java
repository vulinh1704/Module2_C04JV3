package com.codegym;

public class Main {
    public static void main(String[] args) {
        /*
        Student student = new Student("Linh", 2.1, 18);
        System.out.println(student.getName());
        student.studying();
        /* đối tượng sinh ra có thể sử dụng thuộc tính
        hoặc phương thức của lớp cha trong phạm vi cho phép
       (Access Modifier)
         */

//        Calculator c = new Calculator();
//        int r1 = c.getTotal(); // gọi đến hàm có tham số tương ứng
//        double r3 = c.getTotal(4.1, 4.3, 5.9);

//        Person p = new Person();
//        p.sing("Trình");
//        Student s = new Student();
//        s.sing("Trình");

             Person p = new Student();
        // Kiểu khai báo     Kiểu thực tế
        // Hàm được gọi ra luôn ưu tiên kiểu thực tế
        p.sing("Trình là gì?");

//        Student s = new Student();
//        Person p1 = (Person) s;
    }
}

// Cha con tuân thủ mô hình is - a
// Student is a Person

// Đa hình: Cơ chế cho phép 1 đối tượng thực hiện 1 công việc theo nhiều cách khác nhau
// Ghi đè và nạp chồng phương thức