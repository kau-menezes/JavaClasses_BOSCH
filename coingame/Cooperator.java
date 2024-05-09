package coingame;

public class Cooperator extends Individual {

    @Override
    boolean play() {
        return true;
    }

    @Override
    void calc(boolean oponentPlay) {}
    
}
