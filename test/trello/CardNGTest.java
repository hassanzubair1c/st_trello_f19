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
public class CardNGTest {
    private static Card card;
    public ArrayList<CheckList> arr1;
    public ArrayList<String> m1;
    public CardNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Date date=new Date();
       card=new Card("c1",date,"testing");
       card.addmemberTocard("mem1");
        
    }

    
    @Test
    public void testAddchecklisttocard() {
        System.out.println("addchecklisttocard");
        card.addchecklisttocard("ch1");
        Assert.assertTrue(card.getchecklist().contains("ch1"));
        Assert.assertFalse(card.getchecklist().contains("fail"));
    }

   
    @Test
    public void testGetchecklist() {
        System.out.println("getchecklist");
        Assert.assertTrue(card.getchecklist().size()==1&&card.getchecklist().contains("ch1"));
        Assert.assertFalse(card.getchecklist().size()==2&&card.getchecklist().contains("fail"));
    }

    @Test
    public void testIsassigned() {
        System.out.println("isassigned");
        Assert.assertTrue(card.isassigned("mem1"));
        Assert.assertFalse(card.isassigned("fail"));
    }

 
    @Test
    public void testGetchecklist2() {
        System.out.println("getchecklist2");
        arr1= card.getchecklist2();
        Assert.assertTrue(card.getchecklist2().size()==1 && arr1.get(0).name=="ch1");
        Assert.assertFalse(card.getchecklist2().size()==2&&arr1.get(0).name=="fail");
    }

    @Test
    public void testGetmembersassigned() {
        System.out.println("getmembersassigned");
        m1=card.getmembersassigned();
         Assert.assertTrue(card.getmembersassigned().size()==1 && m1.contains("mem1"));
        Assert.assertFalse(card.getmembersassigned().size()==2&& m1.contains("mem1"));
    }

   
    @Test
    public void testGetname() {
        System.out.println("getname");
        Assert.assertTrue(card.getname().equals("c1"));
        Assert.assertFalse(card.getname().equals("fail"));
    }


 
    @Test
    public void testAddmemberTocard() {
        System.out.println("addmemberTocard");
        Assert.assertTrue(card.getmembersassigned().contains("mem1"));
        Assert.assertFalse(card.getmembersassigned().contains("fail"));
    }

}
