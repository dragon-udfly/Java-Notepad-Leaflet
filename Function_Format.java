public class Function_Format {
    GUI gui;

    public Function_Format(GUI gui){
        this.gui= gui;
    }

    public void wordWrap(){
        if(!gui.wordWrapOn){
            gui.wordWrapOn= true;
        }
    }
}
