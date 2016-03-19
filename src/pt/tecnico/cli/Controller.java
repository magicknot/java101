package pt.tecnico.cli;

import pt.tecnico.domain.*;
import pt.tecnico.utils.ImageViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by diutsu on 3/19/16.
 */
public class Controller {

    private final TodoList todoList;
    Scanner scanner = new Scanner(System.in);

    public Controller(TodoList todoList) {
        this.todoList= todoList;
    }

    public  List<String> listItems(){
        List<String> items = new ArrayList<>();
        for(Item item : todoList.getItems()){
            items.add(item.toString());
        }

        return items;
    }

    public void addItem(String task, Boolean isCheckable){
        Item item;
        if(isCheckable){
            item = new CheckItem(task);
        } else {
            item = new Item(task);
        }
        todoList.getItems().add(item);
    }

    public void removeItem(final String task){
        todoList.getItems().removeIf(new Predicate<Item>() {
            @Override
            public boolean test(Item item) {
                return item.task.equals(task);
            }
        });
    }

    public void attach(String task, String content,Boolean isPicture){
        Attachment attachment;
        if(isPicture){
            attachment = new Picture(content);
        } else {
            attachment = new Notes(content);
        }

        for(Item item : todoList.getItems()){
            if(item.task.equals(task)){
                item.attachments.add(attachment);
            }
        }
    }

    public List<String> viewText(String task){
        ArrayList<String> textList = new ArrayList<>();
        for(Item item : todoList.getItems()){
            if(item.task.equals(task)){
                for(Attachment attachment : item.attachments){
                    if(attachment instanceof Notes){
                        textList.add(((Notes) attachment).text);
                    }
                }
            }
        }
        return textList;
    }

    public void viewImage(String task){
        for(Item item : todoList.getItems()){
            if(item.task.equals(task)){
                for(Attachment attachment : item.attachments){
                    if(attachment instanceof Picture){
                        ImageViewer.paint(((Picture) attachment).getImage());
                    }
                }
            }
        }
    }

    public void doItem(String task) {
        for(Item item : todoList.getItems()){
            if(item.task.equals(task) || item instanceof CheckItem){
                ((CheckItem) item).toggleCheck();
            }
        }
    }
}
