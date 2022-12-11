package ir.hajitsu.memento;

public class JTextFieldMemento {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public JTextFieldMemento(String text) {
        this.text = text;
    }
}
