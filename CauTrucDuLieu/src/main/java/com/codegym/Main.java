package com.codegym;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        dũ liệu: [2,4,6,7,3,3] input
        Yêu cầu: chỉ chứa các phần tử chẵn?

        B1: Khởi tạo mảng để chữa các phần tử chẵn
        B2: chạy vòng lặp
        B3: Kiểm tra từng tử chia hết 2 hay không nếu có thêm vào mảng ở b1
        B4: In mảng mới
        => Các bước này là giải thuật
        Thông tin: [2,4] output
        tương ứng với từng loại dữ liệu khác nhau => giải thuật khác nhau
         */

        List<Integer> arr = new ArrayList<>();
        arr.add(1); // thêm
        arr.add(2);
//        System.out.println(arr.get(0)); // Lấy ra phần tử có vị trí tương ứng
//        System.out.println(arr.size()); // lấy ra số lượng phần tử
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i)); // a[i]
//        }
        arr.set(1, 22); // sửa
        arr.remove(1); // xóa
        for(Integer e: arr) {
            System.out.println(e); // in ra phần tử
        }

        // Tạo 1 class Student (id,tên,tuổi) / get - set đầy đủ
        // Main => tạo 1 arrays list chứa 5 đối tượng student
        // In ra thông tin các sinh viên có trong mảng
        // Xóa sinh viên ở có tên là 11;
        // In ra các sinh viên tên chứa chứ "a"
    }
}