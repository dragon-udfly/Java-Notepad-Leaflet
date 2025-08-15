import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    GUI gui;

    public KeyHandler(GUI gui){
        this.gui= gui;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(!e.isShiftDown() && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S){
            gui.file.saveFile();
        }
        if(e.isShiftDown() && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S){
            gui.file.saveAsFile();
        }
        if(e.isAltDown() && e.getKeyCode() == KeyEvent.VK_F){
            gui.menuFile.doClick();
        }
        if(!e.isShiftDown() && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Z){
            gui.edit.undo();
        }

        if(e.isShiftDown() && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Z){
            gui.edit.redo();
        }

        if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_N){
            gui.file.newFile();
        }

        if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_O){
            gui.file.openFile();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
