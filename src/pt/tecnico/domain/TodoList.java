package pt.tecnico.domain;

import java.util.TreeSet;

/**
 * Created by diutsu on 18/03/16.
 */
public class TodoList {
    private TreeSet<Item> items;
    private String name;

    public TodoList(String name){
        this.items = new TreeSet<Item>();
        this.name = name;
    }

    public TreeSet<Item> getItems() {
        return items;
    }

    public void setItems(TreeSet<Item> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n");
        items.stream().forEach(item -> sb.append(item.toString() + "\n"));
        return sb.toString();
    }
}
