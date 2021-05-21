package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class listOfRequest {
    Collection<String> request = new ArrayList<>();

    //    增加数据
    public void addRequest(String data) {
        request.add(data);
    }

    //    获取数据
    public Collection<String> getRequest() {
        return request;
    }

    //    向文件写入数据
    public void rewrite() {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("./src/com/company/Request.txt"));
            for (String i : request) {
                out.write(i + "\n");
            }
            out.close();
            System.out.println("Request数据写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    从文件获取数据
    public listOfRequest() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("./src/com/company/Request.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                request.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
