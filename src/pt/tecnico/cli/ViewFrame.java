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
        System.out.println("What do you see?");
        String input  = controller.scanner.nextLine();
        for(String attachment : controller.viewText(input)){
            System.out.println(attachment);
        }
        controller.viewImage(input);
        return new MainCliFrame(controller);
    }
}
