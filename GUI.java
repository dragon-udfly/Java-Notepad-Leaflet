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
    JMenuItem itemWrap, itemFontArial, itemFontCSMS, itemFontTNR;
    JMenuItem itemFontSize8, itemFontSize12, itemFontSize16, itemFontSize20, itemFontSize24, itemFontSize28;
    JMenu menuFont, menuFontSize;
    JMenuItem iColor1, iColor2, iColor3;
    JMenuItem iUndo, iRedo;

    boolean wordWrapOn= false;

    Function_File file= new Function_File(this);
    Function_Format format= new Function_Format(this);
    Function_Color color= new Function_Color(this);

    public static void main(String args[]){
        new GUI();
    }

    public GUI(){
        // call methods below
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        createFormatMenu();
        createColorMenu();
        // call method above

        format.selectedFont= "Arial";
        format.createFont(12);
        format.wordWrap();
        color.changeColor("White");

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
        itemOpen.addActionListener(this);
        itemOpen.setActionCommand("Open");
        menuFile.add(itemOpen);

        itemSave= new JMenuItem("Save");
        itemSave.addActionListener(this);
        itemSave.setActionCommand("Save");
        menuFile.add(itemSave);

        itemSaveAs= new JMenuItem("Save As");
        itemSaveAs.addActionListener(this);
        itemSaveAs.setActionCommand("Save As");
        menuFile.add(itemSaveAs);

        itemExit= new JMenuItem("Exit");
        itemExit.addActionListener(this);
        itemExit.setActionCommand("Exit");
        menuFile.add(itemExit);
    }

    public void createFormatMenu(){
        itemWrap= new JMenuItem("Word Wrap: Off");
        itemWrap.addActionListener(this);
        itemWrap.setActionCommand("Word Wrap");
        menuFormat.add(itemWrap);

        menuFont= new JMenu("Font");
        menuFormat.add(menuFont);

        itemFontArial= new JMenuItem("Arial");
        itemFontArial.addActionListener(this);
        itemFontArial.setActionCommand("Arial");
        menuFont.add(itemFontArial);

        itemFontCSMS= new JMenuItem("Comic Sans MS");
        itemFontCSMS.addActionListener(this);
        itemFontCSMS.setActionCommand("Comic Sans MS");
        menuFont.add(itemFontCSMS);

        itemFontTNR= new JMenuItem("Times New Roman");
        itemFontTNR.addActionListener(this);
        itemFontTNR.setActionCommand("Times New Roman");
        menuFont.add(itemFontTNR);

        menuFontSize= new JMenu("Font Size");
        menuFormat.add(menuFontSize);

        itemFontSize8= new JMenuItem("8");
        itemFontSize8.addActionListener(this);
        itemFontSize8.setActionCommand("size8");
        menuFontSize.add(itemFontSize8);

        itemFontSize12= new JMenuItem("12");
        itemFontSize12.addActionListener(this);
        itemFontSize12.setActionCommand("size12");
        menuFontSize.add(itemFontSize12);

        itemFontSize16= new JMenuItem("16");
        itemFontSize16.addActionListener(this);
        itemFontSize16.setActionCommand("size16");
        menuFontSize.add(itemFontSize16);

        itemFontSize20= new JMenuItem("20");
        itemFontSize20.addActionListener(this);
        itemFontSize20.setActionCommand("size20");
        menuFontSize.add(itemFontSize20);

        itemFontSize24= new JMenuItem("24");
        itemFontSize24.addActionListener(this);
        itemFontSize24.setActionCommand("size24");
        menuFontSize.add(itemFontSize24);

        itemFontSize28= new JMenuItem("28");
        itemFontSize28.addActionListener(this);
        itemFontSize28.setActionCommand("size28");
        menuFontSize.add(itemFontSize28);
    }

    public void createColorMenu(){
        iColor1= new JMenuItem("Red");
        iColor1.addActionListener(this);
        iColor1.setActionCommand("Red");
        menuColor.add(iColor1);

        iColor2= new JMenuItem("White");
        iColor2.addActionListener(this);
        iColor2.setActionCommand("White");
        menuColor.add(iColor2);

        iColor3= new JMenuItem("Blue");
        iColor3.addActionListener(this);
        iColor3.setActionCommand("Blue");
        menuColor.add(iColor3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command= e.getActionCommand();

        switch(command){
            case "New":
            file.newFile();
            break;
            case "Open":
            file.openFile();
            break;
            case "Save":
            file.saveFile();
            break;
            case "Save As":
            file.saveAsFile();
            break;
            case "Exit":
            file.exit();
            break;
            case "Word Wrap":
            format.wordWrap();
            break;
            case "size8":
            format.createFont(8);
            break;
            case "size12":
            format.createFont(12);
            break;
            case "size16":
            format.createFont(16);
            break;
            case "size20":
            format.createFont(20);
            break;
            case "size24":
            format.createFont(24);
            break;
            case "size28":
            format.createFont(28);
            break;
            case "Arial":
            format.setFont(command);
            break;
            case "Comic Sans MS":
            format.setFont(command);
            break;
            case "Times New Roman":
            format.setFont(command);
            break;
            case "Red":
            color.changeColor(command);
            break;
            case "White":
            color.changeColor(command);
            break;
            case "Blue":
            color.changeColor(command);
            break;
        }
    }

}