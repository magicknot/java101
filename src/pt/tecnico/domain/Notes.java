package pt.tecnico.domain;

/**
 * Created by diutsu on 18/03/16.
 */
public class Notes extends Attachment {
    public String text;
    
    public Notes(String attachment) {
        this.text = attachment;
    }
}
