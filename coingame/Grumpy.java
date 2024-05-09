package coingame;

public class Grumpy extends Individual{

    public boolean tricked = false;

    @Override
    boolean play() {
        return (tricked == false ?  true :  false); 
    }
}
