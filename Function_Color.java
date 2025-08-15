import java.awt.Color;

public class Function_Color {
    GUI gui;

    public Function_Color(GUI gui){
        this.gui= gui;
    }

    public void changeColor(String color){
        switch(color){
            case "Red":
            gui.window.getContentPane().setBackground(Color.red);
            gui.textArea.setBackground(Color.red);
            gui.textArea.setForeground(Color.white);
            break;
            case "White":
            gui.window.getContentPane().setBackground(Color.white);
            gui.textArea.setBackground(Color.white);
            gui.textArea.setForeground(Color.black);
            break;
            case "Blue":
            gui.window.getContentPane().setBackground(new Color(3, 177, 252));
            gui.textArea.setBackground(new Color(3, 177, 252));
            gui.textArea.setForeground(new Color(0, 0, 30));
            break;
        }
    }
}
