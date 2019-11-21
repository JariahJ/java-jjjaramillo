/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaria
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.metal.*;

public class editor extends JFrame implements ActionListener {

    JFrame frame;
    JTextArea textArea;

    editor() {
        frame = new JFrame("Editor");

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex.toString());
        }
        textArea = new JTextArea();

        JMenuBar menuBar = new JMenuBar();

        JMenu m1 = new JMenu("File");

        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        menuBar.add(m1);

        frame.setJMenuBar(menuBar);
        frame.add(textArea);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        editor e = new editor();
        e.run();
    }

    private void run() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        switch (str) {
            case "New": {
                textArea.setText("");
                break;
            }
            case "Open": {
                JFileChooser jfc = new JFileChooser("C:");
                jfc.showOpenDialog(null);

            }
        }
    }
}
