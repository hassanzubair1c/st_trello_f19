/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.util.ArrayList;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author l134328
 */
public class ListNGTest {
    private static List test_list ;
    public ListNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        test_list=new List("ak");
        Card c1 =new Card("test");
        test_list.addcard(c1);
    }

    

    
    @Test
    public void testIsprescard() {
        System.out.println("isprescard");
        
        Assert.assertTrue(test_list.isprescard("test"));
        Assert.assertFalse(test_list.isprescard("fail"));
    }

   
    @Test 
    public void testGetname() {
        System.out.println("getname");
        Assert.assertTrue(test_list.getname().equals("ak"));
        Assert.assertFalse(test_list.getname().equals("fail"));
    }

    
    @Test (priority=0,dependsOnMethods = {"testGetname"}) 
    public void testGetcards() {
        System.out.println("getcards");
       Assert.assertTrue(test_list.getcards().size()==1 && test_list.getcards().get(0).getname().equals("test"));
       Assert.assertFalse(test_list.getcards().size()==2 && test_list.getcards().get(0).getname().equals("fail"));
    }

   
    @Test (priority=1, dependsOnMethods = {"testGetname", "testGetcards"})
    public void testAddcard() {
        System.out.println("addcard");
        Card cards= new Card("local");
        test_list.addcard(cards);
       Assert.assertTrue(test_list.getcards().size()==2 && test_list.getcards().get(1).getname().equals("local"));
       Assert.assertFalse(test_list.getcards().size()==3 && test_list.getcards().get(1).getname().equals("fail"));
    }

   
    
}
