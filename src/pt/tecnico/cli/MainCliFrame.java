package pt.tecnico.cli;

/**
 * Created by diutsu on 3/19/16.
 */
public class MainCliFrame extends CliFrame {

    public MainCliFrame(Controller controller) {
        super(controller);
    }

    public CliFrame listen(){
        System.out.print("Available options are list, delete, attach, create");

        String  input = controller.scanner.nextLine();

        switch (AvailableCommands.valueOf(input)){
            case list :
                return new ListCliFrame(controller);
            case create :
                return new CreateItemFrame(controller);
            case attach :
                return new AttachFrame(controller);
        }
        return this;
    }

}
