package coingame;

public class Copycat extends Individual{
    
    public boolean lastPlay = true;

    @Override
    boolean play() {
        return this.lastPlay; 
    }
}
