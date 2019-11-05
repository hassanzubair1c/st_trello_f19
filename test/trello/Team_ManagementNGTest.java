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
public class Team_ManagementNGTest {
    
    public Team_ManagementNGTest() {
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
     * Test of getinstancetillassignedmembers method, of class Team_Management.
     */
    @Test
    public void testGetinstancetillassignedmembers() {
        System.out.println("getinstancetillassignedmembers");
        Team_Management expResult = null;
        Team_Management result = Team_Management.getinstancetillassignedmembers();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getinstancetillchecklist method, of class Team_Management.
     */
    @Test
    public void testGetinstancetillchecklist() {
        System.out.println("getinstancetillchecklist");
        Team_Management expResult = null;
        Team_Management result = Team_Management.getinstancetillchecklist();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getchecklist method, of class Team_Management.
     */
    @Test
    public void testGetchecklist() {
        System.out.println("getchecklist");
        String x = "";
        String x2 = "";
        String x3 = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.getchecklist(x, x2, x3);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getitems method, of class Team_Management.
     */
    @Test
    public void testGetitems() {
        System.out.println("getitems");
        String x = "";
        String x2 = "";
        String x3 = "";
        String x4 = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.getitems(x, x2, x3, x4);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getinstancetillitems method, of class Team_Management.
     */
    @Test
    public void testGetinstancetillitems() {
        System.out.println("getinstancetillitems");
        Team_Management expResult = null;
        Team_Management result = Team_Management.getinstancetillitems();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getinstancetillcardnames method, of class Team_Management.
     */
    @Test
    public void testGetinstancetillcardnames() {
        System.out.println("getinstancetillcardnames");
        Team_Management expResult = null;
        Team_Management result = Team_Management.getinstancetillcardnames();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getinstancetillteamnames method, of class Team_Management.
     */
    @Test
    public void testGetinstancetillteamnames() {
        System.out.println("getinstancetillteamnames");
        Team_Management expResult = null;
        Team_Management result = Team_Management.getinstancetillteamnames();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getinstancetilllistnames method, of class Team_Management.
     */
    @Test
    public void testGetinstancetilllistnames() {
        System.out.println("getinstancetilllistnames");
        Team_Management expResult = null;
        Team_Management result = Team_Management.getinstancetilllistnames();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTeam method, of class Team_Management.
     */
    @Test
    public void testAddTeam() {
        System.out.println("addTeam");
        String x = "";
        Team_Management.addTeam(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addintoTeam method, of class Team_Management.
     */
    @Test
    public void testAddintoTeam() {
        System.out.println("addintoTeam");
        String x = "";
        String y = "";
        Team_Management instance = new Team_Management();
        instance.addintoTeam(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeam method, of class Team_Management.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        int x = 0;
        Team_Management instance = new Team_Management();
        Team expResult = null;
        Team result = instance.getTeam(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettotalteams method, of class Team_Management.
     */
    @Test
    public void testGettotalteams() {
        System.out.println("gettotalteams");
        int expResult = 0;
        int result = Team_Management.gettotalteams();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamsjoined method, of class Team_Management.
     */
    @Test
    public void testTeamsjoined() {
        System.out.println("teamsjoined");
        String x = "";
        Team_Management instance = new Team_Management();
        int expResult = 0;
        int result = instance.teamsjoined(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmembers method, of class Team_Management.
     */
    @Test
    public void testGetmembers() {
        System.out.println("getmembers");
        String x = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.getmembers(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NamesListinteam method, of class Team_Management.
     */
    @Test
    public void testNamesListinteam() {
        System.out.println("NamesListinteam");
        String x = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.NamesListinteam(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NamesCardinlistinteam method, of class Team_Management.
     */
    @Test
    public void testNamesCardinlistinteam() {
        System.out.println("NamesCardinlistinteam");
        String x = "";
        String x2 = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.NamesCardinlistinteam(x, x2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of membersincardassigned method, of class Team_Management.
     */
    @Test
    public void testMembersincardassigned() {
        System.out.println("membersincardassigned");
        String x = "";
        String x2 = "";
        String x3 = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.membersincardassigned(x, x2, x3);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignmember method, of class Team_Management.
     */
    @Test
    public void testAssignmember() {
        System.out.println("assignmember");
        String x = "";
        String x2 = "";
        String x3 = "";
        String x4 = "";
        Team_Management instance = new Team_Management();
        instance.assignmember(x, x2, x3, x4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispresentinteam method, of class Team_Management.
     */
    @Test
    public void testIspresentinteam() {
        System.out.println("ispresentinteam");
        String x = "";
        String x2 = "";
        Team_Management instance = new Team_Management();
        boolean expResult = false;
        boolean result = instance.ispresentinteam(x, x2);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Namesteamsjoined method, of class Team_Management.
     */
    @Test
    public void testNamesteamsjoined() {
        System.out.println("Namesteamsjoined");
        String x = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.Namesteamsjoined(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NamesCardsAssigned method, of class Team_Management.
     */
    @Test
    public void testNamesCardsAssigned() {
        System.out.println("NamesCardsAssigned");
        String x = "";
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.NamesCardsAssigned(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamsMade method, of class Team_Management.
     */
    @Test
    public void testGetTeamsMade() {
        System.out.println("getTeamsMade");
        Team_Management instance = new Team_Management();
        ArrayList expResult = null;
        ArrayList result = instance.getTeamsMade();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispresentteam method, of class Team_Management.
     */
    @Test
    public void testIspresentteam() {
        System.out.println("ispresentteam");
        String x = "";
        Team_Management instance = new Team_Management();
        boolean expResult = false;
        boolean result = instance.ispresentteam(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispresentlist method, of class Team_Management.
     */
    @Test
    public void testIspresentlist() {
        System.out.println("ispresentlist");
        String x = "";
        String y = "";
        Team_Management instance = new Team_Management();
        boolean expResult = false;
        boolean result = instance.ispresentlist(x, y);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispresentcard method, of class Team_Management.
     */
    @Test
    public void testIspresentcard() {
        System.out.println("ispresentcard");
        String x = "";
        String y = "";
        String z = "";
        Team_Management instance = new Team_Management();
        boolean expResult = false;
        boolean result = instance.ispresentcard(x, y, z);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addlist method, of class Team_Management.
     */
    @Test
    public void testAddlist() {
        System.out.println("addlist");
        String x = "";
        String y = "";
        Team_Management instance = new Team_Management();
        instance.addlist(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addcard method, of class Team_Management.
     */
    @Test
    public void testAddcard() {
        System.out.println("addcard");
        String x = "";
        String y = "";
        String z = "";
        Team_Management instance = new Team_Management();
        instance.addcard(x, y, z);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addchecklist method, of class Team_Management.
     */
    @Test
    public void testAddchecklist() {
        System.out.println("addchecklist");
        String x = "";
        String y = "";
        String z = "";
        String a = "";
        Team_Management instance = new Team_Management();
        instance.addchecklist(x, y, z, a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of additem method, of class Team_Management.
     */
    @Test
    public void testAdditem() {
        System.out.println("additem");
        String x = "";
        String y = "";
        String z = "";
        String a = "";
        String b = "";
        Team_Management instance = new Team_Management();
        instance.additem(x, y, z, a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
