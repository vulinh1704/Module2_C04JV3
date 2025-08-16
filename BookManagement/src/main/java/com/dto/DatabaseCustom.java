package com.dto;

import com.model.Category;

import java.io.*;
import java.util.List;

public class DatabaseCustom {
    private File file;

    public DatabaseCustom(String fileName) {
        this.file = new File(fileName);
    }


    public void writeData(String newData) throws IOException {
        // Step 1: Lấy tất cả dữ liệu của file
        String oldListData = readData();
        // Step 2: Thêm dữ liệu mới vào dòng cuối
        String newListData = oldListData + newData;
        FileWriter fileWriter = new FileWriter(this.file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        // Step 3: Ghi tất cả dữ liệu vào file
        bufferedWriter.write(newListData);
        bufferedWriter.close();
    }
    // Đọc ra => lấy ouput => Thêm dữ liệu mới vào cuối sau đó ghi lại

    public String readData() throws IOException {
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
}
