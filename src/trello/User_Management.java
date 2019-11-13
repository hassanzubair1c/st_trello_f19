/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ubaidullah
 */
public class User_Management {

    private static ArrayList<User> UsersRegistered;
    private static User_Management instance = new User_Management();

    public static User_Management getInstance() {
        UsersRegistered = new ArrayList<User>();

        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            Connection myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            Statement myStatement = myConnection.createStatement();
            ResultSet myResult = myStatement.executeQuery("Select * from Users ");
            while (myResult.next()) {
                User u = new User(myResult.getString(2), myResult.getString(3), myResult.getString(1));
                //System.out.println(myResult.getString(2)+"       "+myResult.getString(3)+"       "+myResult.getString(1));
                UsersRegistered.add(u);

                //System.out.println(myResult.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instance;
    }

    boolean CheckEmail(String x) {
        boolean flag = false;
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getEmail().equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    boolean CheckUsername(String x) {
        boolean flag = false;
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getName().equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    boolean CheckLogin(String x, String y) {
        boolean flag = false;
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getEmail().equals(x)) {
                if (UsersRegistered.get(i).getPassword().equals(y)) {

                    flag = true;

                }
                break;
            }
        }

        return flag;
    }

    boolean update(String em, String nm, String pw) {
        boolean flag = false;
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getEmail().equals(em)) {
                UsersRegistered.get(i).setName(nm);
                UsersRegistered.get(i).setPassword(pw);

                flag = true;

                break;
            }
        }
        return flag;
    }

    public User_Management() {
        UsersRegistered = new ArrayList<User>();
    }

    public String getEmail(String x) {
        String y = "";
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getEmail().equals(x)) {
                y = UsersRegistered.get(i).getEmail();
                break;
            }
        }
        return y;
    }

    public String getPassword(String x) {
        String y = "";
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getEmail().equals(x)) {
                y = UsersRegistered.get(i).getPassword();
                break;
            }
        }
        return y;
    }

    public String getUsername(String x) {
        String y = "";
        for (int i = 0; i < UsersRegistered.size(); i++) {
            if (UsersRegistered.get(i).getEmail().equals(x)) {
                y = UsersRegistered.get(i).getName();
                break;
            }
        }
        return y;
    }

    public ArrayList<User> getUsersRegistered() {
        return UsersRegistered;
    }

    private static void initum() {
    }

    void AddUser(User u1) {

        UsersRegistered.add(u1);

    }

}
