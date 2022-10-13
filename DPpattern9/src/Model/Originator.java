package Model;

import javax.swing.JOptionPane;

public class Originator {

    private Position position;
    private final Caretaker caretaker = new Caretaker();

    public void setPosition(Position position) {
        this.position = position;
        caretaker.addMemento(new Memento(position));
    }

    public Position getPosition() {
        return position;
    }
//  public void save(){
//        caretaker.addMemento(new Memento(position));
//  }

    public void undo() {
        if (this.position != null) {
         this.position = caretaker.getMemento().getPosition();
        
        } else {
            JOptionPane.showMessageDialog(null, "Move ball First", "Warning", JOptionPane.WARNING_MESSAGE);

        }
      
          
    }
}
