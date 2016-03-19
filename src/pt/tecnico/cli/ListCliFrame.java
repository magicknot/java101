package pt.tecnico.cli;


import pt.tecnico.domain.Item;

/**
 * Created by diutsu on 3/19/16.
 */
public class ListCliFrame extends CliFrame {

    public ListCliFrame(Controller controller) {
        super(controller);
    }

    @Override
    public CliFrame listen() throws IllegalArgumentException {
        for(String item : controller.listItems()) {
            System.out.println(item);
        }
        return new MainCliFrame(controller);
    }
}
