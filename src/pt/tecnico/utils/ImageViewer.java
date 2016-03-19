package pt.tecnico.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by diutsu on 18/03/16.
 */
public class ImageViewer {

    public static void paint(final ImageIcon img) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        JLabel label = new JLabel("", img, JLabel.CENTER);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add( label, BorderLayout.CENTER );
        frame.add(panel);
    }
}
