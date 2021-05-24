package GROUP.RP_AF;

import java.util.Scanner;

// Please make sure the path is src/GROUP/RP_AF/Main.java when you run the programme
public class Main {

    public static void menu(
            Role role, ListOfRequest request,
            ListOfTeacherSkill skills,
            ListOfClassTeacher classes
    ) {
        View p = new View();
        Scanner myScanner = new Scanner(System.in);
        int funNumber = 0;
//        show a related menu based on the user
        switch (role.getAuthority()) {
            case 0:
                AdminFunction adminfun = new AdminFunction(request, skills, classes);
                p.print("I am the administrator");
                p.print("1.Check Teaching Requirements");
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
                        p.print("Press Enter key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 2:
                        adminfun.fAssignTeachers();
                        p.print("Press Enter key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 3:
                        adminfun.fCheckClassTeacher();
                        p.print("Press Enter key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 4:
                        adminfun.fUpdateSkills();
                        p.print("Press Enter key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 5:
                        adminfun.fCheckSkills();
                        p.print("Press Enter key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    default:
                        p.print("Error!");
                        menu(role, request, skills, classes);
                }
                break;
            case 1:
                DirectorFunction dirFun = new DirectorFunction(request);
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
                        p.print("Press Enter key to return to the menu");
                        myScanner.nextLine();
                        menu(role, request, skills, classes);
                        break;
                    case 2:
                        dirFun.fPushRequest(role);
                        p.print("Press Enter key to return to the menu");
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
        View p = new View();
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
            ListOfRequest request = new ListOfRequest();
            ListOfTeacherSkill skills = new ListOfTeacherSkill();
            ListOfClassTeacher classes = new ListOfClassTeacher();
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
