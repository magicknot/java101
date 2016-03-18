package pt.tecnico.domain;

import java.util.ArrayList;

/**
 * Created by diutsu on 18/03/16.
 */
public class Item {
    public String task;
    public ArrayList<Attachment> attachments;

    public Item(String task) {
        this.task = task;
        this.attachments = new ArrayList<>();
    }

    @Override
    public String toString() {
        return task;
    }

}
