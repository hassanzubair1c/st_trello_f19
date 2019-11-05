/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hassan X-BOT
 */
public class CardNGTest {
    
    public CardNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of addchecklisttocard method, of class Card.
     */
    @Test
    public void testAddchecklisttocard() {
        System.out.println("addchecklisttocard");
        String x = "";
        Card instance = null;
        instance.addchecklisttocard(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getchecklist method, of class Card.
     */
    @Test
    public void testGetchecklist() {
        System.out.println("getchecklist");
        Card instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getchecklist();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isassigned method, of class Card.
     */
    @Test
    public void testIsassigned() {
        System.out.println("isassigned");
        String x = "";
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isassigned(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getchecklist2 method, of class Card.
     */
    @Test
    public void testGetchecklist2() {
        System.out.println("getchecklist2");
        Card instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getchecklist2();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddCheckList method, of class Card.
     */
    @Test
    public void testAddCheckList() {
        System.out.println("AddCheckList");
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.AddCheckList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmembersassigned method, of class Card.
     */
    @Test
    public void testGetmembersassigned() {
        System.out.println("getmembersassigned");
        Card instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getmembersassigned();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class Card.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        Card instance = null;
        String expResult = "";
        String result = instance.getname();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddDueDate method, of class Card.
     */
    @Test
    public void testAddDueDate() {
        System.out.println("AddDueDate");
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.AddDueDate();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddDescription method, of class Card.
     */
    @Test
    public void testAddDescription() {
        System.out.println("AddDescription");
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.AddDescription();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addmemberTocard method, of class Card.
     */
    @Test
    public void testAddmemberTocard() {
        System.out.println("addmemberTocard");
        String x = "";
        Card instance = null;
        instance.addmemberTocard(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AssignToMember method, of class Card.
     */
    @Test
    public void testAssignToMember() {
        System.out.println("AssignToMember");
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.AssignToMember();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
