/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ubaidullah
 */
public class Card {

    private ArrayList<CheckList> checkListIncluded;
    public ArrayList<String> membersAssigned;

    private String name;

    public Card(String n, Date dd, String des) {
        checkListIncluded = new ArrayList<CheckList>();
        membersAssigned = new ArrayList<String>();
        name = n;
    }

    public Card(String n) {
        checkListIncluded = new ArrayList<CheckList>();
        membersAssigned = new ArrayList<String>();
        name = n;
    }

    public void addchecklisttocard(String x) {
        CheckList cl = new CheckList(x);
        checkListIncluded.add(cl);
    }

    public ArrayList<String> getchecklist() {
        ArrayList<String> c1 = new ArrayList<>();
        for (int i = 0; i < checkListIncluded.size(); i++) {
            c1.add(checkListIncluded.get(i).name);
        }

        return c1;
    }

    boolean isassigned(String x) {
        boolean flag = false;
        for (int i = 0; i < membersAssigned.size(); i++) {
            if (membersAssigned.get(i).equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public ArrayList<CheckList> getchecklist2() {
        return checkListIncluded;
    }

    boolean addCheckList() {
        boolean flag = false;

        return flag;
    }

    public ArrayList<String> getmembersassigned() {
        return membersAssigned;
    }

    public String getCardName() {
        return name;
    }

    boolean addDueDate() {
        boolean flag = false;

        return flag;
    }

    boolean addDescription() {
        boolean flag = false;

        return flag;
    }

    public void addmemberTocard(String x) {
        membersAssigned.add(x);
    }

    boolean assignToMember() {
        boolean flag = false;

        return flag;
    }
}
