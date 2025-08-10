import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI{

    JFrame window;
    JTextArea textArea;
    public static void main(String args[]){
        new GUI();
    }

    public GUI(){
        // call methods below
        createWindow();
        createTextArea();
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
        window.add(textArea);
    }
}