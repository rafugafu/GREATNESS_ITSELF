import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
public class GREATNESS_ITSELF extends JFrame implements ActionListener {
    String nameandversion = "GREATNESS_ITSELF(v1.3)";
    private JTextArea textArea;
    private JFileChooser fileChooser;
    private String currentFile;

    public GREATNESS_ITSELF() {
        setTitle(nameandversion + "(A SIMPLE TEXT EDITOR)");

        // Create the text area
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        add(new JScrollPane(textArea));

        // Create the file chooser
        fileChooser = new JFileChooser();

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create the File menu
        JMenu fileMenu = new JMenu("File");
        JMenu rafugafuMenu = new JMenu("SOMETHING_RAFUGAFU");
        menuBar.add(fileMenu);
        menuBar.add(rafugafuMenu);

        // Create the File menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem testItem = new JMenuItem("Gabuchi");
        JMenuItem saveAsItem = new JMenuItem("Save As");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem somethingItem = new JMenuItem("SOMETHING");
        JMenuItem somethingelseItem = new JMenuItem("SOMETHING_ELSE");
        JMenuItem somethingelsesqItem = new JMenuItem("SOMETHING_ELSE_SQUARED");
        JMenuItem somethingelsecbItem = new JMenuItem("SOMETHING_ELSE_CUBED");
        JMenuItem somethingelsecbflItem = new JMenuItem("SOMETHING_ELSE_CUBED_AND_FLATTENED_BACK_TO_TWO-DIMENSIONS");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(testItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(exitItem);
        rafugafuMenu.add(somethingItem);
        rafugafuMenu.add(somethingelseItem);
        rafugafuMenu.add(somethingelsesqItem);
        rafugafuMenu.add(somethingelsecbItem);
        rafugafuMenu.add(somethingelsecbflItem);

        // Register action listeners for the menu items
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        testItem.addActionListener(this);
        saveAsItem.addActionListener(this);
        exitItem.addActionListener(this);

        // Set the frame size and make it maximized and visible
        setSize(500, 400);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("New")) {
            newDocument();
        } else if (actionCommand.equals("Open")) {
            openDocument();
        } else if (actionCommand.equals("Save")) {
            saveDocument(currentFile);
        } else if (actionCommand.equals("Save As")) {
            saveAsDocument();
        } else if (actionCommand.equals("Exit")) {
            System.exit(0);
        } else if (actionCommand.equals("Gabuchi")) {
            gabuchi();
        }
    }

    private void gabuchi() {
        currentFile = "Gabuchi.txt";
        setTitle(nameandversion + "--NONEXISTANT \"GABUCHI.TXT\" (IF YOU CLICK SAVE IT WILL SAVE IT AS \"GABUCHI.TXT\" IN THE SAME DIRECTORY AS THIS PROGRAM IS RUNNING.)");
        textArea.setText("Hello gabuchi! This is a simple text editor, originally written by ChatGPT and then modified by RAFEY THE GREAT, TRUE GREATNESS IMPERSONIFIED!\nHe combined his great knowledge of python with his original instinct for programming and came up with this masterpiece!\nHe looked at the lines written by ChatGPT originally and tried to understand and then he copied them and added something and THERE!\nSomething Something. 1 > 0 ? abcdefghijklmnopqrstuvwxyz. Exactly how many \"Gabuchi Babuchi\"s are there over there?\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi\nGabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi Gabuchi Babuchi");
    }

    private void newDocument() {
        currentFile = null;
        setTitle(nameandversion + "(A SIMPLE TEXT EDITOR)");
        textArea.setText("");
    }

    private void openDocument() {
        int returnVal = fileChooser.showOpenDialog(this);
        File file = fileChooser.getSelectedFile();
        setTitle(nameandversion + "--\"" + file.getAbsolutePath() + "\"");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                textArea.read(br, null);
                br.close();
                currentFile = file.getAbsolutePath();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveDocument(String filePath) {
        if (filePath == null) {
            saveAsDocument();
            return;
        }
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            textArea.write(bw);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveAsDocument() {
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            saveDocument(file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GREATNESS_ITSELF();
            }
        });
    }
}