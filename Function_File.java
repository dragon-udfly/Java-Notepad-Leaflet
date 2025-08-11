import java.awt.FileDialog;
import java.io.File;

public class Function_File {
    GUI gui;
    String fileName, filePath;

    public Function_File(GUI gui){
        this.gui= gui;
    }

    public void newFile(){
        gui.textArea.setText(" ");
        gui.window.setTitle("New");
    }

    public void openFile(){
        FileDialog fd= new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);

        if(fd.getFile() != null){
            fileName= fd.getFile();
            filePath= fd.getDirectory();
            gui.window.setTitle(fileName);
        }
    }
}
