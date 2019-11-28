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
public class CheckList {

    ArrayList<Item> itemsIncluded;
    boolean status;
    String name;

    public CheckList(String n) {
        itemsIncluded = new ArrayList<Item>();
        status = false;
        name = n;
    }

    void addItem(String x) {
        Item i = new Item(x);
        itemsIncluded.add(i);
    }

}
