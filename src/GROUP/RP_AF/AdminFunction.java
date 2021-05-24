package GROUP.RP_AF;

import java.util.Collection;
import java.util.Scanner;

public class AdminFunction {
    View p = new View();
    final Scanner myScanner = new Scanner(System.in);
    ListOfRequest request;
    ListOfTeacherSkill skills;
    ListOfClassTeacher classes;

    public AdminFunction(ListOfRequest request, ListOfTeacherSkill skills, ListOfClassTeacher classes) {
//        import all of the lists
        this.request = request;
        this.skills = skills;
        this.classes = classes;
    }

    public void fCheckRequest() {
        this.p.print("Check Teaching Requirements");
        Collection<String> dataGet = request.getRequest();
        this.p.print(String.format("%15s%15s%20s%23s", "Course_Director_Name", "Course_Name", "Number_of_Teachers", "Compulsory_Training"));
        //        output teaching requirements
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            System.out.printf("%15s%15s%20s%23s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
        }
    }

    public void fAssignTeachers() {
        System.out.println("Assign Teachers");
        System.out.println("Please enter class name, course name, director name and teacher name. Separate them with one space.（e.g. IT SE Simon Alex)");
        String data = myScanner.nextLine();
        classes.addclasses(data);
    }

    public void fUpdateSkills() {
        System.out.println("Update Skills");
        System.out.println("Please enter teacher name, skill, and training status. Separate them with one space.（e.g. Alan Java PASS)");
        String data = myScanner.nextLine();
        skills.addSkills(data);
    }

    public void fCheckSkills() {
        System.out.println("Check Teaching Skills");
        Collection<String> dataGet = skills.getSkills();
        System.out.printf("%15s%25s%18s\n", "Teacher_Name", "Skill", "Training_Status");
//        output teaching skills
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            System.out.printf("%15s%25s%18s\n", strArr[0], strArr[1], strArr[2]);
        }
    }

    public void fCheckClassTeacher() {
        System.out.println("Check Part Time Teachers");
        Collection<String> dataGet = classes.getClasses();
        System.out.printf("%15s%25s%16s%15s\n", "Class_Name", "Course_Name", "Director_Name", "Teacher_Name");
        //        output class information
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            System.out.printf("%15s%25s%16s%15s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
        }
    }
}
