package pt.tecnico;

import pt.tecnico.cli.CLIMenu;
import pt.tecnico.cli.CliFrame;
import pt.tecnico.domain.Item;
import pt.tecnico.domain.TodoList;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by diutsu on 18/03/16.
 */
public class Java101ToDoList {

    private static TodoList todoList = new TodoList("todo");

    public static void main(String[] args) {
        System.out.println("Hi there, what do you have to do?");
        populate();
        CLIMenu cli = new CLIMenu(todoList);
        cli.start();
    }

    private static void populate() {
        ArrayList<Item> tasks = todoList.getItems();
        tasks.add(new Item("Finish it this workshop"));
        tasks.add(new Item("go to sleep"));
        tasks.add(new Item("zzzz"));

    }

}
