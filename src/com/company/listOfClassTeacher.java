package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class listOfClassTeacher {
    Collection<String> classes = new ArrayList<>();

    //    增加数据
    public void addclasses(String data) {
        classes.add(data);
    }

    //    展示数据
    public Collection<String> getClassess() {
        return classes;
    }

    //    向文件写入数据
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/com/company/Class_teacher.txt"));
            for (String i : classes) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("ClassTeacher数据写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    从文件读取数据
    public listOfClassTeacher() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/com/company/Class_teacher.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                classes.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
