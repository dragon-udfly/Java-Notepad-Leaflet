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
        if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S){
            gui.file.saveFile();
        }else if(e.isShiftDown() && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S){
            gui.file.saveAsFile();
        }else if(e.isAltDown() && e.getKeyCode() == KeyEvent.VK_F){
            gui.menuFile.doClick();
        }else if(e.isControlDown() && e.getKeyChar() == KeyEvent.VK_Z){
            gui.edit.undo();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
