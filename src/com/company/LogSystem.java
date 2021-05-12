package com.company;

import java.util.Scanner;

public class LogSystem {
    Role role = new Role();

    private void logIn(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入用户名");
        String username = myScanner.nextLine();
        System.out.println("输入密码");
        String password = myScanner.nextLine();

        DataProcessor Request = new DataProcessor();
        Request.setFileName("role");
        String[] dataGet = Request.getData();
        for (String i : dataGet) {
            String[] strArr = i.split("\\b\\b\\b");
            if (strArr[2].equals(username)){
                if(strArr[4].equals(password)){
                    System.out.println("登陆成功！");
                    this.role.setUID(Integer.parseInt(strArr[0]));
                    this.role.setAuthority(Integer.parseInt(strArr[6]));
                    return;
                }else {
                    System.out.println("密码错误");
                    logIn();
                }
            }
        }
        System.out.println("无此用户");
        logIn();
    }

    public LogSystem(){
        logIn();
    }
}
