package pt.tecnico;

import pt.tecnico.domain.TodoList;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by diutsu on 18/03/16.
 */
public class Java101ToDoList {

    private enum CommandOption {
        list, listAll, select, create, remove, attach, view
    }

    private static ArrayList<TodoList> lists = new ArrayList<TodoList>();

    public static void main(String[] args) {
        System.out.println("Hi there, what do you have to do?");
        firstMenu();
    }

    private static void firstMenu() {
        try {
            CommandOption input;
            System.out.println("Available options are: list, listAll, select, create and remove");
            input = CommandOption.valueOf(System.console().readLine());

            switch (input){
                case list:
                    listAllLists();
                case listAll:
                    listListsAndItems();
                case select:
                    System.out.println("What list you want to see?");
                    showList(Integer.parseInt(System.console().readLine()));
            }
        } catch(IllegalArgumentException e){
            System.out.println("Option not available");
        }

    }

    private static void printLists(){

    }

    private static void listListsAndItems() {
    }

    private static void listAllLists() {
    }

    private static void showList(Integer i) {
        try {
            TodoList list = lists.get(i);
            System.out.println(list.toString());
            System.out.println("Available options are: list, attach, view, create and remove");
            CommandOption input = CommandOption.valueOf(System.console().readLine());

            switch (input){
                case list:
                    listItems();
                case view:
                    System.out.println("What item?");
                    showItemAttachment(Integer.parseInt(System.console().readLine()));
            }
        } catch(IllegalArgumentException e){
            System.out.println("Option not available");
        }

    }

    private static void listItems() {
    }

    private static void showItemAttachment(int i) {
    }


}
