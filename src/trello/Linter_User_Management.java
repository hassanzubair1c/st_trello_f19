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
public class Linter_User_Management {

    private static ArrayList<User> usersRegistered;
    private static Linter_User_Management instance = new Linter_User_Management();

   
    boolean checkEmail(String x) {
        boolean flag = false;
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getEmail().equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    boolean checkUsername(String x) {
        boolean flag = false;
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getName().equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    boolean checkLogin(String x, String y) {
        boolean flag = false;
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getEmail().equals(x)) {
                if (usersRegistered.get(i).getPassword().equals(y)) {

                    flag = true;

                }
                break;
            }
        }

        return flag;
    }

    boolean update(String em, String nm, String pw) {
        boolean flag = false;
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getEmail().equals(em)) {
                usersRegistered.get(i).setName(nm);
                usersRegistered.get(i).setPassword(pw);

                flag = true;

                break;
            }
        }
        return flag;
    }

    public Linter_User_Management() {
        usersRegistered = new ArrayList<User>();
    }

    public String getEmail(String x) {
        String y = "";
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getEmail().equals(x)) {
                y = usersRegistered.get(i).getEmail();
                break;
            }
        }
        return y;
    }

    public String getPassword(String x) {
        String y = "";
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getEmail().equals(x)) {
                y = usersRegistered.get(i).getPassword();
                break;
            }
        }
        return y;
    }

    public String getUsername(String x) {
        String y = "";
        for (int i = 0; i < usersRegistered.size(); i++) {
            if (usersRegistered.get(i).getEmail().equals(x)) {
                y = usersRegistered.get(i).getName();
                break;
            }
        }
        return y;
    }

    public ArrayList<User> getusersRegistered() {
        return usersRegistered;
    }

    private static void initum() {
    }

    void addUser(User u1) {

        usersRegistered.add(u1);

    }

}
