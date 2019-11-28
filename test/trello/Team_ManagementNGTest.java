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
public class Team_ManagementNGTest {


    private static Team_Management tmm;
    private static Team team;
    private static ArrayList<Team> tm;
    private static List list;
    private static Card card;
    private static Date date=new Date();
     private static User u1;
    public Team_ManagementNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        tmm = new Team_Management();
       // Team t1 = new Team("team1");
        //Team t2 = new Team("team2");
        tmm.addTeam("team1");
        tmm.addTeam("team2");
        tmm.addlist("team1", "list1");
        tmm.addcard("team1", "list1", "card1");
        tmm.addchecklist("team1", "list1", "card1", "checklist1");
       
//        User u1 = new User("momin", "123456","momin.guner@gmail.com");
//        User u2 = new User("hassan", "123456","hassan.guner@gmail.com");
//        Card c1 = new Card("c1");
//        List l1 = new List("list1");
//         CheckList CL1 = new CheckList("clist1");
        //xbot
        card=new Card("c1",date,"testing");
        card.addchecklisttocard("cl1");

        
        u1 = new User("momin", "123456","momin.guner@gmail.com");
        card.addmemberTocard(u1.getName());
        list=new List("myList");
        list.addcard(card);
       team=new Team("myTeam");
       team.addlist(list);
       
       tm=new ArrayList<Team>();
       tm.add(team);
       
        
    }

    @Test
    public void testGetchecklist() {
        System.out.println("getchecklist");
        //System.out.println("Size: "+tmm.getchecklist("team1", "list1", "c1").size());
        Assert.assertTrue(tmm.getchecklist("team1", "list1", "card").size()==0);
        Assert.assertFalse(tmm.getchecklist("team1", "list1", "c1").size()==8);
    }
    
    @Test
    public void testGetitems() {
        System.out.println("getitems");
        //System.out.println("Size: "+tmm.getitems("team1", "list1", "c1", "clist1").size()==0);
        Assert.assertTrue(tmm.getitems("team1", "list1", "c1", "clist1").size()==0);
        Assert.assertFalse(tmm.getitems("team1", "list1", "c1", "clist1").size()==8);
    }
    
    @Test 
    public void testAddTeam() {
        System.out.println("addTeam");
        tmm.addTeam("test");
        //System.out.println("Size: "+tmm.getTeam(1).getName());
        Assert.assertTrue(tmm.getTeam(1).getName().equals("team2"));
        Assert.assertFalse(tmm.getTeam(1).getName().equals("fail"));
    }
    
    @Test 
    public void testAddintoTeam() {
        
        System.out.println("addintoTeam");
        tmm.addintoTeam("team1","jalal");

        Assert.assertTrue(tmm.getTeam(0).getmembers().size()==1);
        Assert.assertFalse(tmm.getTeam(0).getmembers().size()==0);
    }
    
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        Assert.assertTrue(tmm.getTeam(0).getName().equals("team1") && tmm.getTeam(1).getName().equals("team2"));
        Assert.assertFalse(tmm.getTeam(0).getName().equals("fail") && tmm.getTeam(1).getName().equals("fail"));

    }

    @Test
    public void testGettotalteams() {
        System.out.println("gettotalteams");
        Assert.assertTrue(tmm.gettotalteams()==3);
        Assert.assertFalse(tmm.gettotalteams()==0);
    }
       
    @Test
    public void testTeamsjoined() {
        System.out.println("teamsjoined : ");
        Assert.assertTrue(tmm.teamsjoined("jalal")==1);
        Assert.assertFalse(tmm.teamsjoined("fail")==6);
    }
   
    @Test
    public void testGetmembers() {
        System.out.println("getmembers: ");
        
        Assert.assertTrue(tmm.getmembers("team1").size()==1);
        Assert.assertFalse(tmm.getmembers("team1").size()==5);
    }
    
}
