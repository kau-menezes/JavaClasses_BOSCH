package coingame;

public class Cooperator extends Individual {

    @Override
    boolean play() {

        this.coins--;
        
        return true;
    }

    @Override
    void calc(boolean oponentPlay) {}
    
}
