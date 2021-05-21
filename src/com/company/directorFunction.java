package com.company;

import java.util.Collection;
import java.util.Scanner;

public class directorFunction {
    view p = new view();
    final Scanner myScanner = new Scanner(System.in);
    listOfRequest request;

    public directorFunction(listOfRequest request) {
        this.request = request;
    }

    public void fCheckRequest(Role role) {
        this.p.print("查看教学要求");
        Collection<String> dataGet = request.getRequest();
        this.p.print(String.format("%10s%10s%7s%15s", "提出者", "课程", "人员数量", "接受的培训"));
        //        遍历输出
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            if (strArr[0].equals(role.getName())) {
                System.out.printf("%10s%10s%7s%15s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
            }
        }
    }


    public void fPushRequest(Role role) {
        System.out.println("提交教学要求");
        System.out.println("输入课程、人员数量、接受的培训，用空格分隔");
        String data = myScanner.nextLine();
//        输入时增加登陆者的姓名
        request.addRequest(role.getName() + " " + data);
    }

}
