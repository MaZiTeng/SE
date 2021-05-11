package com.company;

public class Functions {
    public void fCheckRequest(){
        System.out.println("查看教学要求");
        DataLoader Request = new DataLoader();
        Request.setFileName("Request");
        System.out.println(Request.getData()[0]);



    }
    public void fPushRequest(){
        System.out.println("提交教学要求");
    }
    public void fAssignTeachers(){
        System.out.println("分配教师");
    }
    public void fUpdateSkills(){
        System.out.println("更新技能和培训结果");
    }
}
