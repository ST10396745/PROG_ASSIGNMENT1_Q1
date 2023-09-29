/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package studentmenu2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willi
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of captureDetails method, of class Student.
     */
    @Test
    public void testCaptureDetails() {
        System.out.println("captureDetails");
        Student.captureDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        String id = "7";
        String name = "Wills";
        int age = 19;
        String email = "William@rokwil.com";
        String course = "BCAD";
        Student.saveStudent(id, name, age, email, course);
        assertEquals(id, Student.studentID[0]);
        assertEquals(name, Student.studentName[0]);
        assertEquals(age, Student.studentAge[0]);
        assertEquals(email, Student.studentEmail[0]);
        assertEquals(course, Student.studentCourse[0]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        String id = "7";
        String name = "Wills";
        int age = 19;
        String email = "William@rokwil.com";
        String course = "BCAD";
        String searchID = "7";
        Student.saveStudent(id, name, age, email, course);
        Student.searchStudent(searchID);
        assertEquals(searchID, Student.studentID[0]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student.deleteStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of studentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
        System.out.println("studentReport");
        Student.studentReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudent method, of class Student.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student.updateStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAge method, of class Student.
     */
    @Test
    public void testStudentkAge_StudentAgeValid() {
        System.out.println("checkAge");
        int age = 19;
        boolean expResult = true;
        boolean result = Student.checkAge(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkAge method, of class Student.
     */
    @Test
    public void testStudentkAge_StudentAgeInvalid() {
        System.out.println("checkAge");
        int age = 10;
        boolean expResult = false;
        boolean result = Student.checkAge(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
