package com.company;

import java.util.Scanner;

public class Main {
    public static int menu(Role role) {
        view p = new view();
        Scanner myScanner = new Scanner(System.in);
        Functions fun = new Functions();
        int funNumber = 0;
        switch (role.getAuthority()) {
            case 0:
                p.print("我是管理员");
                p.print("1.查看教学需求");
                p.print("2.分配课程");
                p.print("3.查看课程分配情况");
                p.print("4.更新教学技能");
                p.print("5.查看教学技能");
                p.print("0.退出系统");
                p.print("请输入编号：");
                funNumber = myScanner.nextInt();
                myScanner.nextLine();
                switch (funNumber) {
                    case 0:
                        return 0;
                    case 1:
                        fun.fCheckRequest(role);
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 2:
                        fun.fAssignTeachers();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 3:
                        fun.fCheckClassTeacher();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 4:
                        fun.fUpdateSkills();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 5:
                        fun.fCheckSkills();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    default:
                        p.print("输入错误！");
                        menu(role);
                }
                break;
            case 1:
                p.print("我是课程主管");
                p.print("1.查看教学需求");
                p.print("2.提交教学需求");
                p.print("0.退出系统");
                p.print("请输入编号：");
                funNumber = myScanner.nextInt();
                myScanner.nextLine();
                switch (funNumber) {
                    case 0:
                        return 0;
                    case 1:
                        fun.fCheckRequest(role);
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                    case 2:
                        fun.fPushRequest(role);
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role);
                        break;
                }
                break;
            default:
                p.print("出错了！我谁都不是");
        }
        return 1;
    }

    public static void main(String[] args) {
        view p = new view();
        do {
            p.print(
                    "**********************************************************\n" +
                            "*                                                        *\n" +
                            "*   University of Glasgow SE course RP_AF group          *\n" +
                            "*                                                        *\n" +
                            "*                                                        *\n" +
                            "*          Contact the admin if any question.            *\n" +
                            "*                                                        *\n" +
                            "**********************************************************"
            );
            LogSystem logSystem = new LogSystem();
            if (menu(logSystem.getRole()) == 1) {
                break;
            }
        } while (true);
        p.print("大爷~ 玩得好常来啊~");
    }
}
