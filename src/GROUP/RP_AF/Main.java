package GROUP.RP_AF;

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
//        show a related menu based on the user
        switch (role.getAuthority()) {
            case 0:
                adminFunctions adminfun = new adminFunctions(request, skills, classes);
                p.print("I am the administrator");
                p.print("1.Check Teaching Requrements");
                p.print("2.Assign Teachers");
                p.print("3.Check Assignment Results");
                p.print("4.Update Teaching Skills");
                p.print("5.Check Teaching Skills");
                p.print("0.Exit the System");
                p.print("Please enter a number：");
                funNumber = myScanner.nextInt();
                myScanner.nextLine();
//                find a related function based on the input number
                switch (funNumber) {
                    case 0:
                        return;
                    case 1:
                        adminfun.fCheckRequest();
                        p.print("Enter any key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 2:
                        adminfun.fAssignTeachers();
                        p.print("Enter any key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 3:
                        adminfun.fCheckClassTeacher();
                        p.print("Enter any key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 4:
                        adminfun.fUpdateSkills();
                        p.print("Enter any key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 5:
                        adminfun.fCheckSkills();
                        p.print("Enter any key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    default:
                        p.print("Error!");
                        menu(role, request, skills, classes);
                }
                break;
            case 1:
                directorFunction dirFun = new directorFunction(request);
                p.print("I am a course director");
                p.print("1.Check Teaching Requirements");
                p.print("2.Submit Teaching Requirements");
                p.print("0.Exit the System");
                p.print("Please enter a number:");
                funNumber = myScanner.nextInt();
                myScanner.nextLine();
                switch (funNumber) {
                    case 0:
                        return;
                    case 1:
                        dirFun.fCheckRequest(role);
                        p.print("Enter any key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 2:
                        dirFun.fPushRequest(role);
                        p.print("Enter any key to return to the menu！");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                }
                break;
            default:
                p.print("Wrong! I am none of them!");
        }
    }

    public static void main(String[] args) {
        view p = new view();
        do {
//            Welcome board
            p.print(
                    "**********************************************************\n" +
                            "*                                                        *\n" +
                            "*            University of Glasgow PTT System            *\n" +
                            "*               Designed by RP_AF group                  *\n" +
                            "*                                                        *\n" +
                            "*                                                        *\n" +
                            "*          Contact the admin if any question.            *\n" +
                            "*                                                        *\n" +
                            "**********************************************************"
            );
//            Read data from the files
            listOfRequest request = new listOfRequest();
            listOfTeacherSkills skills = new listOfTeacherSkills();
            listOfClassTeacher classes = new listOfClassTeacher();
//            Login
            LogSystem logSystem = new LogSystem();
//            Main menu
            menu(logSystem.getRole(), request, skills, classes);
//            Exit and write data to the file
            request.rewrite();
            skills.rewrite();
            classes.rewrite();
            p.print("Goodbye! See you next time!");
        } while (true);
    }
}
