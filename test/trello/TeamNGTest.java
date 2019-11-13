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

        test_team = new Team("test");
        test_team.adduser("hassan");
        test_team.adduser("xbot");
        //date for cards
        Date date = new Date();

        //create mock cards and lists to initialize ListsIncluded member
        Card c1 = new Card("c1", date, "TESTING");
        Card c2 = new Card("c2", date, "TESTING");
        List l1 = new List("l1");
        l1.addcard(c1);
        l1.addcard(c2);
        Card c3 = new Card("c3", date, "TESTING");
        Card c4 = new Card("c4", date, "TESTING");
        List l2 = new List("l2");
        l2.addcard(c3);
        l2.addcard(c4);
        test_team.addlist(l1);
        test_team.addlist(l2);

    }

    @Test
    public void testIspresentmember() {
        Assert.assertTrue(test_team.ispresentmember("xbot"));
        Assert.assertFalse(test_team.ispresentmember("fail"));
        System.out.println("IsPresentMember");

    }

    @Test
    public void testIsprelist() {
        Assert.assertTrue(test_team.isprelist("l2"));
        Assert.assertFalse(test_team.isprelist("fail"));
        System.out.println("IsPreList");
    }

    //DEPENDENT ON LIST.JAVA isprecard() FUNCTION
    @Test
    public void testIsprecard() {

        System.out.println("isprecard");
        String x = "l1";
        String y = "c1";
        //Assert true and false on every condition
        boolean expResult = true;
        boolean result = test_team.isprecard(x, y);
        Assert.assertFalse(test_team.isprecard("fail", y));
        Assert.assertFalse(test_team.isprecard(x, "fail"));
        assertEquals(result, expResult);

    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Assert.assertTrue(test_team.getName().equals("test"));
        Assert.assertFalse(test_team.getName().equals("xbot"));
    }

    //Dependent on List.java getname()
    @Test
    public void testGetLists() {
        ArrayList<List> local = new ArrayList();
        System.out.println("getLists");
        boolean result = false, false_condition = true;

        //test_team has two lists initialized (l1 & l2)
        if (local.size() == 2 && local.get(0).getname().equals("l1") && local.get(1).getname().equals("l2"));
        {
            result = true;
        }
        if (local.size() == 5 && local.get(0).getname().equals("fail") && local.get(1).getname().equals("fail"));
        {
            false_condition = false;
        }
        Assert.assertTrue(result);
        Assert.assertFalse(false_condition);
    }

    @Test
    public void testGetmembers() {
        System.out.println("getmembers");
        ArrayList<String> local = new ArrayList();
        boolean result = false, false_condition = true;

        //test_team has two lists initialized (l1 & l2)
        if (local.size() == 2 && local.get(0).equals("hassan") && local.get(1).equals("xbot"));
        {
            result = true;
        }
        if (local.size() == 5 && local.get(0).equals("fail") && local.get(1).equals("fail"));
        {
            false_condition = false;
        }
        Assert.assertTrue(result);
        Assert.assertFalse(false_condition);
    }

    //redundant function with isMember()
    @Test
    public void testIspresent() {
        System.out.println("ispresent");
        Assert.assertTrue(test_team.ispresent("xbot"));
        Assert.assertFalse(test_team.ispresent("fail"));
    }

    //donot run before other member dependent function 
    //bcz adding a new member in it
    @Test(dependsOnMethods = {"testIspresentmember"})
    public void testAdduser() {
        System.out.println("adduser");
        test_team.adduser("momin");
        Assert.assertTrue(test_team.ispresentmember("xbot"));
        Assert.assertFalse(test_team.ispresentmember("fail"));

    }

    @Test(dependsOnMethods = {"testIsprelist"})
    public void testAddlist() {
        System.out.println("addlist");
        List local = new List("check");
        test_team.addlist(local);
        test_team.isprelist("check");
        Assert.assertTrue(test_team.isprelist("check"));
        Assert.assertFalse(test_team.isprelist("fail"));
    }
}
