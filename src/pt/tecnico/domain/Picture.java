package pt.tecnico.domain;

import pt.tecnico.utils.ImageViewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by diutsu on 18/03/16.
 */
public class Picture extends Attachment {
    private ImageIcon image;


    public Picture(String imagePath) {
        image = new ImageIcon(imagePath);
    }

    public ImageIcon getImage(){
        return image;
    }

}

