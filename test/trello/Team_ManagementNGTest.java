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
 * @author Saud
 */
public class Team_ManagementNGTest {
        private static Team team;
    private static ArrayList<Team> tm;
    private static List list;
    private static Card card;
    private static Date date=new Date();
    @BeforeClass
    public static void setUpClass() throws Exception {
  
       card=new Card("c1",date,"testing");
       list=new List("myList");
       list.addcard(card);
       team=new Team("myTeam");
       team.addlist(list);
       tm=new ArrayList<Team>();
       tm.add(team);
    }

    /**
     * Test of NamesCardinlistinteam method, of class Team_Management.
     */
    @Test
    public void testNamesCardinlistinteam() {
        System.out.println("NamesCardinlistinteam");
        Card card2=new Card("c2",date,"testing2");
       list.addcard(card2);
        Assert.assertTrue(tm.get(0).getLists().get(0).getcards().get(1).getname().equals("c2"));
        Assert.assertFalse(tm.get(0).getLists().get(0).getcards().get(1).getname().equals("fail"));
    }

    

   
    @Test
    public void testAssignmember() {
        System.out.println("assignmember");
         tm.get(0).getLists().get(0).getcards().get(0).addmemberTocard("mem1");
         Assert.assertTrue(tm.get(0).getLists().get(0).getcards().get(0).getmembersassigned().contains("mem1"));
         Assert.assertFalse(tm.get(0).getLists().get(0).getcards().get(0).getmembersassigned().contains("fail"));
    }

    

   
    @Test
    public void testNamesteamsjoined() {
        System.out.println("Namesteamsjoined");
         Assert.assertTrue(tm.get(0).getName().contains("myTeam"));
        Assert.assertFalse(tm.get(0).getName().contains("fail"));
    }

   

   
    @Test
    public void testIspresentcard() {
        System.out.println("ispresentcard");
        Assert.assertTrue(tm.get(0).getLists().get(0).getcards().get(0).getname().equals("c1"));
        Assert.assertFalse(tm.get(0).getLists().get(0).getcards().get(0).getname().equals("fail"));
    }

    @Test
    public void testAddchecklist() {
        System.out.println("addchecklist");
       tm.get(0).getLists().get(0).getcards().get(0).addchecklisttocard("ch1");
       Assert.assertTrue(tm.get(0).getLists().get(0).getcards().get(0).getchecklist().contains("ch1"));
         Assert.assertFalse(tm.get(0).getLists().get(0).getcards().get(0).getchecklist().contains("fail"));
    }
}