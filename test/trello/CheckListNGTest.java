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
    public void testaddItem() {
        System.out.println("addItem");
        test.addItem("test");
        Assert.assertTrue(test.itemsIncluded.size()==1&&test.itemsIncluded.get(0).name.equals("test"));
        Assert.assertFalse(test.itemsIncluded.size()==2&&test.itemsIncluded.get(0).name.equals("fail"));
    }
    
}
