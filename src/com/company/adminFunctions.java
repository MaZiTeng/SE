package com.company;

import java.util.Collection;
import java.util.Scanner;

public class adminFunctions {
    view p = new view();
    final Scanner myScanner = new Scanner(System.in);
    listOfRequest request;
    listOfTeacherSkills skills;
    listOfClassTeacher classes;

    public adminFunctions(listOfRequest request, listOfTeacherSkills skills, listOfClassTeacher classes) {
//        导入lists
        this.request = request;
        this.skills = skills;
        this.classes = classes;
    }

    public void fCheckRequest() {
        this.p.print("查看教学要求");
        Collection<String> dataGet = request.getRequest();
        this.p.print(String.format("%10s%10s%7s%15s", "提出者", "课程", "人员数量", "接受的培训"));
        //        遍历输出
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            System.out.printf("%10s%10s%7s%15s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
        }
    }

    public void fAssignTeachers() {
        System.out.println("分配教师");
        System.out.println("输入班级名称、课程名称、主管名称和ptt名称，用空格分隔");
        String data = myScanner.nextLine();
        classes.addclasses(data);
    }

    public void fUpdateSkills() {
        System.out.println("更新技能");
        System.out.println("输入教师、技能和状态，用空格分隔");
        String data = myScanner.nextLine();
        skills.addSkills(data);
    }

    public void fCheckSkills() {
        System.out.println("查看教学技能");
        Collection<String> dataGet = skills.getSkills();
        System.out.printf("%10s%10s%10s\n", "名字", "能力", "状态");
//        遍历输出
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            System.out.printf("%10s%10s%10s\n", strArr[0], strArr[1], strArr[2]);
        }
    }

    public void fCheckClassTeacher() {
        System.out.println("查看课程分配情况");
        Collection<String> dataGet = classes.getClassess();
        System.out.printf("%10s%20s%10s%10s\n", "班级名称", "课程名称", "主管名称", "ptt名称");
        //        遍历输出
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            System.out.printf("%10s%20s%10s%10s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
        }
    }
}
