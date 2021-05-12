package com.company;

import java.util.Scanner;

public class Main {
    public static void menu(Role role) {
        Scanner myScanner = new Scanner(System.in);
        Functions fun = new Functions();
        switch (role.Authority) {
            case 0:
                System.out.println("我是管理员");
                System.out.println("1.查看教学需求");
                System.out.println("2.分配课程");
                System.out.println("3.查看课程分配情况");
                System.out.println("4.更新教学技能");
                System.out.println("5.查看教学技能");
                System.out.println("6.录入培训结果");
                System.out.println("7.查看培训结果");
                System.out.println("0.退出系统");
                int funNumber = myScanner.nextInt();
                myScanner.nextLine();
                switch (funNumber) {
                    case 0:
                        return;
                    case 1:
                        fun.fCheckRequest();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 2:
                        fun.fAssignTeachers();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 3:
                        fun.fCheckClassTeacher();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 4:
                        fun.fUpdateSkills();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 5:
                        fun.fCheckSkills();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 6:
                        fun.fUpdateTraining();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 7:
                        fun.fCheckTraining();
                        System.out.println("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    default:
                        System.out.println("输入错误！");
                        menu(role);
                }
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
    }

    public static void main(String[] args) {
//        Role role;
        LogSystem logSystem = new LogSystem();
        menu(logSystem.role);
        System.out.println("大爷~ 玩得好常来啊~");
    }
}
