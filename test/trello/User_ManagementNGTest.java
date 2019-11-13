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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Momin
 */
public class User_ManagementNGTest {

    private static User_Management um;

    public User_ManagementNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        um = new User_Management();
        User u1 = new User("momin", "123456", "momin.guner@gmail.com");
        User u2 = new User("hassan", "123456", "hassan.guner@gmail.com");
        um.AddUser(u1);
        um.AddUser(u2);

    }

    /**
     * Test of getInstance method, of class User_Management.
     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        User_Management expResult = null;
//        User_Management result = User_Management.getInstance();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of CheckEmail method, of class User_Management.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("CheckEmail");

        Assert.assertTrue(um.CheckEmail("momin.guner@gmail.com"));

    }

    /**
     * Test of CheckUsername method, of class User_Management.
     */
    @Test
    public void testCheckUsername() {

        Assert.assertTrue(um.CheckUsername("momin"));
        System.out.println("CheckUsername");
    }

    /**
     * Test of getPassword method, of class User_Management.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");

        String dummyPassword;
        dummyPassword = um.getPassword("momin.guner@gmail.com");

        Assert.assertTrue(dummyPassword.equals("123456"));

    }

    /**
     * Test of getUsername method, of class User_Management.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");

        String dummyUserName;
        dummyUserName = um.getUsername("momin.guner@gmail.com");

        Assert.assertTrue(dummyUserName.equals("momin"));

    }

    /**
     * Test of CheckLogin method, of class User_Management.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("CheckLogin");

        String dummyPassword;
        dummyPassword = um.getPassword("momin.guner@gmail.com");

        String dummyUserName;
        dummyUserName = um.getUsername("momin.guner@gmail.com");

        Assert.assertFalse(um.CheckLogin(dummyUserName, dummyPassword));

    }
//
//    /**
//     * Test of update method, of class User_Management.
//     */

    @Test
    public void testUpdate() {

        String dummyEmail;
        dummyEmail = um.getEmail("momin.guner@gmail.com");
        String newPass = "654321";
        String newName = "nimom";

        Assert.assertTrue(um.update(dummyEmail, newName, newPass));

    }

//    /**
//     * Test of AddUser method, of class User_Management.
//     */
    @Test(dependsOnMethods = {"testCheckUsername"})
    public void testAddUser() {
        System.out.println("AddUser");

        User u3 = new User("abdul", "123456", "abdul.guner@gmail.com");
        um.AddUser(u3);

        Assert.assertTrue(um.CheckUsername("abdul"));

    }

    /**
     * Test of getUsersRegistered method, of class User_Management.
     */
    @Test
    public void testGetUsersRegistered() {

        int size = 2;
        String name1 = "momin";
        String name2 = "hassan";
        boolean testPass = false;

        if (um.getUsersRegistered().get(0).getName().equals(name1) && um.getUsersRegistered().get(1).getName().equals(name2) == true) {
            testPass = true;
        } else if (um.getUsersRegistered().get(0).getName().equals(name1) && um.getUsersRegistered().get(1).getName().equals(name2) == false) {
            testPass = false;
        }

        Assert.assertTrue(testPass);

    }

}
