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

    private ArrayList<CheckList> CheckListIncluded;
    public ArrayList<String> MembersAssigned;
    private Date DueDate;
    private String Description;
    private ArrayList<String> Comments;
    private String name;

    public Card(String n, Date dd, String des) {
        CheckListIncluded = new ArrayList<CheckList>();
        MembersAssigned = new ArrayList<String>();
        Comments = new ArrayList<String>();
        DueDate = dd;
        Description = des;
        name = n;
    }

    public Card(String n) {
        CheckListIncluded = new ArrayList<CheckList>();
        MembersAssigned = new ArrayList<String>();
        name = n;
    }

    public void addchecklisttocard(String x) {
        CheckList cl = new CheckList(x);
        CheckListIncluded.add(cl);
    }

    public ArrayList<String> getchecklist() {
        ArrayList<String> c1 = new ArrayList<>();
        for (int i = 0; i < CheckListIncluded.size(); i++) {
            c1.add(CheckListIncluded.get(i).name);
        }

        return c1;
    }

    boolean isassigned(String x) {
        boolean flag = false;
        for (int i = 0; i < MembersAssigned.size(); i++) {
            if (MembersAssigned.get(i).equals(x)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public ArrayList<CheckList> getchecklist2() {
        return CheckListIncluded;
    }

    boolean AddCheckList() {
        boolean flag = false;

        return flag;
    }

    public ArrayList<String> getmembersassigned() {
        return MembersAssigned;
    }

    public String getname() {
        return name;
    }

    boolean AddDueDate() {
        boolean flag = false;

        return flag;
    }

    boolean AddDescription() {
        boolean flag = false;

        return flag;
    }

    public void addmemberTocard(String x) {
        MembersAssigned.add(x);
    }

    boolean AssignToMember() {
        boolean flag = false;

        return flag;
    }
}
