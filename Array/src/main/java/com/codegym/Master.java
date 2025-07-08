package com.codegym;

import java.util.Arrays;

public class Master {

    // Thực hiện viết các hàm để thêm, sửa, xóa, chèn phần tử vào 1 mảng cho trước;
    // Làm menu bằng terminal cho người dùng thao tác
    public static void main(String[] args) {
        int length = 10;
        int size = 0; // Số lượng phần tử thực sự có trong mảng
        int[] myArr = new int[length]; // [4, 3, 50, 0 , 0 , 0]
        System.out.println("Mảng trước khi thêm");
        System.out.println(Arrays.toString(myArr));
        size = addElement(myArr, size, 50); // size = 1
        System.out.println("Mảng sau khi thêm");
        System.out.println(Arrays.toString(myArr));

        //----------------------
        size = addElement(myArr, size, -20); // size = 1
        System.out.println("Mảng sau khi thêm");
        System.out.println(Arrays.toString(myArr));
    }

    public static int addElement(int[] arr, int size, int newElement) {
        arr[size] = newElement; // arr[1]
        size++;
        return size;
    }
}
