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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.metal.*;

public class editor extends JFrame implements ActionListener {

    JFrame frame;
    JTextArea textArea;
    Scanner s;

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
        JScrollPane sp = new JScrollPane(textArea);
        frame.getContentPane().add(sp);
        textArea.setLineWrap(true);
        frame.setSize(750, 750);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                int retVal = jfc.showOpenDialog(null);

                if (retVal == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    FileReader fr;
                    try {
                        fr = new FileReader(selectedFile);
                        s = new Scanner(fr);
                        while (s.hasNextLine()) {
                            textArea.append(s.nextLine());
                            textArea.append(System.lineSeparator());
                        }
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.toString());
                    }

                }
                break;
            }
            case "Save": {
                JFileChooser SaveAs = new JFileChooser("C:");
                SaveAs.setApproveButtonText("Save");
                int retVal = SaveAs.showOpenDialog(this);
                if (retVal == JFileChooser.APPROVE_OPTION) {
                    File file = new File(SaveAs.getSelectedFile().toString());
                    BufferedWriter outFile = null;
                    
                    try {
                        outFile = new BufferedWriter(new FileWriter(file));
                        textArea.write(outFile);
                    } catch (IOException ex) {
                        System.out.println(ex.toString());
                    }
                }
                break;
            }
        }
    }
}
