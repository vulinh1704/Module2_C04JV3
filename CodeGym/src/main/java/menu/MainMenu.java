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
                case 5:
                    showAll();
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
        this.studentManager.delete(id);
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
        System.out.println("Nhập ID: ");
        int id = this.inputNumber.nextInt();
        System.out.println("Nhập Name: ");
        String name = this.inputString.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = this.inputNumber.nextInt();
        System.out.println("Nhập điểm: ");
        double score = this.inputNumber.nextDouble();
        Student newStudent = new Student(id, name, age, score);
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
        System.out.println("0.Thoát chương trình");
        System.out.println("======= Vui lòng nhập lựa chọn của bạn =====>");
    }

    // Id tự tăng (Không cho người dùng nhập)
    // edit
    // tìm sinh viên theo id
    // tìm sinh viên theo tên gần đúng đúng
    // tìm sinh viên theo khoảng điểm

    // Quản lý thư viện
}
