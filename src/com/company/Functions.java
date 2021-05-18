package com.company;

import java.util.Scanner;

public class Functions {
    Scanner myScanner = new Scanner(System.in);

    public void fCheckRequest(Role role) {
        System.out.println("查看教学要求");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("Request");
        String[] dataGet = Request.getData();
        System.out.println("提出者 课程 人员数量 接受的培训 状态");
        if (role.Authority == 0) {
            for (String i : dataGet) {
                System.out.println(i);
            }
        } else if (role.Authority == 1) {
            for (String i : dataGet) {
                String[] strArr = i.split(" ");
                if (strArr[0].equals(role.Name)) {
                    System.out.println(i);
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
        Assign.writeData(role.Name + " " + data);
    }

    public void fAssignTeachers() {
        System.out.println("分配教师");
        System.out.println("输入班级名称、课程名称、主管名称和ptt名称，用空格分隔");
        String data = myScanner.nextLine();
        DataProcessor Assign = new DataProcessor();
        Assign.setFileName("Class_teacher");
        Assign.writeData(data);
    }

    public void fUpdateSkills() {
        System.out.println("更新技能");
        System.out.println("输入教师、技能和状态，用空格分隔");
        String data = myScanner.nextLine();
        DataProcessor Assign = new DataProcessor();
        Assign.setFileName("teacher_skills");
        Assign.writeData(data);
    }

    public void fCheckSkills() {
        System.out.println("查看教学技能");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("teacher_skills");
        String[] dataGet = Request.getData();
        System.out.println("名字 能力 状态");
        for (String i : dataGet) {
            System.out.println(i);
        }
    }

//    public void fUpdateTraining() {
//        System.out.println("录入培训结果");
//        System.out.println("输入教师、培训内容和培训结果，用tab分隔");
//        String data = myScanner.nextLine();
//        DataProcessor Assign = new DataProcessor();
//        Assign.setFileName("teacher_training");
//        Assign.writeData(data);
//    }

//    public void fCheckTraining(){
//        System.out.println("查看培训结果");
//        DataProcessor Request = new DataProcessor();
//        Request.setFileName("teacher_training");
//        String[] dataGet = Request.getData();
//        System.out.println("姓名  能力  结果");
//        for (String i : dataGet) {
//            System.out.println(i);
//        }
//    }

    public void fCheckClassTeacher() {
        System.out.println("查看课程分配情况");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("Class_teacher");
        String[] dataGet = Request.getData();
        System.out.println("班级名称 课程名称 主管名称 ptt名称");
        for (String i : dataGet) {
            System.out.println(i);
        }
    }
}
