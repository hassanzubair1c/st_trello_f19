/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author A
 */
public class CheckListNGTest {
    
   private static CheckList test;
    public CheckListNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        test = new CheckList("hassan");
    }

      
    @Test
    public void testAddItem() {
        System.out.println("AddItem");
        test.AddItem("test");
        Assert.assertTrue(test.ItemsIncluded.size()==1&&test.ItemsIncluded.get(0).name=="test");
        Assert.assertFalse(test.ItemsIncluded.size()==2&&test.ItemsIncluded.get(0).name=="fail");
    }
    
}
