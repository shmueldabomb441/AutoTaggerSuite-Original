package com.GeneralTagger;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class PrintListOfAvailableFontsForJavaOnComputer {
        public static void main(String[] args) throws IOException {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            String []fontFamilies = ge.getAvailableFontFamilyNames();
            ForRandomCodeTests6.textbox(Arrays.toString(fontFamilies),"Fonts");
            System.out.println();
        }
}
class DisplayDifferentFonts extends JComponent {
    String[] differentFonts;
    Font[] font;
    static final int IN = 15;
    public DisplayDifferentFonts() {

        differentFonts = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        font = new Font[differentFonts.length];
    }
    public void paintComponent(Graphics g) {
        for (int j = 0; j < differentFonts.length; j += 1) {
            if (font[j] == null) {
                font[j] = new Font(differentFonts[j], Font.PLAIN, 16);
            }
            g.setFont(font[j]);
            int p = 15;
            int q = 15+ (IN * j);
            g.drawString(differentFonts[j],p,q);
        }
    }
    public static void main(String[] args) throws IOException {
      GeneralTaggerJava a = new GeneralTaggerJava();
        JFrame frame = new JFrame("Different Fonts");
        frame.getContentPane().add(new JScrollPane(new DisplayDifferentFonts()));
        DisplayDifferentFonts ab = new DisplayDifferentFonts();
        System.out.println(ab);
        frame.setSize(350, 650);
        frame.setVisible(true);
        
    }
}
