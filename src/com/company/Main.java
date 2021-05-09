package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int role;
        logSystem logSystem = new logSystem();
        role = logSystem.role;
        switch (role) {
            case 0:
                System.out.println("我是管理员");
                break;
            case 1:
                System.out.println("我是课程主管");
                break;
            case 2:
                System.out.println("我是老师");
                break;
            default:
                System.out.println("出错了！我谁都不是");
        }



        // write your code here
    }
}
