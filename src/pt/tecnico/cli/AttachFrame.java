package pt.tecnico.cli;


import java.util.Scanner;

/**
 * Created by diutsu on 3/19/16.
 */
public class AttachFrame extends CliFrame {
    public AttachFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        System.out.print("What task?");
        String task = controller.scanner.nextLine();//TODO read and parse number

        System.out.print("What do you want to attach?");
        String attachment = controller.scanner.nextLine();

        System.out.print("Is that a picture ? (true/false)");
        Boolean isPicture = controller.scanner.nextLine().equals("true");

        controller.attach(task, attachment,isPicture);
        return new MainCliFrame(controller);
    }
}
