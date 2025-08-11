import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

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

        try{
            BufferedReader br= new BufferedReader(new FileReader(filePath + fileName));
            gui.textArea.setText("");
            String line= null;

            while((line= br.readLine()) != null){
                gui.textArea.append(line + "\n");
            }

            br.close();
        }catch(Exception e){
            System.out.println("FILE CAN NOT BE OPENED.");
        }
    }

    public void saveAsFile(){
        FileDialog fd= new FileDialog(gui.window, "Save As", FileDialog.SAVE);
        fd.setVisible(true);

        if(fd.getFile() != null){
            fileName= fd.getFile();
            filePath= fd.getDirectory();
            gui.window.setTitle(fileName);
        }

        try{
            FileWriter fw= new FileWriter(filePath + fileName);
            fw.write(gui.textArea.getText());
            fw.close();
        }catch(Exception e){
            System.out.println("FILE CAN NOT BE SAVED.");
        }
    }

    public void saveFile(){
        
    }
}
