package coingame;

public class Cooperator extends Individual {

    @Override
    boolean play() {

        this.coins--;

        return true;
    }

    @Override
    void calc(boolean oponentPlay) {}

    @Override
    Individual copy() {

        Cooperator clone = new Cooperator();
        return clone;
    }
    
}
