import javax.swing.JFrame;

public class GUI{

    JFrame window;
    public static void main(String args[]){
        new GUI();
    }

    public GUI(){
        // call methods below
        createWindow();

        // call method above
        window.setVisible(true);
    }

    public void createWindow(){
        window= new JFrame("Leaflet");
        window.setSize(900, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}