public class Function_Format {
    GUI gui;

    public Function_Format(GUI gui){
        this.gui= gui;
    }

    public void wordWrap(){
        if(!gui.wordWrapOn){
            gui.wordWrapOn= true;
            gui.textArea.setLineWrap(true);
            gui.textArea.setWrapStyleWord(true);
            gui.itemWrap.setText("Word Wrap: On");
        }else{
            gui.wordWrapOn= false;
            gui.textArea.setLineWrap(false);
            gui.textArea.setWrapStyleWord(false);
            gui.itemWrap.setText("Word Wrap: Off");
        }
    }
}
