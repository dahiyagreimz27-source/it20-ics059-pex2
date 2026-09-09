/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package studentlinkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class StudentLinkedListTest {
    
    public StudentLinkedListTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of append method, of class StudentLinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        int data = 0;
        StudentLinkedList instance = new StudentLinkedList();
        instance.append(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class StudentLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        int data = 0;
        StudentLinkedList instance = new StudentLinkedList();
        instance.addFirst(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class StudentLinkedList.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int key = 0;
        StudentLinkedList instance = new StudentLinkedList();
        boolean expResult = false;
        boolean result = instance.search(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class StudentLinkedList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int key = 0;
        StudentLinkedList instance = new StudentLinkedList();
        instance.delete(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class StudentLinkedList.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        StudentLinkedList instance = new StudentLinkedList();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
