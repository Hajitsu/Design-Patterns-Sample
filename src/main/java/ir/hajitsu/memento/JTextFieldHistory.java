package ir.hajitsu.memento;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Objects;

public class JTextFieldHistory {
    public LinkedList<JTextFieldMemento> linkedList = new LinkedList<>();
    private JTextField field;

    public JTextFieldHistory(JTextField field) {
        Objects.requireNonNull(field);
        this.field = field;
    }

    public void save() {
        linkedList.push(new JTextFieldMemento(field.getText()));
        field.setText("");
    }

    public void undo() {
        if (linkedList.size() != 0) {
            field.setText(linkedList.pop().getText());
        } else {
            field.setText("");
        }
    }
}
