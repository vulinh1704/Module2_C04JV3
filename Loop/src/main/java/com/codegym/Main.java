package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cấu trúc điều kiện: Chuỗi câu lệnh cho phép chương trình quyết định thực hiện đoạn mã nào
//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập tuổi của bạn");
//        int age = inputNumber.nextInt();
//        if (age >= 18) {  // điều kiện Java bắt buộc phải là boolean
//            System.out.println("Bạn đã đủ tuổi");
//        } else {
//            System.out.println("Bạn không có tuổi");
//        }

//        if (age > 0 && age <= 10) {
//            System.out.println("Theếu nhi");
//        } else if (age > 10 && age <= 18) {
//            System.out.println("Thiếu niên");
//        } else if (age > 18 && age < 30) {
//            System.out.println("Thanh niên");
//        }

//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập ngày hôm nay");
//        int day = inputNumber.nextInt();
//        switch (day) { // day == 3
//            case 1:
//                System.out.println("Chủ nhật");
//            case 2:
//                System.out.println("Thứ hai");
//            case 3:
//                System.out.println("Thứ ba");
//                break;
//            default:
//                System.out.println("Không có ngày này");
//        }

        /*
        Cấu trúc lặp : for  do...while  while
         */
//        for (int i = 0; i < 10; i++) { // i = 10 < 10 (false)
//            System.out.println("I = " + i); // i = 0 | i = 1 | ... i = 9 |
//        }

//        int i = 0;
//        while (i < 10) { // i = 1 < 10 (true)
//            System.out.println("I = " + i);
//            i++;
//        }

        // do while (dù điều kiện đúng hay sai chạy ít nhất 1 lần)
//        int i = 0;
//        do {
//            System.out.println("I = " + i); // i = 0 | i = 1
//            i++; // 1 2
//        } while (i < -1); // i = 2 < 10 (true)

        // Cho người dùng nhập 1 số và nếu nhập 0 thì dừng chương trình

        Scanner inputNumber = new Scanner(System.in);
//        do {
//            System.out.println("Vui lòng nhập 1 số");
//            int number = inputNumber.nextInt();
//            System.out.println("Số vừa nhập là: " + number);
//            if (number == 0) break; // dừng vòng lặp
//        } while (true);

//        while (true) {
//            System.out.println("Vui lòng nhập 1 số");
//            int number = inputNumber.nextInt();
//            System.out.println("Số vừa nhập là: " + number);
//            if (number == 0) break;
//        }

//        for (; ; ) {
//            System.out.println("Vui lòng nhập 1 số");
//            int number = inputNumber.nextInt();
//            System.out.println("Số vừa nhập là: " + number);
//            if (number == 0) break;
//        }
    }
}