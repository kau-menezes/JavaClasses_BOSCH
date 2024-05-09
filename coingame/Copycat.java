package coingame;

public class Copycat extends Individual{
    
    public boolean lastPlay = true;

    @Override
    boolean play() {

        this.coins--;
        
        return this.lastPlay; 
    }

    @Override
    void calc(boolean oponentPlay) {
        this.lastPlay = oponentPlay;
    }
}
