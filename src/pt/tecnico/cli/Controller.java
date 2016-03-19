package pt.tecnico.cli;

import pt.tecnico.domain.Item;
import pt.tecnico.domain.Notes;
import pt.tecnico.domain.TodoList;

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

    public void addItem(String task){
        todoList.getItems().add(new Item(task));
    }

    public void removeItem(String task){
        todoList.getItems().removeIf(item -> item.task.equals(task));
    }

    public void attach(String task, String attachment){
        todoList.getItems().stream().filter(item -> item.task.equals(task)).forEach(item -> item.attachments.add(new Notes(attachment)));
    }




}
