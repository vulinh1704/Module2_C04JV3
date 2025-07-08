package com.codegym;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static int getValue() {
        return 1;
    }

    public static void showName(String name) {
        System.out.println("Name is " + name);
        // return; // Optional
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println(value);
        String name = "Linh";
        showName(name);

        /*
        // <data_type>[] = {a, b , c}
        int[] arr = {1, 2, 4, 5};
        // index     0  1  2  3
        System.out.println(arr[2]); // truy xuất giá trị trong mảng
        arr[2] = 10; // Thay đổi giá trị tại 1 vị trí bất kỳ
        System.out.println(arr[2]);
        double[] arr02 = new double[3];
        // Khởi tạo như này thì mảng sẽ có giá trị theo kiểu dữ liệu tương ứng:
        // int -> 0, double -> 0.0, boolean -> false, String -> null
        System.out.println("Mảng với các giá trị mặc định");
        System.out.println(Arrays.toString(arr02));
        String[] arr03 = new String[5];
        System.out.println(Arrays.toString(arr03));
         */

        // duyệt mảng (2 cách)
//        int[] arr = {1, 2, 4, 5};
//        for (int item : arr) {
//            System.out.println(item); // 1 2 4 5
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Phần tử thứ " + i + " là : " + arr[i]);
//        }
    }
}