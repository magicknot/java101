package pt.tecnico.cli;

/**
 * Created by diutsu on 19/03/16.
 */
public class DoFrame extends CliFrame {
    public DoFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        System.out.println("What have you done?");
        String input  = controller.scanner.nextLine();

        controller.doItem(input);
        return new MainCliFrame(controller);    }
}
