package pt.tecnico.domain;

import pt.tecnico.utils.ImageViewer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by diutsu on 18/03/16.
 */
public class Picture extends Attachment {
    private BufferedImage image;


    public Picture(String imagePath) {
        try {
            image = ImageIO.read(new File(imagePath));
        } catch (IOException e) {

        }
    }

    public BufferedImage getImage(){
        return image;
    }

}

