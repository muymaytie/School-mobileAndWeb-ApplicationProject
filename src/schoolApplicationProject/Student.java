package schoolApplicationProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> studentMap = new HashMap<>();

    public static void addFakeStudents(){

        studentMap.put("21071233887", "Mary, Jane, 2001, A-12");
        studentMap.put("22974567320", "Emma, Rock, 2002, B-11");
        studentMap.put("23874577095", "James, Hug, 2001, B-12");
        studentMap.put("24774533442", "Peter, Andrew, 2003, B-11");
        studentMap.put("22749453098", "Helen, Arthur, 2004, A-12");
        studentMap.put("25324533431", "Anna, Susan, 2000, B-12");
    }

    public static void studentMenu() throws InterruptedException {

        String prefrence = "";

        do {
            System.out.println("=========== UNION COLLEGE ===========\n" +
                    "=========== STUDENT MENU ===========\n" +
                    "\n" +
                    "\t     1- STUDENT LİST\n" +
                    "\t     2- FINDİNG STUDENT BY SURNAME\n" +
                    "\t     3- FINDİNG STUDENT BY CLASS\n" +
                    "\t     4- ADD STUDENT\n" +
                    "\t     5- DELETE WİTH ID\n" +
                    "\t     A- MAIN MENU\n" +
                    "\t     Q- EXİT");

            System.out.print("PLEASE ENTER PREFERENCE: ");
            prefrence = scan.nextLine();
            System.out.println(" ");

            switch (prefrence){

                case "1":
                    showStudentList();
                    break;

                case "2":
                    findStudentBysurname();
                    break;

                case "3":
                    findStudentByClass();
                    break;

                case"4":
                    addStudent();
                    break;

                case "5":
                    deleteStudent();
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

    public static void deleteStudent() throws InterruptedException {

        System.out.print("PLEASE ENTER STUDENT ID TO DELETE: ");
        String studentToDeleted = scan.nextLine();

        String studentValueToDeleted = studentMap.get(studentToDeleted);;

        String resultValue = studentMap.remove(studentToDeleted);

        try {
            boolean result = resultValue.equalsIgnoreCase(studentValueToDeleted);

        } catch (Exception e) {

            System.out.println("STUDENT TO DELETE NOT FOUND");
        }


        System.out.println(" ");
        Thread.sleep(2000);

    }

    public static void addStudent() throws InterruptedException {

        System.out.print("PLEASE ENTER TO ADD STUDENT ID: ");
        String studentId = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD STUDENT NAME: ");
        String studentName = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD STUDENT SURNAME: ");
        String studentSurname = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD STUDENT DATE BRİTH: ");
        String studentDateBrith = scan.nextLine();
        System.out.print("PLEASE ENTER TO ADD STUDENT CLASS: ");
        String studentClass = scan.nextLine();

        String addValue = studentName +", " + studentSurname +", "+ studentDateBrith +", "+ studentClass;
        studentMap.put(studentId,addValue);

        System.out.println("ADD PROCESS SAVED SUCCESSFULLY");
        System.out.println(" ");

        Thread.sleep(5000);
    }

    public static void findStudentByClass() throws InterruptedException {

        System.out.print("PLEASE ENTER CLASS TO SEARCH: ");
        String searchedClass = scan.nextLine();

        Set<Map.Entry<String,String>> classEnterySet = studentMap.entrySet();

        System.out.println("       =========== UNION COLLEGE ===========\n" +
                "        =========== CLASS STUDENT LİST ===========\n" +
                "ID            NAME   SURNAME   DATE OF BRİTH   CLASS") ;


        for (Map.Entry<String,String> each : classEnterySet
        ){
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if(searchedClass.equalsIgnoreCase(eachValueArr[3])){

                System.out.printf("%11s   %-6s %-7s       %4s        %s \n" , eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            }


        }

        Thread.sleep(7000);

    }

    public static void findStudentBysurname() throws InterruptedException {

        System.out.print("PLEASE ENTER SURNAME TO SEARCH: ");
        String searchedSurname = scan.nextLine();

        Set<Map.Entry<String,String>> studentEnterySet = studentMap.entrySet();

        System.out.println("       =========== UNION COLLEGE ===========\n" +
                "        =========== SURNAME STUDENT LİST ===========\n" +
                "ID            NAME   SURNAME   DATE OF BRİTH   CLASS") ;


        for (Map.Entry<String,String> each : studentEnterySet
        ){
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");


            if(searchedSurname.equalsIgnoreCase(eachValueArr[1])){

                System.out.printf("%11s   %-6s %-7s       %4s        %s \n" , eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            }

        }


        Thread.sleep(7000);

    }

    public static void showStudentList() throws InterruptedException {

        Set<Map.Entry<String,String>> studentEnterySet = studentMap.entrySet();

        System.out.println("       =========== UNION COLLEGE ===========\n" +
                "        =========== STUDENT LİST ===========\n" +
                "ID            NAME   SURNAME   DATE OF BRİTH   CLASS") ;


        for (Map.Entry<String,String> each : studentEnterySet
        ){
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            System.out.printf("%11s   %-6s %-7s       %4s        %s \n" , eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);

        }

        Thread.sleep(6000);
    }





}
