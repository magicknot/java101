package pt.tecnico.cli;

/**
 * Created by diutsu on 19/03/16.
 */
public class ViewFrame extends CliFrame {
    public ViewFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        System.out.println("What do you have to do?");
        String input  = controller.scanner.nextLine();
        controller.viewText(input);
        controller.viewImage(input);
        return new MainCliFrame(controller);
    }
}
