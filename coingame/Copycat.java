package coingame;

public class Copycat extends Individual{
    
    public boolean lastPlay = true;

    @Override
    boolean play() {

        // custo da máquina + custo de sobrevivência
        this.coins-= 2;

        return this.lastPlay; 
    }

    @Override
    void calc(boolean oponentPlay) {
        this.lastPlay = oponentPlay;
    }

    @Override
    Individual copy() {

        Copycat clone = new Copycat();
        return clone;
    }

    @Override
    String print() {
        return "Copycat";
    }
}
