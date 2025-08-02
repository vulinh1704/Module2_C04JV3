package bai_hoc;

public class MyData {
    // Assess Modifier
    private String name; // chỉ có thể sử dụng trong cùng class
    String age; // cho phép truy cập package
    protected String firstName; // Cho phép trong package và ngoài package nhưng phải trong quan hệ kế thừa
    public String lastName; // Truy cập toàn dự án

    private void go() {
    }
}
