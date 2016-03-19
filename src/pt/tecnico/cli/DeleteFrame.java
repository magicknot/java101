package pt.tecnico.cli;

/**
 * Created by diutsu on 19/03/16.
 */
public class DeleteFrame extends CliFrame {
    public DeleteFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        System.out.println("What do you want to remove?");
        String input  = controller.scanner.nextLine();

        controller.removeItem(input);
        return new MainCliFrame(controller);
    }
}
