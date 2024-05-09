package coingame;

public class Cheater extends Individual {
    
    @Override
    boolean play() {
        return false;
    }

    @Override
    void calc(boolean oponentPlay) {}
}
