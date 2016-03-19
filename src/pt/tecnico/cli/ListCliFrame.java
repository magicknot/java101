package pt.tecnico.cli;


/**
 * Created by diutsu on 3/19/16.
 */
public class ListCliFrame extends CliFrame {

    public ListCliFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        controller.listItems().forEach(item -> System.out.println(item));

        return new MainCliFrame(controller);
    }
}
