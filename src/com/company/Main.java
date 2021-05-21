package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void menu(
            Role role, listOfRequest request,
            listOfTeacherSkills skills,
            listOfClassTeacher classes
    ) {
        view p = new view();
        Scanner myScanner = new Scanner(System.in);
        int funNumber = 0;
//        根据用户属性显示对应的菜单
        switch (role.getAuthority()) {
            case 0:
                adminFunctions adminfun = new adminFunctions(request, skills, classes);
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
//                根据用户输入的编号，提供对应的服务
                switch (funNumber) {
                    case 0:
                        return;
                    case 1:
                        adminfun.fCheckRequest();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 2:
                        adminfun.fAssignTeachers();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 3:
                        adminfun.fCheckClassTeacher();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 4:
                        adminfun.fUpdateSkills();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 5:
                        adminfun.fCheckSkills();
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    default:
                        p.print("输入错误！");
                        menu(role, request, skills, classes);
                }
                break;
            case 1:
                directorFunction dirFun = new directorFunction(request);
                p.print("我是课程主管");
                p.print("1.查看教学需求");
                p.print("2.提交教学需求");
                p.print("0.退出系统");
                p.print("请输入编号：");
                funNumber = myScanner.nextInt();
                myScanner.nextLine();
                switch (funNumber) {
                    case 0:
                        return;
                    case 1:
                        dirFun.fCheckRequest(role);
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 2:
                        dirFun.fPushRequest(role);
                        p.print("按回车返回主菜单！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                }
                break;
            default:
                p.print("出错了！我谁都不是");
        }
    }

    public static void main(String[] args) {
        view p = new view();
        do {
//            欢迎界面
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
//            从文件读取数据
            listOfRequest request = new listOfRequest();
            listOfTeacherSkills skills = new listOfTeacherSkills();
            listOfClassTeacher classes = new listOfClassTeacher();
//            登陆
            LogSystem logSystem = new LogSystem();
//            主程序菜单
            menu(logSystem.getRole(), request, skills, classes);
//            程序结束，向文件写入数据
            request.rewrite();
            skills.rewrite();
            classes.rewrite();
            p.print("大爷~ 玩得好常来啊~");
        } while (true);
    }
}
