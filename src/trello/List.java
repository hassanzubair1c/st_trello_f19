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
public class List {

    public ArrayList<Card> CardsIncluded;
    private String name;

    public List(String n) {
        CardsIncluded = new ArrayList<Card>();
        name = n;
    }

    boolean isprescard(String x) {
        for (int i = 0; i < CardsIncluded.size(); i++) {
            if (CardsIncluded.get(i).getname().equals(x)) {
                return true;
            }
        }
        return false;
    }

    public String getname() {
        return name;
    }

    public ArrayList<Card> getcards() {
        return CardsIncluded;
    }

    void addcard(Card c) {
        CardsIncluded.add(c);
    }

    boolean CreateCard() {
        boolean flag = false;

        return flag;
    }

    boolean MoveCard() {
        boolean flag = false;

        return flag;
    }

}
