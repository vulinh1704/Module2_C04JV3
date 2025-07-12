package bai_hoc;

// public là 1 access modifier cho phép sử dụng ở phạm vi toàn bộ chương trình
// private phạm vi truy cập là ở cùng 1 class
// default (khi không có từ khóa nào phía trước) phạm vị thì ở trong cùng 1 package
// protected trong mối quan hệ kế thừa (kể cả khác package)

public class Student { // export class
    public String name;
    public int age;
    private int cccd = 12111;
    double height = 15;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student() {
    }

    Student(String name) {
        this.name = name;
    }

    public void go() {
        System.out.println(this.name + " is going");
        System.out.println(this.cccd);
        show();
    }

    private void show() {
        System.out.println("Hello");
        Student student = new Student();
    }

    String getName() {
        return this.name;
    }
}
