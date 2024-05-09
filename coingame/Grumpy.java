package coingame;

public class Grumpy extends Individual{

    public boolean tricked = false;

    @Override
    boolean play() {

        this.coins--;
        
        return (tricked == false ?  true :  false); 
    }

    @Override
    void calc(boolean oponentPlay) {
        if (oponentPlay == false) {
            this.tricked = true;
        }
    }
}
