package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StopWatch {

    public static void main(String[] args) {
        new StopWatch();
    }

    public StopWatch() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                Date now = Calendar.getInstance().getTime();
                final DateFormat time = new SimpleDateFormat("hh:mm:ss a.");

                String s = time.format(now);

                final JLabel label = new JLabel(s, JLabel.CENTER);
                final JLabel label1 = new JLabel("x", JLabel.CENTER);
                label.setFont(new Font("DigifaceWide Regular", Font.PLAIN, 20));
                label1.setFont(new Font("DigifaceWide Regular", Font.PLAIN, 20));

                Timer t = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

//                        Date now = Calendar.getInstance().getTime();
//                        label.setText(time.format(now));
                        label.setText("");
                    }
                });
                t.setRepeats(true);
                t.start();

                int choice = JOptionPane.showConfirmDialog(null, label, "Alarm Clock", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                t.stop();
            }
        });
    }
}
