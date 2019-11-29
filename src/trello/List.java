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

    public ArrayList<Card> cardsIncluded;
    private String name;

    public List(String n) {
        cardsIncluded = new ArrayList<Card>();
        name = n;
    }

    boolean isprescard(String x) {
        for (int i = 0; i < cardsIncluded.size(); i++) {
            if (cardsIncluded.get(i).getname().equals(x)) {
                return true;
            }
        }
        return false;
    }

    public String getname() {
        return name;
    }

    public ArrayList<Card> getcards() {
        return cardsIncluded;
    }

    void addcard(Card c) {
        cardsIncluded.add(c);
    }

//    boolean CreateCard() {
//        boolean flag = false;
//
//        return flag;
//    }

//    boolean MoveCard() {
//        boolean flag = false;
//
//        return flag;
//    }

}
