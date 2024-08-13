package School;

import java.util.Scanner;

import ___.teacherClass.teacher;

public class TeachersPortal {
    public static void main(String[] args) {
        final String pass = "teachers456";

        Scanner sc = new Scanner(System.in);
        School school = new School();

        System.out.println("Welcome to Teachers Portal");
        System.out.print("Enter password to continue: ");
        String password = sc.next();
        if (!password.equals(password)) {
            System.out.println("Invalid Password !");
            return;
        } else {
            System.out.println("Password Correct\n");
            while (true) {

                System.out.println("1 to Mark Attendence");
                

                System.out.print("Enter Your choice");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1: {
                        System.out.println("Teachers Attendence");
                        
                        break;
                    }

                    default:
                        break;
                }

            }

        }

    }

}
