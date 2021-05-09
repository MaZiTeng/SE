package com.company;

public class logSystem {
    int role;
    int Uid;
    private void logIn(){
        System.out.println("要求输入用户名和密码");

//        判断role
        this.role = 0;
        this.Uid = 0;
    }

    public logSystem(){
        logIn();
    }
}
