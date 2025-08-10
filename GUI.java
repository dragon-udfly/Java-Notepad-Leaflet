import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{

    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemExit;

    public static void main(String args[]){
        new GUI();
    }

    public GUI(){
        // call methods below
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        // call method above
        window.setVisible(true);
    }

    public void createWindow(){
        window= new JFrame("Leaflet");
        window.setSize(900, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextArea(){
        textArea= new JTextArea();
        scrollPane= new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
    }

    public void createMenuBar(){
        menuBar= new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile= new JMenu("File");
        menuBar.add(menuFile);

        menuEdit= new JMenu("Edit");
        menuBar.add(menuEdit);

        menuFormat= new JMenu("Format");
        menuBar.add(menuFormat);

        menuColor= new JMenu("Color");
        menuBar.add(menuColor);
    }

    public void createFileMenu(){
        itemNew= new JMenuItem("New");
        itemNew.addActionListener(this);
        itemNew.setActionCommand("New");
        menuFile.add(itemNew);

        itemOpen= new JMenuItem("Open");
        menuFile.add(itemOpen);

        itemSave= new JMenuItem("Save");
        menuFile.add(itemSave);

        itemSaveAs= new JMenuItem("Save As");
        menuFile.add(itemSaveAs);

        itemExit= new JMenuItem("Exit");
        menuFile.add(itemExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}