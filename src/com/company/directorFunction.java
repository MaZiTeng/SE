package com.company;

import java.util.Scanner;

public class directorFunction {
    view p = new view();
    final Scanner myScanner = new Scanner(System.in);

    public void fCheckRequest(Role role) {
        this.p.print("查看教学要求");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("Request");
        String[] dataGet = Request.getData();
        this.p.print(String.format("%10s%10s%7s%15s\n", "提出者", "课程", "人员数量", "接受的培训"));
        if (role.getAuthority() == 0) {
            for (String i : dataGet) {
                String[] strArr = i.split(" ");
                System.out.printf("%10s%10s%7s%15s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
//                System.out.println(i);
            }
        } else if (role.getAuthority() == 1) {
            for (String i : dataGet) {
                String[] strArr = i.split(" ");
                if (strArr[0].equals(role.getName())) {
                    System.out.printf("%10s%10s%7s%15s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
//                    System.out.println(i);
                }
            }
        }
    }


    public void fPushRequest(Role role) {
        System.out.println("提交教学要求");
        System.out.println("输入课程、人员数量、接受的培训，用空格分隔");
        String data = myScanner.nextLine();
        DataProcessor Assign = new DataProcessor();
        Assign.setFileName("Request");
        Assign.writeData(role.getName() + " " + data);
    }

}
