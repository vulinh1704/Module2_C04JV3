package com.dto;

import com.model.Category;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDatabase {
    private File file;

    public CategoryDatabase() {
        this.file = new File("database/categories.csv");
    }

    public void writeData(List<Category> listCategory) {
        try {
            String newListData = "";
            for (Category category : listCategory) {
                newListData += category.getId() + "," + category.getName() + "," + category.getDescription() + "\n";
            }
            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(newListData);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeData(Category category) throws IOException {
        // Step 1: Lấy tất cả dữ liệu của file
        String oldListData = getStringData();
        // Step 2: Thêm dữ liệu mới vào dòng cuối
        String newLine = category.getId() + "," + category.getName() + "," + category.getDescription();
        String newListData = oldListData + newLine;
        FileWriter fileWriter = new FileWriter(this.file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // Step 3: Ghi tất cả dữ liệu vào file
        bufferedWriter.write(newListData);
        bufferedWriter.close();
    }

    public String getStringData() throws IOException {
        FileReader fileReader = new FileReader(this.file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        String output = "";
        while ((line = bufferedReader.readLine()) != null) {
            output += line + "\n";
        }
        bufferedReader.close();
        return output;
    }

    public List<Category> readData() {
        try {
            FileReader fileReader = new FileReader(this.file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            List<Category> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(","); // [1000, "Trinh thám", "Siêu hay luôn"]
                Long id = Long.valueOf(arr[0]);
                String name = arr[1];
                String description = arr[2];
                Category category = new Category(id, name, description);
                list.add(category);
            }
            bufferedReader.close();
            return list;
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
}
