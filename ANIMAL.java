import java.sql.SQLOutput;

public class ANIMAL {
    private int no_leg;
    private boolean tail;
    public ANIMAL(){

    }
    public ANIMAL(int no_leg, boolean tail) {
        this.no_leg = no_leg;
        this.tail = tail;
    }

    public int getNo_leg() {
        return no_leg;
    }

    public void setNo_leg(int no_leg) {
        this.no_leg = no_leg;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
public void makeSound(){
}
}
