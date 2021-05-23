package GROUP.RP_AF;

import java.util.Scanner;

public class LogSystem {
    private Role role = new Role();

    //    Choose a role
    public LogSystem() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 0 if you are the administrator, or enter 1 if you are a course director");
        int r = myScanner.nextInt();
        myScanner.nextLine();
//        check the user
        switch (r) {
            case 0:
                this.role = new Admin();
                this.role.setUID(1);
                this.role.setName("Helen");
                this.role.setAuthority(0);
                break;
            case 1:
                this.role = new Director();
                this.role.setUID(2);
                this.role.setName("Simon");
                this.role.setAuthority(1);
                break;
            default:
                System.out.println("Error!");
                System.exit(0);
        }
    }

    public Role getRole() {
        return role;
    }
}
