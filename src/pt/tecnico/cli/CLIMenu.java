package pt.tecnico.cli;

import java.lang.IllegalArgumentException;
import pt.tecnico.domain.TodoList;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by diutsu on 3/19/16.
 */
public class CLIMenu {

    Controller controller;
    private CliFrame currentFrame;

    public CLIMenu(TodoList todoList) {
        controller = new Controller(todoList);
    }


    public void start() {
        currentFrame = new MainCliFrame(controller);
        eval();
    }

    private void eval(){
        while(true){
            try {
                currentFrame = currentFrame.listen();
            } catch (IllegalArgumentException | InputMismatchException e){
                System.out.print("Invalid option, try again\n");
            }
        }
    }
}
