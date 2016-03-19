package pt.tecnico.cli;

import pt.tecnico.domain.*;
import pt.tecnico.utils.ImageViewer;

import java.util.List;
import java.util.Scanner;
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
        return todoList.getItems().stream().map(item -> item.toString()).collect(Collectors.toList());
    }

    public void addItem(String task, Boolean isCheckable){
        Item item;
        if(isCheckable){
            item = new Item(task);
        } else {
            item = new CheckItem(task);
        }
        todoList.getItems().add(item);
    }

    public void removeItem(String task){
        todoList.getItems().removeIf(item -> item.task.equals(task));
    }

    public void attach(String task, String content,Boolean isPicture){
        Attachment attachment;
        if(isPicture){
            attachment = new Picture(content);
        } else {
            attachment = new Notes(content);
        }

        todoList.getItems().stream().filter(item -> item.task.equals(task)).forEach(item -> item.attachments.add(attachment));
    }

    public List<String> viewText(String task){
        return todoList.getItems().stream().filter(item -> item.task.equals(task)).flatMap(item-> item.attachments.stream())
                .filter(attachment -> attachment instanceof Notes)
                .map(at -> ((Notes)at).text)
                .collect(Collectors.toList());
    }

    public void viewImage(String task){
        todoList.getItems().stream().filter(item -> item.task.equals(task)).flatMap(item-> item.attachments.stream())
                .filter(attachment -> attachment instanceof Picture)
                .forEach(pic -> ImageViewer.paint(((Picture) pic).getImage()));
    }

    public void doItem(String task) {
        todoList.getItems().stream().filter(item -> item.task.equals(task)).filter(item -> item instanceof CheckItem).forEach(item -> ((CheckItem) item).toggleCheck());
    }
}
