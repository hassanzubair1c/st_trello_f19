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
public class Team {

    private ArrayList<List> ListsIncluded;
    private ArrayList<String> AllUsers;
    private String name;

    public Team(String n) {
        ListsIncluded = new ArrayList<List>();
        AllUsers = new ArrayList<String>();
        name = n;

    }

    public boolean ispresentmember(String x) {
        for (int i = 0; i < AllUsers.size(); i++) {
            if (AllUsers.get(i).equals(x)) {
                return true;
            }
        }
        return false;
    }

    boolean isprelist(String x) {
        for (int i = 0; i < ListsIncluded.size(); i++) {
            if (ListsIncluded.get(i).getname().equals(x)) {
                return true;
            }
        }
        return false;
    }

    boolean isprecard(String x, String y) {
        for (int i = 0; i < ListsIncluded.size(); i++) {
            if (ListsIncluded.get(i).getname().equals(x)) {
                return ListsIncluded.get(i).isprescard(y);
            }
        }
        return false;
    }

    boolean CreateList() {
        boolean flag = false;

        return flag;
    }

    public String getName() {
        return name;
    }

    public ArrayList<List> getLists() {
        return ListsIncluded;
    }

    public ArrayList<String> getmembers() {
        return AllUsers;
    }

    public boolean ispresent(String x) {
        return AllUsers.contains(x);
    }

    public void adduser(String x) {
        AllUsers.add(x);
    }

    public void addlist(List l) {
        ListsIncluded.add(l);
    }

    boolean InviteMember() {
        boolean flag = false;

        return flag;
    }

    boolean SearchCards() {
        boolean flag = false;

        return flag;
    }

}
