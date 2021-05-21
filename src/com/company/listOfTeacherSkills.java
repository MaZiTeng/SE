package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class listOfTeacherSkills {
    Collection<String> skills = new ArrayList<>();

    //    增加数据
    public void addSkills(String data) {
        skills.add(data);
    }

    //    展示数据
    public Collection<String> getSkills() {
        return skills;
    }

    //    向文件写入数据
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/com/company/teacher_skills.txt"));
            for (String i : skills) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("TeacherSkills数据写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    从文件获取数据
    public listOfTeacherSkills() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/com/company/teacher_skills.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                skills.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
