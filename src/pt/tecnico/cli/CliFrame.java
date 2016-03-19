package pt.tecnico.cli;


import java.util.InputMismatchException;

/**
 * Created by diutsu on 3/19/16.
 */
public abstract class CliFrame {

    final Controller controller;
    
    public CliFrame(Controller controller) {
        this.controller = controller;
    }

    protected enum AvailableCommands {
        list, listAll, select, create, remove, attach, done, view
    }

    abstract public CliFrame listen() throws IllegalArgumentException, InputMismatchException;

}
