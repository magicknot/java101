package pt.tecnico.cli;


/**
 * Created by diutsu on 3/19/16.
 */
public class CreateItemFrame extends CliFrame {
    public CreateItemFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        System.out.println("What do you have to do?");
        String input  = controller.scanner.nextLine();

        System.out.print("Add check ? (true/false)");
        Boolean isCheckable = controller.scanner.nextLine().equals("true");
        controller.addItem(input,isCheckable);
        return new MainCliFrame(controller);
    }
}
