package pt.tecnico.domain;


/**
 * Created by diutsu on 18/03/16.
 */
public class CheckItem extends Item {
    private Boolean checkbox;

    public CheckItem(String task){
        super(task);
        checkbox = false;
    }

    public void toggleCheck(){
        checkbox = !checkbox;
    }

    public Boolean isChecked(){
        return checkbox;
    }

    @Override
    public String toString(){
        return "[" + ( checkbox ? "X" : "_" ) + "]" + super.toString();
    }

}
