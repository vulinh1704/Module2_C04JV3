package com.codegym;

import java.util.Arrays;

public class Master {

    // Thực hiện viết các hàm để thêm, sửa, xóa, chèn phần tử vào 1 mảng cho trước;
    // Làm menu bằng terminal cho người dùng thao tác
    public static void main(String[] args) {
        int length = 10;
        int size = 0; // Số lượng phần tử thực sự có trong mảng
        int[] myArr = new int[length];
        size = addElement(myArr, size, 50);
        size = addElement(myArr, size, -20);
        size = addElement(myArr, size, 21);
        size = addElement(myArr, size, 3);
        size = addElement(myArr, size, 5);
        editElement(myArr, size, 9, -43);
        editElement(myArr, size, 1, -43);
        show(myArr, size);
        size = removeElement(myArr, size, 0);
        show(myArr, size);
        size = insertElement(myArr, size, 1, 30);
        show(myArr, size);
    }

    public static int insertElement(int[] arr, int size, int insertIndex, int insertElement) {
        if (insertIndex >= size || insertIndex < 0) {
            System.out.println("Vi tri khong chinh xac");
            return size;
        }
        for (int i = size; i > insertIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insertIndex] = insertElement;
        size++;
        return size;
    }

    public static int removeElement(int[] arr, int size, int deleteIndex) {
        if (deleteIndex >= size || deleteIndex < 0) {
            System.out.println("Vi tri khong chinh xac");
            return size;
        }
        // remove
        for (int i = deleteIndex; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return size;
    }

    public static void editElement(int[] arr, int size, int editIndex, int newElement) {
        if (editIndex >= size || editIndex < 0) {
            System.out.println("Vi tri khong chinh xac");
            return;
        }
        arr[editIndex] = newElement;
    }

    public static int addElement(int[] arr, int size, int newElement) {
        arr[size] = newElement; // arr[0] = 1
        size++;
        return size;
    }

    public static void show(int[] arr, int size) {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        System.out.println("");
    }
}
