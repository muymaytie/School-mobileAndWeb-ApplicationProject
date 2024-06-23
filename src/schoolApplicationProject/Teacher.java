package schoolApplicationProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teacher {


    static Scanner scan = new Scanner(System.in);

    static Map<String, String> teachersMap = new HashMap<>();

    public static void addFakeTeachers(){

        teachersMap.put("21074533914", "Doe, Black, 1979, Biology");
        teachersMap.put("22974533912", "Jack, Reacher, 1980, Math");
        teachersMap.put("23874533915", "Steve, Savge, 1987, Physical");
        teachersMap.put("24774533910", "Amanda, Cerny, 1993, Literature");
        teachersMap.put("22749453399", "Jacob, Black, 1995, Chemical");
        teachersMap.put("25324533901", "Emily, Oliver, 1993, Math");

    }

    public static void teacherMenu() throws InterruptedException {


        String prefrence = "";

        do {
            System.out.println("=========== UNION COLLEGE ===========\n" +
                    "=========== TEACHER MENU ===========\n" +
                    "\n" +
                    "\t     1- TEACHER LİST\n" +
                    "\t     2- FINDİNG TEACHER BY SURNAME\n" +
                    "\t     3- FINDİNG TEACHER BY BRANCH\n" +
                    "\t     4- ADD TEACHER\n" +
                    "\t     5- DELETE WİTH ID\n" +
                    "\t     A- MAIN MENU\n" +
                    "\t     Q- EXİT");

            System.out.print("PLEASE ENTER PREFERENCE: ");
            prefrence = scan.nextLine();
            System.out.println(" ");

            switch (prefrence){

                case "1":
                    showTeacherList();
                    break;

                case "2":
                    findTeacherBySurname();
                    break;

                case "3":
                    findTeacherByBranch();
                    break;

                case"4":
                    addTeacher();
                    break;

                case "5":
                    deleteTeacher();
                    break;

                case "a":
                case "A":
                    WareHouse.MainMenu();
                    break;

                case "q":
                case "Q":
                    break;
            }


        }while (!prefrence.equalsIgnoreCase("Q"));

        WareHouse.finishedProject();


    }



    public static void addTeacher() throws InterruptedException {

        System.out.print("PLEASE ENTER TO ADD TEACHER ID: ");
        String teacherId = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD TEACHER NAME: ");
        String teacherName = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD TEACHER SURNAME: ");
        String teacherSurname = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD TEACHER DATE BRİTH: ");
        String teacherDateBrith = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD TEACHER BRANCH: ");
        String teacherBranch = scan.nextLine();

        String addValue = teacherName +", " + teacherSurname +", "+ teacherDateBrith +", "+ teacherBranch;
        teachersMap.put(teacherId,addValue);

        System.out.println("ADD PROCESS SAVED SUCCESSFULLY");
        System.out.println(" ");

        Thread.sleep(5000);

    }

    public static void deleteTeacher() throws InterruptedException {

        System.out.print("PLEASE ENTER TEACHER ID TO DELETE: ");
        String teacherToDeleted = scan.nextLine();

        String teacherValueToDeleted = teachersMap.get(teacherToDeleted);;

        String resultValue = teachersMap.remove(teacherToDeleted);

        try {
            boolean result = resultValue.equalsIgnoreCase(teacherValueToDeleted);

        } catch (Exception e) {

            System.out.println("TEACHER TO DELETE NOT FOUND");
        }


        System.out.println(" ");
        Thread.sleep(5000);
    }

    public static void findTeacherByBranch() throws InterruptedException {

        System.out.print("PLEASE ENTER BRANCH TO SEARCH: ");
        String searchedBranch = scan.nextLine();

        Set<Map.Entry<String,String>> teacherEnterySet = teachersMap.entrySet();

        System.out.println("       =========== UNION COLLEGE ===========\n" +
                "        =========== BRANCH TEACHER LİST ===========\n" +
                "ID            NAME   SURNAME   DATE OF BRİTH   BRANCH") ;


        for (Map.Entry<String,String> each : teacherEnterySet
        ){
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if(searchedBranch.equalsIgnoreCase(eachValueArr[3])){

                System.out.printf("%11s   %-6s %-7s       %4s        %s \n" , eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            }


        }

        Thread.sleep(7000);
    }

    public static void findTeacherBySurname() throws InterruptedException {

        System.out.print("PLEASE ENTER SURNAME TO SEARCH: ");
        String searchedSurname = scan.nextLine();

        Set<Map.Entry<String,String>> teacherEnterySet = teachersMap.entrySet();

        System.out.println("       =========== UNION COLLEGE ===========\n" +
                "        =========== SURNAME TEACHER LİST ===========\n" +
                "ID            NAME   SURNAME   DATE OF BRİTH   BRANCH") ;


        for (Map.Entry<String,String> each : teacherEnterySet
        ){
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");


            if(searchedSurname.equalsIgnoreCase(eachValueArr[1])){

                System.out.printf("%11s   %-6s %-7s       %4s        %s \n" , eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            }

        }


        Thread.sleep(6000);
    }

    public static void showTeacherList() throws InterruptedException {


        Set<Map.Entry<String,String>> teacherEnterySet = teachersMap.entrySet();

        System.out.println("       =========== UNION COLLEGE ===========\n" +
                         "        =========== TEACHER LİST ===========\n" +
                "ID            NAME   SURNAME   DATE OF BRİTH   BRANCH") ;


        for (Map.Entry<String,String> each : teacherEnterySet
        ){
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%11s   %-6s %-7s       %4s        %s \n" , eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);

        }

        Thread.sleep(6000);
    }



}
