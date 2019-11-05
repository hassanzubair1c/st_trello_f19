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
public class TeamNGTest {
    
    public TeamNGTest() {
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
     * Test of ispresentmember method, of class Team.
     */
    @Test
    public void testIspresentmember() {
        System.out.println("ispresentmember");
        String x = "";
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.ispresentmember(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isprelist method, of class Team.
     */
    @Test
    public void testIsprelist() {
        System.out.println("isprelist");
        String x = "";
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.isprelist(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isprecard method, of class Team.
     */
    @Test
    public void testIsprecard() {
        System.out.println("isprecard");
        String x = "";
        String y = "";
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.isprecard(x, y);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateList method, of class Team.
     */
    @Test
    public void testCreateList() {
        System.out.println("CreateList");
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.CreateList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Team.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Team instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLists method, of class Team.
     */
    @Test
    public void testGetLists() {
        System.out.println("getLists");
        Team instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getLists();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmembers method, of class Team.
     */
    @Test
    public void testGetmembers() {
        System.out.println("getmembers");
        Team instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getmembers();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispresent method, of class Team.
     */
    @Test
    public void testIspresent() {
        System.out.println("ispresent");
        String x = "";
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.ispresent(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adduser method, of class Team.
     */
    @Test
    public void testAdduser() {
        System.out.println("adduser");
        String x = "";
        Team instance = null;
        instance.adduser(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addlist method, of class Team.
     */
    @Test
    public void testAddlist() {
        System.out.println("addlist");
        List l = null;
        Team instance = null;
        instance.addlist(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InviteMember method, of class Team.
     */
    @Test
    public void testInviteMember() {
        System.out.println("InviteMember");
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.InviteMember();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchCards method, of class Team.
     */
    @Test
    public void testSearchCards() {
        System.out.println("SearchCards");
        Team instance = null;
        boolean expResult = false;
        boolean result = instance.SearchCards();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
