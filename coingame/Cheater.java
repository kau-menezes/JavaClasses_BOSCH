package coingame;

public class Cheater extends Individual {
    
    @Override
    boolean play() {

        this.coins--;
        
        return false;
    }

    @Override
    void calc(boolean oponentPlay) {}
}
