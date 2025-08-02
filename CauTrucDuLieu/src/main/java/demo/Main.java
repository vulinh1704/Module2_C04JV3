package demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(11, "Linh", 21);
        Student s2 = new Student(12, "Hoàng Bảo Anh", 22);
        Student s3 = new Student(13, "Lộc", 22);
        Student s4 = new Student(14, "Quốc Ảnh", 30);
        Student s5 = new Student(23, "Lâm aaa", 30);

        List<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);

        for (Student s : arr) {
            System.out.println(s);
        }

        int removeIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId() == 11) {
                removeIndex = i;
                break;
            }
        }
        arr.remove(removeIndex);
        System.out.println("Danh sách sau xóa: ");
        for (Student s : arr) {
            System.out.println(s);
        }

        System.out.println("Các sinh viên có tên chữa chứ 'a': ");
        String key = "a";
        key = key.toLowerCase();
        for(Student s: arr) {
            String searchName = s.getName().toLowerCase();
            if(searchName.contains(key)) {
                System.out.println(s);
            }
        }
    }
}
