package schoolApplicationProject;

import java.util.Scanner;

public class WareHouse {


    static Scanner scan = new Scanner(System.in);

    public static void MainMenu() throws InterruptedException {

        String prefrence = "";

       do {
           System.out.println("=========== UNION COLLEGE ===========\n" +
                   "=========== MAIN MENU ===========\n" +
                   "\n" +
                   "\t     1- VIEW SCHOOL INFORMATİON\n" +
                   "\t     2- TEACHER MENU\n" +
                   "\t     3- STUDENT MENU\n" +
                   "\t     Q- EXİT\n");

            System.out.print("PLEASE ENTER PREFERENCE: ");
            prefrence = scan.nextLine();
           System.out.println(" ");

            switch (prefrence){

                case "1":

                    WareHouse.showSchoolInformations();
                    break;

                case "2":
                    Teacher.teacherMenu();
                    break;

                case "3":
                    Student.studentMenu();
                    break;

                case "q":
                case "Q":
                    break;

                default:
                    System.out.println("PLEASE ENTER VALİD PREFERENCE");

                    Thread.sleep(3000);
            }

       }while (!prefrence.equalsIgnoreCase("Q"));
       
       WareHouse.finishedProject();
    }



    private static void showSchoolInformations() throws InterruptedException {

        System.out.println("=========== UNION COLLEGE ===========\n" +
                "=========== SCHOOL INFORMATİON ===========\n" +
                "ADDRESS: "+School.schoolAdrese+"\n" +
                "PHONE: "+School.phoneNumber);

        System.out.println(" ");

        Thread.sleep(5000);
    }

    public static void finishedProject() {

        System.out.println("EXİTED SCHOOL PROJECT");
        System.exit(0);
    }


}
