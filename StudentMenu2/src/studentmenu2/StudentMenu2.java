/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmenu2;

import java.util.Scanner;

/**
 *
 * @author wills
 */
public class StudentMenu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("STUDENT MANAGMENT APPLICATION");
        System.out.println("********************************************");
        System.out.println("Enter (1) to launch menu or any othe key to exit");
        
        String key = sc.next();
        
        if (key.equals("1")) {
            menu();
        }else{
            System.exit(0);
        }
        
        sc.close();
    }
    
    public static void menu(){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new student.\n"
                + "(2) Search for a student.\n"
                + "(3) Delete a student.\n"
                + "(4) Print student report.\n"
                + "(5) Update student information\n"
                + "(6) Exit Application.");
        
        String key = sc.next();
        
        if (key.equals("1")) {
            Student s = new Student();
            s.captureDetails();
        }else if (key.equals("2")) {
            Student s = new Student();
            s.askSearchStudent();
        }else if (key.equals("3")) {
            Student s = new Student();
            s.deleteStudent();
        }else if (key.equals("4")) {
            Student s = new Student();
            s.studentReport();
        }else if (key.equals("5")) {
            Student s = new Student();
            s.updateStudent();
        }else{
            System.exit(0);
        }
        
        sc.close();
    }
    
}
