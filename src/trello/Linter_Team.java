/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.util.ArrayList;

/**
 *
 * @author ubaidullah
 */
public class Linter_Team {

    private ArrayList<List> listsIncluded;
    private ArrayList<String> allUsers;
    private String name;

    public Linter_Team(String n) {
        listsIncluded = new ArrayList<List>();
        allUsers = new ArrayList<String>();
        name = n;

    }

    public boolean ispresentmember(String x) {
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).equals(x)) {
                return true;
            }
        }
        return false;
    }

    boolean isprelist(String x) {
        for (int i = 0; i < listsIncluded.size(); i++) {
            if (listsIncluded.get(i).getname().equals(x)) {
                return true;
            }
        }
        return false;
    }

    boolean isprecard(String x, String y) {
        for (int i = 0; i < listsIncluded.size(); i++) {
            if (listsIncluded.get(i).getname().equals(x)) {
                return listsIncluded.get(i).isprescard(y);
            }
        }
        return false;
    }
//Not Required

//    boolean createList() {
//        boolean flag = false;
//
//        return flag;
//    }

    public String getName() {
        return name;
    }

    public ArrayList<List> getLists() {
        return listsIncluded;
    }

    public ArrayList<String> getmembers() {
        return allUsers;
    }
    //redundant function with isMember()

    public boolean ispresent(String x) {
        return allUsers.contains(x);
    }

    public void adduser(String x) {
        allUsers.add(x);
    }

    public void addlist(List l) {
        listsIncluded.add(l);
    }
//Not Required
/*
    boolean inviteMember() {
        boolean flag = false;

        return flag;
    }
//Not Required

    boolean searchCards() {
        boolean flag = false;

        return flag;
    }

}
*/