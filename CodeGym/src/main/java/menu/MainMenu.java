package menu;

import management.StudentManager;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private StudentManager studentManager;
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public MainMenu() {
        this.studentManager = new StudentManager();
    }

    public void handleMainMenu() {
        int choice;
        do {
            showMainMenu();
            choice = this.inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showFormAdd();
                    break;
                case 2:
                    showDeleteForm();
                    break;
                case 3:
                    showFormEdit();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    showMenuSearchContainsName();
                    break;
                default:
                    System.out.println("Ko có lựa chọn này!");
            }
        } while (choice != 0);
    }

    public void showDeleteForm() {
        System.out.println("-------------- Xóa thông tin sinh viên --------------");
        System.out.println("Nhập id sinh viên cần xóa: ");
        int id = this.inputNumber.nextInt();
        boolean isExist = studentManager.isExist(id);
        if (isExist) {
            this.studentManager.delete(id);
        } else {
            System.out.println("Không tìm thấy sinh viên này");
        }
    }

    public void showAll() {
        List<Student> list = studentManager.findAll();
        System.out.println("---------------- Danh sách sinh viên ---------------");
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public void showFormAdd() {
        System.out.println("----------- Thêm mới sinh viên -----------");
        System.out.println("Nhập Name: ");
        String name = this.inputString.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = this.inputNumber.nextInt();
        System.out.println("Nhập điểm: ");
        double score = this.inputNumber.nextDouble();
        Student newStudent = new Student(name, age, score);
        this.studentManager.add(newStudent);
        System.out.println("Thêm mới sinh viên thành công");
    }

    public void showMainMenu() {
        System.out.println("-------- Quản lý sinh viên ---------------");
        System.out.println("1.Thêm mới sinh viên");
        System.out.println("2.Xóa sinh viên");
        System.out.println("3.Sửa thông tin sinh viên");
        System.out.println("4.Tìm kiếm sinh viên theo id");
        System.out.println("5.Hiển thị tất cả sinh viên");
        System.out.println("6.Tìm kiếm theo tên");
        System.out.println("0.Thoát chương trình");
        System.out.println("======= Vui lòng nhập lựa chọn của bạn =====>");
    }

    public void showFormEdit() {
        System.out.println("------- Sửa sinh viên --------------");
        System.out.println("Nhập Id sinh viên cần sửa: ");
        int id = inputNumber.nextInt();
        Student studentChecked = studentManager.findById(id);
        if (studentChecked == null) {
            System.out.println("Không tồn tại sinh viên");
            return;
        }
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập tuổi");
        int age = inputString.nextInt();
        System.out.println("Nhập điểm: ");
        double score = inputNumber.nextDouble();
        studentChecked.setName(name);
        studentChecked.setAge(age);
        studentChecked.setScore(score);
        studentManager.update(id, studentChecked);
        System.out.println("Cập nhật thành công.");
    }

    public void showMenuSearchContainsName() {
        System.out.println("---------- Search name ------------");
        System.out.println("Nhập tên cần tìm: ");
        String input = inputString.nextLine();
        List<Student> listData = studentManager.findStudentByContainsName(input);
        System.out.println("---------- Danh sách  -------------");
        for (Student student : listData) {
            System.out.println(student);
        }
    }

    // Id tự tăng (Không cho người dùng nhập)
    // edit
    // tìm sinh viên theo id
    // tìm sinh viên theo tên gần đúng
    // tìm sinh viên theo khoảng điểm

    // Quản lý thư viện => Quản lý sách (Tương tự demo)

    // Nâng cao: Sách thì có thể có nhiều loại sách (Category)
    // Mỗi sách thì sẽ thuộc 1 category nào đó
    // Category cũng có quản lý riêng
}


/*
    class Category {
    int idCate;
    String nameCate;
    String nameUserCreated;
    }
    ==> Có manager

    class Book {
    int id;
    String name;
    String author;
    ...
    int categoryId
    }
    => Có manager

 */
