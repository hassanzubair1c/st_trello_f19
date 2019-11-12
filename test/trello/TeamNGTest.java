/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;
import java.util.ArrayList;
import java.util.Date;
import org.testng.Assert;
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
    
    private static Team test_team;
    private static Card card;

    
    public TeamNGTest() {
    }

    //depend on card class constructor
    //depend on List class constructor
    //depend on Team class constructor
    //depend on team class addList function
    //depend on team class addUser function
    //depend on card class addCard function
    @BeforeClass
    public static void setUpClass() throws Exception {
       //mock users
        
        test_team=new Team("test");
        test_team.adduser("hassan");
        test_team.adduser("xbot");
        //date for cards
        Date date = new Date(); 
        
        //create mock cards and lists to initialize ListsIncluded member
        Card c1=new Card("c1", date, "TESTING");
        Card c2=new Card("c2", date, "TESTING");
        List l1=new List("l1");
        l1.addcard(c1);
        l1.addcard(c2);
        Card c3=new Card("c3", date, "TESTING");
        Card c4=new Card("c4", date, "TESTING");
        List l2=new List("l2");
        l2.addcard(c3);
        l2.addcard(c4);
        test_team.addlist(l1);
        test_team.addlist(l2);
        
        
        
    }

    @Test
    public void testIspresentmember() {
        Assert.assertTrue(test_team.ispresent("xbot"));
        System.out.println("IsPresentMember");
       
    }

    
    @Test
    public void testIsprelist() {
        Assert.assertTrue(test_team.isprelist("l2"));
        System.out.println("IsPreList");
    }

    //DEPENDENT ON LIST.JAVA isprecard() FUNCTION
    @Test
    public void testIsprecard() {
        
        System.out.println("isprecard");
        String x = "l1";
        String y = "c1";
        boolean expResult = true;
        boolean result = test_team.isprecard(x, y);
        assertEquals(result, expResult);
        
        
    }

//    *************************************STOP******************************************
    /*
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

    
    @Test
    public void testAdduser() {
        System.out.println("adduser");
        String x = "";
        Team instance = null;
        instance.adduser(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testAddlist() {
        System.out.println("addlist");
        List l = null;
        Team instance = null;
        instance.addlist(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
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
  */
}
