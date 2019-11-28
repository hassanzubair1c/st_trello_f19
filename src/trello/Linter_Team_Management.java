/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;

/**
 *
 * @author ubaidullah
 */
public class Linter_Team_Management {

    public static ArrayList<Team> teamsMade;
    public final static Linter_Team_Management instance = new Linter_Team_Management();

    public Linter_Team_Management() {
        teamsMade = new ArrayList<>();
    }

//required

    public ArrayList<String> getchecklist(String x, String x2, String x3) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(teamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (teamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                for (int l = 0; l < teamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist().size(); l++) {
                                    y.add(teamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist().get(l));
                                }
                            }
                        }
                    }
                }
            }
        }
        return y;
    }
//required

    public ArrayList<String> getitems(String x, String x2, String x3, String x4) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(teamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (teamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                for (int l = 0; l < teamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().size(); l++) {
                                    if (x4.equals(teamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(l).name)) {
                                        for (int m = 0; m < teamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(l).ItemsIncluded.size(); m++) {
                                            y.add(teamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(l).ItemsIncluded.get(m).name);
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        return y;
    }

    
//required

    public static void addTeam(String x) {
        Team t = new Team(x);
        teamsMade.add(t);
    }
//required

    public void addintoTeam(String x, String y) {
        int index = -1;
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                index = i;
            }
        }
        if (index != -1) {
            teamsMade.get(index).adduser(y);
        }
    }
//required

    public Team getTeam(int x) {
        return teamsMade.get(x);
    }
//required

    public static int gettotalteams() {
        return teamsMade.size();
    }
//required

    public int teamsjoined(String x) {
        int index = 0;
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).ispresent(x)) {
                index++;
            }
        }
        return index;
    }
//required

    public ArrayList<String> getmembers(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                y = teamsMade.get(i).getmembers();
            }
        }
        return y;
    }
//required

    public ArrayList<String> namesListinteam(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    y.add(teamsMade.get(i).getLists().get(j).getname());
                }
            }
        }
        return y;
    }
//required

    public ArrayList<String> namesCardinlistinteam(String x, String x2) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(teamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            y.add(teamsMade.get(i).getLists().get(j).getcards().get(k).getname());
                        }
                    }
                }
            }
        }
        return y;
    }
//required

    public ArrayList<String> membersincardassigned(String x, String x2, String x3) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(teamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (teamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                for (int l = 0; l < teamsMade.get(i).getLists().get(j).getcards().get(k).getmembersassigned().size(); l++) {
                                    y.add(teamsMade.get(i).getLists().get(j).getcards().get(k).getmembersassigned().get(l));
                                }
                            }
                        }
                    }
                }
            }
        }
        return y;
    }
//required

    public void assignmember(String x, String x2, String x3, String x4) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(teamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (teamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                teamsMade.get(i).getLists().get(j).getcards().get(k).addmemberTocard(x4);
                            }
                        }
                    }
                }
            }
        }
    }
//required

    public boolean ispresentinteam(String x, String x2) {
        boolean flag = false;
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                return teamsMade.get(i).ispresentmember(x2);
            }

        }

        return flag;
    }
//required

    public ArrayList<String> namesteamsjoined(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).ispresent(x)) {
                y.add(teamsMade.get(i).getName());
            }
        }
        return y;
    }
//required

    public ArrayList<String> namesCardsAssigned(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).ispresent(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    for (int k = 0; k < teamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                        if (teamsMade.get(i).getLists().get(j).getcards().get(k).isassigned(x)) {
                            y.add(teamsMade.get(i).getLists().get(j).getcards().get(k).getname());
                        }
                    }
                }
            }
        }
        return y;
    }
//required

    public ArrayList<Team> getteamsMade() {
        //return team for a particular user

        return teamsMade;
    }
//required

    public boolean ispresentteam(String x) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                return true;
            }
        }
        return false;
    }
//required

    public boolean ispresentlist(String x, String y) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                if (teamsMade.get(i).isprelist(y)) {
                    return true;
                }
            }
        }
        return false;
    }
//required

    public boolean ispresentcard(String x, String y, String z) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                return teamsMade.get(i).isprecard(y, z);
            }
        }
        return false;
    }
//required

    public void addlist(String x, String y) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                List l = new List(y);
                teamsMade.get(i).addlist(l);

            }
        }
    }
//required

    public void addcard(String x, String y, String z) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (teamsMade.get(i).getLists().get(j).getname().equals(y)) {
                        Card c = new Card(z);
                        teamsMade.get(i).getLists().get(j).addcard(c);
                    }
                }

            }
        }
    }
//required

    public void addchecklist(String x, String y, String z, String a) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (teamsMade.get(i).getLists().get(j).getname().equals(y)) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).CardsIncluded.size(); k++) {
                            if (teamsMade.get(i).getLists().get(j).CardsIncluded.get(k).equals(z)) {

                                teamsMade.get(i).getLists().get(j).CardsIncluded.get(k).addchecklisttocard(a);
                            }
                        }
                    }
                }

            }
        }
    }
//required

    public void additem(String x, String y, String z, String a, String b) {
        for (int i = 0; i < teamsMade.size(); i++) {
            if (teamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < teamsMade.get(i).getLists().size(); j++) {
                    if (teamsMade.get(i).getLists().get(j).getname().equals(y)) {
                        for (int k = 0; k < teamsMade.get(i).getLists().get(j).CardsIncluded.size(); k++) {
                            if (teamsMade.get(i).getLists().get(j).CardsIncluded.get(k).equals(z)) {

                                for (int m = 0; m < teamsMade.get(i).getLists().get(j).CardsIncluded.get(k).getchecklist2().size(); m++) {
                                    if (teamsMade.get(i).getLists().get(j).CardsIncluded.get(k).getchecklist2().get(m).name.equals(a)) {
                                        teamsMade.get(i).getLists().get(j).CardsIncluded.get(k).getchecklist2().get(m).AddItem(b);
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
