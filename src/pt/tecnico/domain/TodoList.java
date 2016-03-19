package pt.tecnico.domain;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by diutsu on 18/03/16.
 */
public class TodoList {
    private ArrayList<Item> items;
    private String name;

    public TodoList(String name){
        this.items = new ArrayList<Item>();
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
