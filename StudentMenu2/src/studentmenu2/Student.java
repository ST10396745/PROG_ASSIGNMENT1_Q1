/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmenu2;

import java.util.Scanner;

/**
 *
 * @author wills
 */
public class Student {

    static String[] studentID = new String[50];
    static String[] studentName = new String[50];
    static int[] studentAge = new int[50];
    static String[] studentEmail = new String[50];
    static String[] studentCourse = new String[50];
    static int count;

    public static void captureDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("**************************");

        System.out.println("Enter the student id:");
        String id = sc.next();

        System.out.println("Enter the student name:");
        String name = sc.next();

        System.out.println("Enter the student age:");
        int age;
        try {
            age = sc.nextInt();

            if (!checkAge(age)) {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.println("Please re-enter the student age >>");
                age = sc.nextInt();
            }

        } catch (Exception e) {
            System.out.println("You have entered an incorrect student age!!!");
            System.out.println("Please re-enter the student age >>");
            age = sc.nextInt();
        }

        System.out.println("Enter the student email:");
        String email = sc.next();

        System.out.println("Enter the student course:");
        String course = sc.next();

        saveStudent(id, name, age, email, course);

        System.out.println("Enter (1) to launch menu or any other key to exit");
        String key = sc.next();

        if (key.equals("1")) {
            StudentMenu2 sm = new StudentMenu2();
            sm.menu();
        } else {
            System.exit(0);
        }

        sc.close();
    }

    public static void saveStudent(String id, String name, int age, String email, String course) {
        studentID[count] = id;
        studentName[count] = name;
        studentAge[count] = age;
        studentEmail[count] = email;
        studentCourse[count] = course;
        count++;
        System.out.println("THE STUDENT DETAILS HAVE BEEN SUCCESSFULLY SAVED");
    }
    
    public static void askSearchStudent(){
        Scanner sc6 = new Scanner(System.in);

        System.out.println("Enter the student id to search:");
        String searchID = sc6.next();
        System.out.println("--------------------------------------------------");
        
        searchStudent(searchID);
        
        sc6.close();
    }

    public static void searchStudent(String searchID) {
        Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i < count; i++) {
            if (studentID[i].equals(searchID)) {
                System.out.println("STUDENT ID: " + studentID[i]);
                System.out.println("STUDENT NAME: " + studentName[i]);
                System.out.println("STUDENT AGE: " + studentAge[i]);
                System.out.println("STUDENT EMAIL: " + studentEmail[i]);
                System.out.println("STUDENT COURSE: " + studentCourse[i]);
                System.out.println("--------------------------------------------------");
                break;
            } else {
                System.out.println("Sudent with Student Id: " + searchID + " was not found!");
                System.out.println("--------------------------------------------------");
            }
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");
        String key = sc2.next();

        if (key.equals("1")) {
            StudentMenu2 sm = new StudentMenu2();
            sm.menu();
        } else {
            System.exit(0);
        }

        sc2.close();
    }

    public static void deleteStudent() {
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Enter the student id to delete:");
        String deleteID = sc3.next();
        System.out.println("Are you sure you want to studeent 10111 from the system? Yes (y) to delete.");
        String choice = sc3.next();
        if (choice.equals("y")) {
            for (int i = 0; i < count; i++) {
                if (studentID[i].equals(deleteID)) {
                    for (int j = i; j < count; j++) {
                        studentID[j] = studentID[j + 1];
                        studentName[j] = studentName[j + 1];
                        studentAge[j] = studentAge[j + 1];
                        studentEmail[j] = studentEmail[j + 1];
                        studentCourse[j] = studentCourse[j + 1];
                        count = count - 1;
                    }
                }
            }
            System.out.println("Student with student Id: " + deleteID + " WAS deleted!");
        } else {
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String key = sc3.next();

            if (key.equals("1")) {
                StudentMenu2 sm = new StudentMenu2();
                sm.menu();
            } else {
                System.exit(0);
            }
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");
        String key2 = sc3.next();

        if (key2.equals("1")) {
            StudentMenu2 sm = new StudentMenu2();
            sm.menu();
        } else {
            System.exit(0);
        }
        sc3.close();
    }

    public static void studentReport() {
        for (int i = 0; i < count; i++) {
            System.out.println("STUDENT " + (i + 1));
            System.out.println("-------------------------------------------------");

            System.out.println("STUDENT ID: " + studentID[i]);
            System.out.println("STUDENT NAME: " + studentName[i]);
            System.out.println("STUDENT AGE: " + studentAge[i]);
            System.out.println("STUDENT EMAIL: " + studentEmail[i]);
            System.out.println("STUDENT COURSE: " + studentCourse[i]);
            System.out.println("-------------------------------------------------");
        }
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String key2 = sc4.next();

        if (key2.equals("1")) {
            StudentMenu2 sm = new StudentMenu2();
            sm.menu();
        } else {
            System.exit(0);
        }
        sc4.close();
    }

    public static void updateStudent() {
        Scanner sc5 = new Scanner(System.in);

        System.out.println("Enter the student id you would like to update:");
        String updateID = sc5.next();

        for (int i = 0; i < count; i++) {
            if (studentID[i].equals(updateID)) {
                System.out.println("Enter the new student ID:");
                String id = sc5.next();

                System.out.println("Enter the new student name:");
                String name = sc5.next();

                System.out.println("Enter the new student age:");
                int age;
                try {
                    age = sc5.nextInt();

                    if (!checkAge(age)) {
                        System.out.println("You have entered an incorrect student age!!!");
                        System.out.println("Please re-enter the student age >>");
                        age = sc5.nextInt();
                    }

                } catch (Exception e) {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.println("Please re-enter the student age >>");
                    age = sc5.nextInt();
                }

                System.out.println("Enter the new student email:");
                String email = sc5.next();

                System.out.println("Enter the new student course:");
                String course = sc5.next();

                studentID[i] = id;
                studentName[i] = name;
                studentAge[i] = age;
                studentEmail[i] = email;
                studentCourse[i] = course;

            } else if (!(studentID[i].equals(updateID))) {
                System.out.println("Student with student ID: " + updateID + " was not found!");
            }
        }

        System.out.println("Enter (1) to launch menu or any other key to exit");
        String key2 = sc5.next();

        if (key2.equals("1")) {
            StudentMenu2 sm = new StudentMenu2();
            sm.menu();
        } else {
            System.exit(0);
        }

        sc5.close();
    }

    public static boolean checkAge(int age) {
        boolean check = false;

        if (age >= 16) {
            check = true;
        } else if (age < 16) {
            check = false;
        }

        return check;
    }

}
