package coingame;

public class Cheater extends Individual {

    @Override
    boolean play() {

        // custo da máquina + custo de sobrevivência
        this.coins-= 2;
        
        return false;
    }

    @Override
    void calc(boolean oponentPlay) {}

    @Override
    Individual copy() {

        Cheater clone = new Cheater();
        return clone;
    }

    @Override
    String print() {
        return "Cheater";
    }
}
