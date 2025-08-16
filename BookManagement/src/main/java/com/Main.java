package com;

import com.dto.CategoryDatabase;
import com.dto.DatabaseCustom;
import com.menu.MainMenu;
import com.model.Category;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();

//        DatabaseCustom databaseCustom = new DatabaseCustom("database/categories.csv");
//        System.out.println(databaseCustom.readData());
//        databaseCustom.writeData("6,Ning,21");

//        System.out.println("Trước thêm: ");
//        CategoryDatabase categoryDatabase = new CategoryDatabase();
//        List<Category> list = categoryDatabase.readData();
//        for (Category item : list) {
//            System.out.println(item);
//        }
//        System.out.println("Sau thêm: ");
//        Category category = new Category(1002L, "Thơ", "Tuyêt");
//        categoryDatabase.writeData(category);
//        List<Category> list2 = categoryDatabase.readData();
//        for (Category item : list2) {
//            System.out.println(item);
//        }
    }
}