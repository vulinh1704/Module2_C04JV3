package com.menu;

import com.lib.Input;
import com.management.BookManagement;
import com.management.CategoryManagement;
import com.model.Book;
import com.model.Category;

import java.util.List;

public class MainMenu {
    private BookManagement bookManagement;
    private CategoryManagement categoryManagement;

    public MainMenu() {
        this.bookManagement = new BookManagement();
        this.categoryManagement = new CategoryManagement();
    }

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("-------- Menu ---------");
            System.out.println("1. Quản lý sách");
            System.out.println("2. Quản lý loại sách");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showBookMenu();
                    break;
                case 2:
                    this.showCategoryMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        } while (choice != 0);
    }

    // ======================= Category Feature ====================
    public void showCategoryMenu() {
        int choice;
        do {
            System.out.println("-------- Category Menu ---------");
            System.out.println("1. Thêm loại");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Chi tiết loại");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showFormAddCategory();
                    break;
                case 2:
                    showAllCategories();
                    break;
            }
        } while (choice != 0);
    }

    public void showAllCategories() {
        System.out.println("---------- List Category Menu --------");
        List<Category> list = this.categoryManagement.findAll();
        for (Category category : list) {
            System.out.println(category); // 1 - Trinh Thám -
        }
    }

    public void showFormAddCategory() {
        System.out.println("---------- Add Category Menu --------");
        System.out.println("Nhâ id: ");
        Long id = (long) Input.inputInt();
        System.out.println("Nhập tên: ");
        String name = Input.inputString();
        System.out.println("Nhập mô tả: ");
        String description = Input.inputString();
        Category newCategory = new Category(id, name, description);
        this.categoryManagement.add(newCategory);
        System.out.println("Thêm loại thành công");
    }

    // ======================= Book Feature =======================

    public void showBookMenu() {
        int choice;
        do {
            System.out.println("-------- Book Menu ---------");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị tất cả");
            System.out.println("3. Chi tiết sách");
            System.out.println("4. Xóa sách");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = Input.inputInt();
            switch (choice) {
                case 1:
                    showFormAddBook();
                    break;
                case 2:
                    showAllBook();
                    break;
            }
        } while (choice != 0);
    }

    public void showAllBook() {
        System.out.println("---------- List Book Menu --------");
        List<Book> list = this.bookManagement.findAll();
        for (Book book : list) {
            Category category = getCategoryById(book.getCategoryId());
            String categoryName = "";
            if (category != null) {
                categoryName = category.getName();
            }
            System.out.println("Id: " + book.getId() + " Name: " + book.getName() + " Category: " + categoryName);
        }
    }

    private Category getCategoryById(Long id) {
        try {
            Category category = this.categoryManagement.findById(id);
            return category;
        } catch (Exception e) {
            // System.out.println("");
        }
        return null;
    }

    public void showFormAddBook() {
        System.out.println("---------- Add Book Menu --------");
        System.out.println("Nhập tên: ");
        String name = Input.inputString();
        System.out.println("Nhập tác giả: ");
        String author = Input.inputString();
        // Show list option for categories;
        List<Category> categories = categoryManagement.findAll();
        System.out.println("Danh sách category");
        for (Category category : categories) {
            System.out.println(category); // Id: 1 - Name: Trinh Thám
        }
        System.out.println("Vui lòng nhập Id loại sách");
        Long categoryId = (long) Input.inputInt();
        // Kiểm ta xem category Id người dùng nhập có tồn tại hay không
        Book book = new Book(author, name, categoryId);
        bookManagement.add(book);
        System.out.println("Thêm thành công");
    }

}

// Đăng ký đăng nhập

// Product Category
// Student Clazz