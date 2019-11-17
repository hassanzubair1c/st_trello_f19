/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;


import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static trello.Team_Management.TeamsMade;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Momin
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
       
        User u1 = new User("momin", "123456","momin.guner@gmail.com");
        User u2 = new User("hassan", "123456","hassan.guner@gmail.com");
        Card c1 = new Card("c1");
        List l1 = new List("list1");
         CheckList CL1 = new CheckList("clist1");
        
        tmm.addcard("team1", "list1", "c1");

        card=new Card("c1",date,"testing");
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
    public void testMembersincardassigned() {
        System.out.println("membersincardassigned");
        String x = "myTeam";
        String x2 = "myList";
        String x3 = "c1";
        String expResult = "momin";
        ArrayList<String> result = new ArrayList<>();
        result = tmm.membersincardassigned(x, x2, x3);
                
                //membersincardassigned(x, x2, x3);
        
               // Assert.assertTrue(result.contains("momin"));
        Assert.assertFalse(result.contains(expResult));
        
        
    }
    @Test
    public void testNamesCardsAssigned() {
        System.out.println("NamesCardsAssigned");
        String x = "myTeam";
        ArrayList result = tmm.NamesCardsAssigned(x);
       ArrayList<String> expectedRes = new ArrayList<>();
       
       Assert.assertEquals(result, expectedRes);
        
    }
    @Test
    public void testIspresentlist() {
        System.out.println("ispresentlist");
        String x = "team2";
        String y = "list1";
        boolean result = tmm.ispresentlist(x, y);
        boolean expResult = false;
        
        assertEquals(result, expResult);
        
    }
    @Test
    public void testAddlist() {
        System.out.println("addlist");
        String x = "team1";
        String y = "team3";
        tmm.addlist(x,y);
        
        
        
        
        
        Assert.assertFalse("team3".equals(tmm.TeamsMade.get(1).getName()));
    }

    @Test
    public void testAdditem() {
        System.out.println("additem");
        String x = "team1";
        String y = "list1";
        String z = "card1";
        String a = "clist1";
        String b = "item1";
        
        tmm.additem(x, y, z, a, b);
       
        String expResult = "team1";
        
        
        
        assertEquals(tmm.TeamsMade.get(0).getName(), expResult);
        
    }
   
}