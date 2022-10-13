package Model;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Caretaker {

    private final Stack<Memento> mementoStack = new Stack<>();
    private Memento pop;

    public void addMemento(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {

        if (!mementoStack.empty()) {
            pop = mementoStack.pop();

        } else {
            JOptionPane.showMessageDialog(null, "Cannot Undo Anymore", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return pop;
    }
}
