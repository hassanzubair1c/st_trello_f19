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
public class User_ManagementNGTest {
    
    public User_ManagementNGTest() {
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
     * Test of getInstance method, of class User_Management.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        User_Management expResult = null;
        User_Management result = User_Management.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckEmail method, of class User_Management.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("CheckEmail");
        String x = "";
        User_Management instance = new User_Management();
        boolean expResult = false;
        boolean result = instance.CheckEmail(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckUsername method, of class User_Management.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("CheckUsername");
        String x = "";
        User_Management instance = new User_Management();
        boolean expResult = false;
        boolean result = instance.CheckUsername(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User_Management.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String x = "";
        User_Management instance = new User_Management();
        String expResult = "";
        String result = instance.getPassword(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class User_Management.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String x = "";
        User_Management instance = new User_Management();
        String expResult = "";
        String result = instance.getUsername(x);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckLogin method, of class User_Management.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("CheckLogin");
        String x = "";
        String y = "";
        User_Management instance = new User_Management();
        boolean expResult = false;
        boolean result = instance.CheckLogin(x, y);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class User_Management.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String em = "";
        String nm = "";
        String pw = "";
        User_Management instance = new User_Management();
        boolean expResult = false;
        boolean result = instance.update(em, nm, pw);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsersRegistered method, of class User_Management.
     */
    @Test
    public void testGetUsersRegistered() {
        System.out.println("getUsersRegistered");
        User_Management instance = new User_Management();
        ArrayList expResult = null;
        ArrayList result = instance.getUsersRegistered();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddUser method, of class User_Management.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        User u1 = null;
        User_Management instance = new User_Management();
        instance.AddUser(u1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
