
package Model;

public class Memento {
    private final Position position;


    public Memento(Position position) {
        this.position = position;
    }
    
    
    public Position getPosition(){
        return position;
    }
}
