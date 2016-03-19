package pt.tecnico.cli;

/**
 * Created by diutsu on 3/19/16.
 */
public class MainCliFrame extends CliFrame {

    public MainCliFrame(Controller controller) {
        super(controller);
    }

    public CliFrame listen(){
        System.out.print("Available options are list, remove, attach, create, view, do");

        String  input = controller.scanner.nextLine();

        switch (AvailableCommands.valueOf(input)){
            case list :
                return new ListCliFrame(controller);
            case create :
                return new CreateItemFrame(controller);
            case attach :
                return new AttachFrame(controller);
            case view :
                return new ViewFrame(controller);
            case remove :
                return new DeleteFrame(controller);
            case done :
                return new DoFrame(controller);
        }
        return this;
    }

}
