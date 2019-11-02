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
public class Team_Management {

    public static ArrayList<Team> TeamsMade;
    public static Team_Management instance = new Team_Management();

    public Team_Management() {
        TeamsMade = new ArrayList<Team>();
    }

    public static Team_Management getinstancetillassignedmembers() {
        TeamsMade = new ArrayList<Team>();
        Connection myConnection = null;

        Statement myStatement = null;
        ResultSet myResult = null;
        ResultSet myResult2 = null;
        ResultSet myResult3 = null;
        ResultSet myResult4 = null;
        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * from AllTeams ");
            while (myResult.next()) {
                addTeam(myResult.getString(1));
                //System.out.println(myResult.getString(1));
            }

            for (int i = 0; i < gettotalteams(); i++) {
                myResult = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + " where Members is not null ");
                while (myResult.next()) {
                    TeamsMade.get(i).adduser(myResult.getString(1));

                }
                myResult2 = myStatement.executeQuery("Select ListNames from " + TeamsMade.get(i).getName() + " where ListNames is not null ");

                while (myResult2.next()) {
                    List l = new List(myResult2.getString(1));
                    TeamsMade.get(i).addlist(l);
                }
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    myResult3 = myStatement.executeQuery("Select cardname from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + " where cardname is not null ");
                    while (myResult3.next()) {
                        Card c = new Card(myResult3.getString(1));
                        TeamsMade.get(i).getLists().get(j).addcard(c);
                        //System.out.println(myResult3.getString(1));
                    }

                    for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                        myResult4 = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getname() + " where Members is not null ");
                        while (myResult4.next()) {
                            // System.out.println(myResult4.getString(1));
                            TeamsMade.get(i).getLists().get(j).getcards().get(k).addmemberTocard(myResult4.getString(1));
                        }

                    }

                }
            }
        } catch (SQLException E) {
            E.printStackTrace();
            System.out.println("Connection not made");
        }

        return instance;
    }

    public static Team_Management getinstancetillchecklist() {
        TeamsMade = new ArrayList<Team>();
        Connection myConnection = null;

        Statement myStatement = null;
        ResultSet myResult = null;
        ResultSet myResult2 = null;
        ResultSet myResult3 = null;
        ResultSet myResult4 = null;
        ResultSet myResult5 = null;
        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * from AllTeams ");
            while (myResult.next()) {
                addTeam(myResult.getString(1));
                //System.out.println(myResult.getString(1));
            }

            for (int i = 0; i < gettotalteams(); i++) {
                myResult = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + " where Members is not null ");
                while (myResult.next()) {
                    TeamsMade.get(i).adduser(myResult.getString(1));

                }
                myResult2 = myStatement.executeQuery("Select ListNames from " + TeamsMade.get(i).getName() + " where ListNames is not null ");

                while (myResult2.next()) {
                    List l = new List(myResult2.getString(1));
                    TeamsMade.get(i).addlist(l);
                }
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    myResult3 = myStatement.executeQuery("Select cardname from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + " where cardname is not null ");
                    while (myResult3.next()) {
                        Card c = new Card(myResult3.getString(1));
                        TeamsMade.get(i).getLists().get(j).addcard(c);
                        //System.out.println(myResult3.getString(1));
                    }

                    for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                        myResult4 = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getname() + " where Members is not null ");
                        while (myResult4.next()) {
                            // System.out.println(myResult4.getString(1));
                            TeamsMade.get(i).getLists().get(j).getcards().get(k).addmemberTocard(myResult4.getString(1));
                        }
                        myResult5 = myStatement.executeQuery("Select checklist from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getname() + " where checklist is not null ");
                        while (myResult5.next()) {
                            // System.out.println(myResult4.getString(1));
                            TeamsMade.get(i).getLists().get(j).getcards().get(k).addchecklisttocard(myResult5.getString(1));
                        }
                    }

                }
            }
        } catch (SQLException E) {
            E.printStackTrace();
            System.out.println("Connection not made");
        }

        return instance;
    }

    public ArrayList<String> getchecklist(String x, String x2, String x3) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(TeamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (TeamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                for (int l = 0; l < TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist().size(); l++) {
                                    y.add(TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist().get(l));
                                }
                            }
                        }
                    }
                }
            }
        }
        return y;
    }

    public ArrayList<String> getitems(String x, String x2, String x3, String x4) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(TeamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (TeamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                for (int l = 0; l < TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().size(); l++) {
                                    if (x4.equals(TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(l).name)) {
                                        for (int m = 0; m < TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(l).ItemsIncluded.size(); m++) {
                                            y.add(TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(l).ItemsIncluded.get(m).name);
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

    public static Team_Management getinstancetillitems() {
        TeamsMade = new ArrayList<Team>();
        Connection myConnection = null;

        Statement myStatement = null;
        ResultSet myResult = null;
        ResultSet myResult2 = null;
        ResultSet myResult3 = null;
        ResultSet myResult4 = null;
        ResultSet myResult5 = null;
        ResultSet myResult6 = null;
        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * from AllTeams ");
            while (myResult.next()) {
                addTeam(myResult.getString(1));
                //System.out.println(myResult.getString(1));
            }

            for (int i = 0; i < gettotalteams(); i++) {
                myResult = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + " where Members is not null ");
                while (myResult.next()) {
                    TeamsMade.get(i).adduser(myResult.getString(1));

                }
                myResult2 = myStatement.executeQuery("Select ListNames from " + TeamsMade.get(i).getName() + " where ListNames is not null ");

                while (myResult2.next()) {
                    List l = new List(myResult2.getString(1));
                    TeamsMade.get(i).addlist(l);
                }
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    myResult3 = myStatement.executeQuery("Select cardname from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + " where cardname is not null ");
                    while (myResult3.next()) {
                        Card c = new Card(myResult3.getString(1));
                        TeamsMade.get(i).getLists().get(j).addcard(c);
                        //System.out.println(myResult3.getString(1));
                    }

                    for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                        myResult4 = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getname() + " where Members is not null ");
                        while (myResult4.next()) {
                            // System.out.println(myResult4.getString(1));
                            TeamsMade.get(i).getLists().get(j).getcards().get(k).addmemberTocard(myResult4.getString(1));
                        }
                        myResult5 = myStatement.executeQuery("Select checklist from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getname() + " where checklist is not null ");
                        while (myResult5.next()) {
                            // System.out.println(myResult4.getString(1));
                            TeamsMade.get(i).getLists().get(j).getcards().get(k).addchecklisttocard(myResult5.getString(1));
                        }

                        for (int m = 0; m < TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().size(); m++) {
                            myResult6 = myStatement.executeQuery("Select items from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getname() + TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(m).name + " where items is not null ");
                            while (myResult6.next()) {

                                TeamsMade.get(i).getLists().get(j).getcards().get(k).getchecklist2().get(m).AddItem(myResult6.getString(1));
                            }
                        }
                    }

                }
            }
        } catch (SQLException E) {
            E.printStackTrace();
            System.out.println("Connection not made");
        }

        return instance;
    }

    public static Team_Management getinstancetillcardnames() {
        TeamsMade = new ArrayList<Team>();
        Connection myConnection = null;

        Statement myStatement = null;
        ResultSet myResult = null;
        ResultSet myResult2 = null;
        ResultSet myResult3 = null;
        ResultSet myResult4 = null;
        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * from AllTeams ");
            while (myResult.next()) {
                addTeam(myResult.getString(1));
                //System.out.println(myResult.getString(1));
            }

            for (int i = 0; i < gettotalteams(); i++) {
                myResult = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + " where Members is not null ");
                while (myResult.next()) {
                    TeamsMade.get(i).adduser(myResult.getString(1));

                }
                myResult2 = myStatement.executeQuery("Select ListNames from " + TeamsMade.get(i).getName() + " where ListNames is not null ");

                while (myResult2.next()) {
                    List l = new List(myResult2.getString(1));
                    TeamsMade.get(i).addlist(l);
                }
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    myResult3 = myStatement.executeQuery("Select cardname from " + TeamsMade.get(i).getName() + TeamsMade.get(i).getLists().get(j).getname() + " where cardname is not null ");
                    while (myResult3.next()) {
                        Card c = new Card(myResult3.getString(1));
                        TeamsMade.get(i).getLists().get(j).addcard(c);
                        //System.out.println(myResult3.getString(1));
                    }

                }
            }
        } catch (SQLException E) {
            E.printStackTrace();
            System.out.println("Connection not made");
        }

        return instance;
    }

    public static Team_Management getinstancetillteamnames() {
        TeamsMade = new ArrayList<Team>();
        Connection myConnection = null;

        Statement myStatement = null;
        ResultSet myResult = null;
        ResultSet myResult2 = null;
        ResultSet myResult3 = null;
        ResultSet myResult4 = null;
        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * from AllTeams ");
            while (myResult.next()) {
                addTeam(myResult.getString(1));
                //System.out.println(myResult.getString(1));
            }

        } catch (SQLException E) {
            E.printStackTrace();
            System.out.println("Connection not made");
        }

        return instance;
    }

    public static Team_Management getinstancetilllistnames() {
        TeamsMade = new ArrayList<Team>();
        Connection myConnection = null;

        Statement myStatement = null;
        ResultSet myResult = null;
        ResultSet myResult2 = null;
        ResultSet myResult3 = null;
        ResultSet myResult4 = null;
        String url = "jdbc:derby://localhost:1527/TrelloApp";
        try {
            myConnection = DriverManager.getConnection(url, "ubaid", "12345");
            myStatement = myConnection.createStatement();
            myResult = myStatement.executeQuery("Select * from AllTeams ");
            while (myResult.next()) {
                addTeam(myResult.getString(1));
                //System.out.println(myResult.getString(1));
            }

            for (int i = 0; i < gettotalteams(); i++) {
                myResult = myStatement.executeQuery("Select Members from " + TeamsMade.get(i).getName() + " where Members is not null ");
                while (myResult.next()) {
                    TeamsMade.get(i).adduser(myResult.getString(1));

                }
                myResult2 = myStatement.executeQuery("Select ListNames from " + TeamsMade.get(i).getName() + " where ListNames is not null ");

                while (myResult2.next()) {
                    List l = new List(myResult2.getString(1));
                    TeamsMade.get(i).addlist(l);
                }

            }
        } catch (SQLException E) {
            E.printStackTrace();
            System.out.println("Connection not made");
        }

        return instance;
    }

    public static void addTeam(String x) {
        Team t = new Team(x);
        TeamsMade.add(t);
    }

    public void addintoTeam(String x, String y) {
        int index = -1;
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                index = i;
            }
        }
        if (index != -1) {
            TeamsMade.get(index).adduser(y);
        }
    }

    public Team getTeam(int x) {
        return TeamsMade.get(x);
    }

    public static int gettotalteams() {
        return TeamsMade.size();
    }

    public int teamsjoined(String x) {
        int index = 0;
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).ispresent(x)) {
                index++;
            }
        }
        return index;
    }

    public ArrayList<String> getmembers(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                y = TeamsMade.get(i).getmembers();
            }
        }
        return y;
    }

    public ArrayList<String> NamesListinteam(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    y.add(TeamsMade.get(i).getLists().get(j).getname());
                }
            }
        }
        return y;
    }

    public ArrayList<String> NamesCardinlistinteam(String x, String x2) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(TeamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            y.add(TeamsMade.get(i).getLists().get(j).getcards().get(k).getname());
                        }
                    }
                }
            }
        }
        return y;
    }

    public ArrayList<String> membersincardassigned(String x, String x2, String x3) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(TeamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (TeamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                for (int l = 0; l < TeamsMade.get(i).getLists().get(j).getcards().get(k).getmembersassigned().size(); l++) {
                                    y.add(TeamsMade.get(i).getLists().get(j).getcards().get(k).getmembersassigned().get(l));
                                }
                            }
                        }
                    }
                }
            }
        }
        return y;
    }

    public void assignmember(String x, String x2, String x3, String x4) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (x2.equals(TeamsMade.get(i).getLists().get(j).getname())) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                            if (TeamsMade.get(i).getLists().get(j).getcards().get(k).getname().equals(x3)) {
                                TeamsMade.get(i).getLists().get(j).getcards().get(k).addmemberTocard(x4);
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean ispresentinteam(String x, String x2) {
        boolean flag = false;
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                return TeamsMade.get(i).ispresentmember(x2);
            }

        }

        return flag;
    }

    public ArrayList<String> Namesteamsjoined(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).ispresent(x)) {
                y.add(TeamsMade.get(i).getName());
            }
        }
        return y;
    }

    public ArrayList<String> NamesCardsAssigned(String x) {
        ArrayList<String> y = new ArrayList<>();
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).ispresent(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    for (int k = 0; k < TeamsMade.get(i).getLists().get(j).getcards().size(); k++) {
                        if (TeamsMade.get(i).getLists().get(j).getcards().get(k).isassigned(x)) {
                            y.add(TeamsMade.get(i).getLists().get(j).getcards().get(k).getname());
                        }
                    }
                }
            }
        }
        return y;
    }

    public ArrayList<Team> getTeamsMade() {
        //return team for a particular user

        return TeamsMade;
    }

    public boolean ispresentteam(String x) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                return true;
            }
        }
        return false;
    }

    public boolean ispresentlist(String x, String y) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                if (TeamsMade.get(i).isprelist(y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ispresentcard(String x, String y, String z) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                return TeamsMade.get(i).isprecard(y, z);
            }
        }
        return false;
    }

    public void addlist(String x, String y) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                List l = new List(y);
                TeamsMade.get(i).addlist(l);

            }
        }
    }

    public void addcard(String x, String y, String z) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (TeamsMade.get(i).getLists().get(j).getname().equals(y)) {
                        Card c = new Card(z);
                        TeamsMade.get(i).getLists().get(j).addcard(c);
                    }
                }

            }
        }
    }

    public void addchecklist(String x, String y, String z, String a) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (TeamsMade.get(i).getLists().get(j).getname().equals(y)) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).CardsIncluded.size(); k++) {
                            if (TeamsMade.get(i).getLists().get(j).CardsIncluded.get(k).equals(z)) {

                                TeamsMade.get(i).getLists().get(j).CardsIncluded.get(k).addchecklisttocard(a);
                            }
                        }
                    }
                }

            }
        }
    }

    public void additem(String x, String y, String z, String a, String b) {
        for (int i = 0; i < TeamsMade.size(); i++) {
            if (TeamsMade.get(i).getName().equals(x)) {
                for (int j = 0; j < TeamsMade.get(i).getLists().size(); j++) {
                    if (TeamsMade.get(i).getLists().get(j).getname().equals(y)) {
                        for (int k = 0; k < TeamsMade.get(i).getLists().get(j).CardsIncluded.size(); k++) {
                            if (TeamsMade.get(i).getLists().get(j).CardsIncluded.get(k).equals(z)) {

                                for (int m = 0; m < TeamsMade.get(i).getLists().get(j).CardsIncluded.get(k).getchecklist2().size(); m++) {
                                    if (TeamsMade.get(i).getLists().get(j).CardsIncluded.get(k).getchecklist2().get(m).name.equals(a)) {
                                        TeamsMade.get(i).getLists().get(j).CardsIncluded.get(k).getchecklist2().get(m).AddItem(b);
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
