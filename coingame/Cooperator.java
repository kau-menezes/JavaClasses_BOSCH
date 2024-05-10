package coingame;

public class Cooperator extends Individual {

    @Override
    boolean play() {

        // custo da máquina + custo de sobrevivência
        // this.coins-= 2;

        return true;
    }

    @Override
    void calc(boolean oponentPlay) {}

    @Override
    Individual copy() {

        Cooperator clone = new Cooperator();
        return clone;
    }

    @Override
    String print() {
        return "Cooperator";
    }
    
}
