package com.company;

import java.util.Scanner;

public class Functions {
    Scanner myScanner = new Scanner(System.in);
    public void fCheckRequest() {
        System.out.println("查看教学要求");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("Request");
        String[] dataGet = Request.getData();
        System.out.println("ID  提出者   课程名      需求             状态");
        for (String i : dataGet) {
            System.out.println(i);
        }
    }

    public void fPushRequest(Role role) {
        System.out.println("提交教学要求");
    }

    public void fAssignTeachers() {
        System.out.println("分配教师");
        System.out.println("输入课程名和教师，用tab分隔");
        String data = myScanner.nextLine();
        DataProcessor Assign = new DataProcessor();
        Assign.setFileName("Class_teacher");
        Assign.writeData(data);
    }

    public void fUpdateSkills() {
        System.out.println("更新技能");
        System.out.println("输入教师和技能，用tab分隔");
        String data = myScanner.nextLine();
        DataProcessor Assign = new DataProcessor();
        Assign.setFileName("teacher_skills");
        Assign.writeData(data);
    }

    public void fCheckSkills(){
        System.out.println("查看教学技能");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("teacher_skills");
        String[] dataGet = Request.getData();
        System.out.println("名字  能力");
        for (String i : dataGet) {
            System.out.println(i);
        }
    }

    public void fUpdateTraining() {
        System.out.println("录入培训结果");
        System.out.println("输入教师、培训内容和培训结果，用tab分隔");
        String data = myScanner.nextLine();
        DataProcessor Assign = new DataProcessor();
        Assign.setFileName("teacher_training");
        Assign.writeData(data);
    }

    public void fCheckTraining(){
        System.out.println("查看培训结果");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("teacher_training");
        String[] dataGet = Request.getData();
        System.out.println("姓名  能力  结果");
        for (String i : dataGet) {
            System.out.println(i);
        }
    }

    public void fCheckClassTeacher(){
        System.out.println("查看课程分配情况");
        DataProcessor Request = new DataProcessor();
        Request.setFileName("Class_teacher");
        String[] dataGet = Request.getData();
        System.out.println("课程名   教师名");
        for (String i : dataGet) {
            System.out.println(i);
        }
    }
}
