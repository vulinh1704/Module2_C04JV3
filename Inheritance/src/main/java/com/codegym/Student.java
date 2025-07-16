package com.codegym;
//
//public class Student extends Person { // mối quan hệ kế thừa thông qua từ khóa extends
//    // Có thể thêm thuộc tính và phương thức mới ở lớp con
//    private double score;
//    private int age;
//
//    // Lớp con luôn luôn phải có 1 constructor gọi đến constructor của cha
//    public Student(String name, double score, int age) {
//        super(name); // gọi đến constructor có tham số tương ứng của lớp cha
//        // tương tự this(): gọi đến constructor có tham số tương ứng ở chính lớp này
//        // Có thể k có this() hoặc super(), nếu có thì chỉ sử dụng 1 trong 2
//        this.score = score;
//        this.age = age;
//    }
//
//    public Student(String name) {
//        // this.name = name;
//        // Đại diện cho đối tượng đang sử dụng, chỉ đến các thành phần ở chính lớp này
//    }
//
//    public void studying() {
//        System.out.println(super.getName() + " is studying");
//        /*
//        super trong phương thức thì tương tự từ khóa this
//        (đại diện đối tượng đang sử dụng) nhưng sẽ truy cập
//        đến thành phần của lớp cha.
//         */
//    }
//

/// /    public String getName() {
/// /        return this.name;
/// /    }
//}

// Không cho phép đa kế thừa.

/*
Ghi đè (Override): Xảy ra mối quan hệ kế thừa, là các phương thức cùng tên,
cùng tham số, cùng kiểu dữ liệu trả về, khác logic xử lý bên trong
=> Dùng để phát triển tính năng
 */
public class Student extends Person {
    public void sing(String songName) {
        System.out.println("Học sinh hát " + songName);
    }
}


