package GROUP.RP_AF;

import java.util.Collection;
import java.util.Scanner;

public class directorFunction {
    view p = new view();
    final Scanner myScanner = new Scanner(System.in);
    listOfRequest request;

    public directorFunction(listOfRequest request) {
        this.request = request;
    }

    public void fCheckRequest(Role role) {
        this.p.print("Check Teaching Requirements");
        Collection<String> dataGet = request.getRequest();
        this.p.print(String.format("%15s%15s%20s%23s", "Course_Director_Name", "Course_Name", "Number_of_Teachers", "Compulsory_Training"));
        //        output teaching requirements
        for (String i : dataGet) {
            String[] strArr = i.split(" ");
            if (strArr[0].equals(role.getName())) {
                System.out.printf("%15s%15s%20s%23s\n", strArr[0], strArr[1], strArr[2], strArr[3]);
            }
        }
    }


    public void fPushRequest(Role role) {
        System.out.println("Submit Teaching Requirements");
        System.out.println("Please enter Course name, Number of Teachers and Compulsory Training. Separate them with one space.");
        String data = myScanner.nextLine();
//        Add the user's name when input information
        request.addRequest(role.getName() + " " + data);
    }

}
