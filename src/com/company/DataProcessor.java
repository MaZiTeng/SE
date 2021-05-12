package com.company;

import java.io.*;
import java.util.ArrayList;

public class DataProcessor {
    String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String[] getData() {
        ArrayList<String> out = new ArrayList<>();
        try {

            BufferedReader in = new BufferedReader(new FileReader("./src/com/company/" + this.fileName + ".txt"));
            String str;
            while ((str = in.readLine()) != null) {
                out.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toArray(new String[0]);
    }

    public void writeData(String data) {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/com/company/" + this.fileName + ".txt", true));
            out.write(data + "\n");
            out.close();
            System.out.println("数据写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
