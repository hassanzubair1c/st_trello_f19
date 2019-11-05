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
public class ListNGTest {
    
    public ListNGTest() {
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
     * Test of isprescard method, of class List.
     */
    @Test
    public void testIsprescard() {
        System.out.println("isprescard");
        String x = "";
        List instance = null;
        boolean expResult = false;
        boolean result = instance.isprescard(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getname method, of class List.
     */
    @Test
    public void testGetname() {
        System.out.println("getname");
        List instance = null;
        String expResult = "";
        String result = instance.getname();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcards method, of class List.
     */
    @Test
    public void testGetcards() {
        System.out.println("getcards");
        List instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getcards();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addcard method, of class List.
     */
    @Test
    public void testAddcard() {
        System.out.println("addcard");
        Card c = null;
        List instance = null;
        instance.addcard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateCard method, of class List.
     */
    @Test
    public void testCreateCard() {
        System.out.println("CreateCard");
        List instance = null;
        boolean expResult = false;
        boolean result = instance.CreateCard();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MoveCard method, of class List.
     */
    @Test
    public void testMoveCard() {
        System.out.println("MoveCard");
        List instance = null;
        boolean expResult = false;
        boolean result = instance.MoveCard();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
