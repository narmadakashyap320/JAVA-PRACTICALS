import javax.swing.*;
import java.awt.*;
import java.io.*;

public class SimpleNotepad extends JFrame {

    JTextArea area;

    SimpleNotepad() {

        setTitle("My Notepad");

        area = new JTextArea();

        add(new JScrollPane(area));

        JMenuBar mb = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);

        mb.add(file);

        setJMenuBar(mb);

        newFile.addActionListener(e -> area.setText(""));

        open.addActionListener(e -> openFile());

        save.addActionListener(e -> saveFile());

        exit.addActionListener(e -> dispose());

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    void openFile() {

        JFileChooser fc = new JFileChooser();

        if (fc.showOpenDialog(this) ==
                JFileChooser.APPROVE_OPTION) {

            try {
                area.read(new FileReader(
                    fc.getSelectedFile()), null);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    void saveFile() {

        JFileChooser fc = new JFileChooser();

        if (fc.showSaveDialog(this) ==
                JFileChooser.APPROVE_OPTION) {

            try {
                area.write(new FileWriter(
                    fc.getSelectedFile()));

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new SimpleNotepad();
    }
            }
