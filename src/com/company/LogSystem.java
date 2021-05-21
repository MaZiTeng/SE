package com.company;

import java.util.Scanner;

public class LogSystem {
    private Role role = new Role();

//    权限管理系统
    public LogSystem() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("测试管理员用户请输入0，测试课程主管用户请输入1");
        int r = myScanner.nextInt();
        myScanner.nextLine();
//        判断用户属性
        switch (r) {
            case 0:
                this.role = new admin();
                this.role.setUID(1);
                this.role.setName("Helen");
                this.role.setAuthority(0);
                break;
            case 1:
                this.role = new director();
                this.role.setUID(2);
                this.role.setName("Simon");
                this.role.setAuthority(1);
                break;
            default:
                System.out.println("输入错误");
                System.exit(0);
        }
    }

    public Role getRole() {
        return role;
    }
}
